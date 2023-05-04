package com.example.a4th_year_android_timetable_app;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Posts {

    private final String title;
    private final String body;

    public Posts(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    //    @SerializedName("route_short_name")
//    @Expose
//    private final String routeShortName;
//    @SerializedName("route_long_name")
//    @Expose
//    private final String routeLongName;
//
//    public Posts(String routeShortName, String routeLongName) {
//        this.routeShortName = routeShortName;
//        this.routeLongName = routeLongName;
//    }
//
//    public String getRouteShortName() {
//        return routeShortName;
//    }
//
//    public String getRouteLongName() {
//        return routeLongName;
//    }
}
