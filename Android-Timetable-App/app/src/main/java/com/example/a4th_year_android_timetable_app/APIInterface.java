package com.example.a4th_year_android_timetable_app;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/*
 * Author: Alexis Pechon
 * Student ID: x19358953
 * Date: 13/05/2023
 * File: APIInterface.java
*/


public interface APIInterface {
    @GET("v1/e428799a-a5f6-4f2c-b26c-5dc03e4e0548") //Getting the information from the API
    //@GET("/posts")
    Call<List<Posts>> getPosts();
}
