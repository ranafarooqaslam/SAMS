package fastservices.teamsuite.module.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u0015\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00028\u0000H$\u00a2\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0015\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0013R&\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0019"}, d2 = {"Lfastservices/teamsuite/module/network/CallbackWrapper;", "T", "Lio/reactivex/observers/DisposableObserver;", "callback", "Lfastservices/teamsuite/module/network/NetworkCallback;", "(Lfastservices/teamsuite/module/network/NetworkCallback;)V", "ref", "Ljava/lang/ref/WeakReference;", "getRef", "()Ljava/lang/ref/WeakReference;", "setRef", "(Ljava/lang/ref/WeakReference;)V", "getErrorMessage", "", "responseBody", "Lokhttp3/ResponseBody;", "networkSuccess", "", "result", "(Ljava/lang/Object;)V", "onComplete", "onError", "e", "", "onNext", "app_debug"})
public abstract class CallbackWrapper<T extends java.lang.Object> extends io.reactivex.observers.DisposableObserver<T> {
    @org.jetbrains.annotations.NotNull()
    private java.lang.ref.WeakReference<fastservices.teamsuite.module.network.NetworkCallback<T>> ref;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.ref.WeakReference<fastservices.teamsuite.module.network.NetworkCallback<T>> getRef() {
        return null;
    }
    
    public final void setRef(@org.jetbrains.annotations.NotNull()
    java.lang.ref.WeakReference<fastservices.teamsuite.module.network.NetworkCallback<T>> p0) {
    }
    
    protected abstract void networkSuccess(T result);
    
    @java.lang.Override()
    public void onComplete() {
    }
    
    @java.lang.Override()
    public void onNext(T result) {
    }
    
    @java.lang.Override()
    public void onError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable e) {
    }
    
    private final java.lang.String getErrorMessage(okhttp3.ResponseBody responseBody) {
        return null;
    }
    
    public CallbackWrapper(@org.jetbrains.annotations.Nullable()
    fastservices.teamsuite.module.network.NetworkCallback<T> callback) {
        super();
    }
}