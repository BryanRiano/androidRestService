package com.example.demo.services;

import com.example.demo.models.FaceId;

import retrofit2.Call;
import retrofit2.http.POST;

public interface IFaceIdService {

    @POST("")
    Call<FaceId> setResponseFaceId();
}
