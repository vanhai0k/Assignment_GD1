package com.example.assignment_gd1.api;

import com.example.assignment_gd1.model.Comment;
import com.example.assignment_gd1.model.ReceSpMua;
import com.example.assignment_gd1.model.SPMua;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface CommentDelete {

    Gson gson = new GsonBuilder().setDateFormat("dd-MM-yyy").create();

    CommentDelete commentDelete = new Retrofit.Builder()
            .baseUrl("http://192.168.1.8:3000/api/")
//            .baseUrl("http://10.24.45.15:3000/api/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
            .create(CommentDelete.class);

    @DELETE("comment/delete/{id}")
    Call<Comment> deleteComment(@Path("id") String id);
}