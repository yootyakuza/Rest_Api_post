package com.example.support.rest_api.Retrofit;

public class ApiKioskUtils {

    private ApiKioskUtils(){
    }

    public static ApiServiceKiosk_test getApiServiceKiosk(String url){
        return RetrofitClient.getClient(url).create(ApiServiceKiosk_test.class);
    }
}
