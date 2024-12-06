package com.github.florent37.rxgps;

import android.Manifest;
import android.app.Activity;
import android.location.Address;
import android.location.Location;

import androidx.fragment.app.FragmentActivity;

import com.patloew.rxlocation.RxLocation;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.location.LocationRequest;
import com.tbruyelle.rxpermissions3.RxPermissions;

import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.SingleSource;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;

@SuppressWarnings("MissingPermission")
public class RxGps {

    private final WeakReference<Activity> activityReference;
    private final RxLocation rxLocation;
    private final RxPermissions rxPermissions;
    private long interval = 5000l;

    public RxGps(RxLocation rxLocation, Activity activity) {
        this.rxLocation = rxLocation;
        this.rxPermissions = new RxPermissions((FragmentActivity) activity);
        this.activityReference = new WeakReference<Activity>(activity);
    }

    public RxGps(Activity activity) {
        this(new RxLocation(activity), activity);
        this.rxLocation.setDefaultTimeout(15, TimeUnit.SECONDS);
    }

    public RxGps setInterval(long interval) {
        this.interval = interval;
        return this;
    }

    private Observable<Location> location(LocationRequest locationRequest, String... permissions) {
        return checkPlayServicesAvailable()
                .flatMap((Function<Boolean, ObservableSource<Boolean>>) aBoolean -> request(permissions))
                .flatMap((Function<Boolean, ObservableSource<Location>>) aBoolean -> rxLocation.location().updates(locationRequest));
    }

    private Observable<Boolean> request(String... permissions) {
        return rxPermissions.request(permissions)
                .flatMap((Function<Boolean, ObservableSource<Boolean>>) permit -> {
                    if (!permit) {
                        return Observable.error(new PermissionException());
                    }
                    return Observable.just(permit);
                });
    }

    public Observable<Location> locationHight() {
        return location(LocationRequest.create()
                        .setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY)
                        .setInterval(interval),
                Manifest.permission.ACCESS_FINE_LOCATION
        );
    }

    public Observable<Location> locationLowPower() {
        return location(LocationRequest.create()
                        .setPriority(LocationRequest.PRIORITY_LOW_POWER)
                        .setInterval(interval),
                Manifest.permission.ACCESS_COARSE_LOCATION
        );
    }

    public Observable<Location> locationBalancedPowerAcuracy() {
        return location(LocationRequest.create()
                        .setPriority(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY)
                        .setInterval(interval),
                Manifest.permission.ACCESS_COARSE_LOCATION);
    }

    public Observable<Location> locationNoPower() {
        return location(LocationRequest.create()
                        .setPriority(LocationRequest.PRIORITY_NO_POWER)
                        .setInterval(interval),
                Manifest.permission.ACCESS_COARSE_LOCATION);
    }

    public Maybe<Location> lastLocation() {
        return checkPlayServicesAvailable()
                .flatMap((Function<Boolean, ObservableSource<Boolean>>) aBoolean -> request(Manifest.permission.ACCESS_COARSE_LOCATION))
                .flatMapMaybe((Function<Boolean, MaybeSource<Location>>) aBoolean -> rxLocation.location().lastLocation())
                .lastElement();
    }

    public Maybe<Location> lastLocationIfExists() {
        return checkPlayServicesAvailable()
            .flatMap((Function<Boolean, ObservableSource<Boolean>>) aBoolean -> request(Manifest.permission.ACCESS_COARSE_LOCATION))
            .flatMapSingle((Function<Boolean, SingleSource<Boolean>>) aBoolean -> rxLocation.location().isLocationAvailable())
            .flatMapMaybe((Function<Boolean, MaybeSource<Location>>) isExists -> {
                if (isExists) {
                    return rxLocation.location().lastLocation();
                } else {
                    throw new LastLocationUnavailableException();
                }
            })
            .lastElement();
    }

    private Observable<Boolean> checkPlayServicesAvailable() {
        return Observable.create(new ObservableOnSubscribe<Boolean>() {
            @Override
            public void subscribe(ObservableEmitter<Boolean> e) throws Exception {
                final Activity activity = activityReference.get();
                if (activity != null) {
                    final GoogleApiAvailability apiAvailability = GoogleApiAvailability.getInstance();
                    final int status = apiAvailability.isGooglePlayServicesAvailable(activity);

                    if (status != ConnectionResult.SUCCESS) {
                        e.onError(new PlayServicesNotAvailableException());
                    } else {
                        e.onNext(true);
                        e.onComplete();
                    }
                }
            }
        });
    }

    public Maybe<Address> geocoding(Location location) {
        return rxLocation.geocoding().fromLocation(location);
    }

    public static class PermissionException extends Exception {
        public PermissionException() {
            super("Can't access location without permission");
        }
    }

    public static class PlayServicesNotAvailableException extends Exception {
        public PlayServicesNotAvailableException() {
            super("Make sure play services are installed in your device");
        }
    }

    public static class LastLocationUnavailableException extends Exception {
        public LastLocationUnavailableException() {
            super("Last location not found");
        }
    }
}
