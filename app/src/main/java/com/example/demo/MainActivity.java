package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.demo.models.Demo;
import com.example.demo.services.DemoService;
import com.example.demo.services.ServiceBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DemoService taskService = ServiceBuilder.buildService(DemoService.class);
        Call<Demo> call = taskService.getMessage();

        call.enqueue(new Callback<Demo>() {

            @Override
            public void onResponse(Call<Demo> request, Response<Demo> response) {
                ((TextView)findViewById(R.id.message)).setText(response.body().getTitle());
            }

            @Override
            public void onFailure(Call<Demo> request, Throwable t) {
                ((TextView)findViewById(R.id.message)).setText("Error in request");
            }
        });
    }
}
