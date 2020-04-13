package com.example.demo.services;

import com.example.demo.models.Prefix;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IPrefixService {
    @GET
    Call<Prefix> getPrefix();
}
