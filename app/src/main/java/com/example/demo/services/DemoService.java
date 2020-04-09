package com.example.demo.services;

import com.example.demo.models.Demo;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DemoService {

    @GET("posts/1")
    Call<Demo> getMessage();
}
