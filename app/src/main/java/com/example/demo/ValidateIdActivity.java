package com.example.demo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.demo.models.Id;
import com.example.demo.services.IValidateId;
import com.example.demo.services.ServiceBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ValidateIdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validate_id2);

        IValidateId taskService = ServiceBuilder.buildService(IValidateId.class);
        Call<Id> call = taskService.validateId("", "");

        call.enqueue(new Callback<Id>() {

            @Override
            public void onResponse(Call<Id> request, Response<Id> response) {
            }

            @Override
            public void onFailure(Call<Id> request, Throwable t) {
            }
        });
    }
}
