package com.example.a4th_year_android_timetable_app;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/*
 * Author: Alexis Pechon
 * Student ID: x19358953
 * Date: 13/05/2023
 * File: RetrofitClient.java
 */

public class RetrofitClient {

    private static final String BASE_URL = "https://mocki.io/"; //Variable to hold the API link

    //List of the APIs that are being implemented
    //private static final String BASE_URL = "https://jsonplaceholder.typicode.com/"; //This was a placeholder cod

    //The commented code below are the APIs that were going to implemented into my project
    //but were left in due to severe technical limitation of my project.
    //private final String GET_GALWAY_BUS_URL = "https://galway-bus.apis.ie/api/groute/404/0";

    //List of the API calls and links being stored inside of a variable
    //private static final String GALWAY_BUS_URL = "https://galway-bus.apis.ie/";
    //private final String GET_NATIONAL_TRANSPORT_URL = "https://api.nationaltransport.ie/gtfsr/v2/gtfsr?format=json HTTP/1.1";
    //private final String GET_TRAIN_URL = "http://api.irishrail.ie/realtime/realtime.asmx/getAllStationsXML";

    //Retrofit instance
    private static Retrofit retrofit = null;

    public static APIInterface getRetrofitClient(){
        //Creating the RetrofitClient Helper method
        //This method is getting the RetrofitClient method which is accessible
        //through the Retrofit Libraries
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(APIInterface.class);
    }
}
