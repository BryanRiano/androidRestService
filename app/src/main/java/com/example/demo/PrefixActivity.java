package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.demo.models.Prefix;
import com.example.demo.services.IPrefixService;
import com.example.demo.services.ServiceBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PrefixActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prefix);

        IPrefixService taskService = ServiceBuilder.buildService(IPrefixService.class);
        Call<Prefix> call = taskService.getPrefix();

        call.enqueue(new Callback<Prefix>() {

            @Override
            public void onResponse(Call<Prefix> request, Response<Prefix> response) {
            }

            @Override
            public void onFailure(Call<Prefix> request, Throwable t) {
            }
        });
    }
}
