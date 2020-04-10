package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.demo.models.FaceId;
import com.example.demo.services.IFaceIdService;
import com.example.demo.services.ServiceBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FaceIdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face_id);

        IFaceIdService taskService = ServiceBuilder.buildService(IFaceIdService.class);
        Call<FaceId> call = taskService.setResponseFaceId();

        call.enqueue(new Callback<FaceId>() {

            @Override
            public void onResponse(Call<FaceId> request, Response<FaceId> response) {
            }

            @Override
            public void onFailure(Call<FaceId> request, Throwable t) {
            }
        });
    }
}
