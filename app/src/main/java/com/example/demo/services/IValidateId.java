package com.example.demo.services;

import com.example.demo.models.Id;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface IValidateId {

    @FormUrlEncoded
    @POST("")
    Call<Id> validateId(@Field("docfront") String docfront, @Field("docback") String docback);
}
