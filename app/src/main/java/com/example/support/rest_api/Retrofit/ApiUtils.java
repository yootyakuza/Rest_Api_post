package com.example.support.rest_api.Retrofit;

public class ApiUtils {

    private ApiUtils() {}

    public static final String BASE_URL = "http://jsonplaceholder.typicode.com/";

    public static APISERVICE getAPISERVICE(String api) {

        return RetrofitClient.getClient(api).create(APISERVICE.class);
    }
}
