package com.example.demo.models;

import com.google.gson.annotations.SerializedName;

public class Id {

    @SerializedName("docfront")
    private String docfront;

    @SerializedName("docback")
    private String docback;

    @SerializedName("response")
    private String Response;

    public String getResponse() {
        return Response;
    }

}
