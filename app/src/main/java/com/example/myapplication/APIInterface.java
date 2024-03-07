package com.example.myapplication;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface APIInterface {
    @GET("rovers/curiosity/photos?api_key=V31ow1NxixINsPfMEZErIfH75QOKKpR3MtWmExIa&sol=1000&id={id}")
    Call<Photo> listRespos(@Path("id") String id);
}
