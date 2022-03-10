package com.fastservices.sams.network;

import org.json.JSONObject;

import fastservices.teamsuite.module.network.NetworkCallback;
import retrofit2.Response;

public class APIError {

    public static void handleError(int code, Response response, NetworkCallback callback) {
        if (code == 400) {
            if (response != null && response.errorBody() != null) {
                try {
                    JSONObject error = new JSONObject(response.errorBody().string());
                    callback.networkFailed(error.getString("error_description"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
