package com.example.demo.services;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceBuilder {
    private static final String URL = "https://jsonplaceholder.typicode.com/";
    private static Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl(URL).addConverterFactory(GsonConverterFactory.create());

    private static Retrofit retrofit = builder.build();

    public static<S> S buildService(Class<S> ServiceType){
        return retrofit.create(ServiceType);
    }
}
