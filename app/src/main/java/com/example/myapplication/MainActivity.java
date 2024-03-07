package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    APIInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apiInterface = APIClient.getClient().create(APIInterface.class);


        Call<Photo> call = apiInterface.listRespos("123456");
        call.enqueue(new Callback<Photo>() {
            @Override
            public void onResponse(Call<Photo> call, Response<Photo> response) {
                Photo resource = response.body();
                Integer photos = Integer.valueOf(resource.getImgSrc());
                Log.e("image", String.valueOf(photos));
            }

            @Override
            public void onFailure(Call<Photo> call, Throwable t) {

            }
        });


    }
}