package com.example.demo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.demo.models.Id;
import com.example.demo.services.IValidateId;
import com.example.demo.services.ServiceBuilder;

import java.net.URISyntaxException;

import io.socket.client.IO;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ValidateIdActivity extends AppCompatActivity {

    private Socket socket;
    {
        try {
            IO.Options opts = new IO.Options();
            opts.forceNew = true;
            opts.reconnection = true;
            socket = IO.socket("BASEURL");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validate_id2);

        IValidateId taskService = ServiceBuilder.buildService(IValidateId.class);
        Call<Id> call = taskService.validateId("", "");

        call.enqueue(new Callback<Id>() {

            @Override
            public void onResponse(Call<Id> request, Response<Id> response) {
                
                socket.on(Socket.EVENT_CONNECT, new Emitter.Listener() {
                    @Override
                    public void call(Object... args) {}
                }).on("event", new Emitter.Listener() {
                    @Override
                    public void call(Object... args) {}
                }).on(Socket.EVENT_DISCONNECT, new Emitter.Listener() {
                    @Override
                    public void call(Object... args) {}
                });
                socket.connect();
            }

            @Override
            public void onFailure(Call<Id> request, Throwable t) {
            }
        });
    }
}
