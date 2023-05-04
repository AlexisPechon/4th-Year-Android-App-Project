package com.example.a4th_year_android_timetable_app;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Results {
    @SerializedName("route_short_name")
    @Expose
    private final String routeShortName;
    @SerializedName("route_long_name")
    @Expose
    private final String routeLongName;

    public Results(String routeShortName, String routeLongName) {
        this.routeShortName = routeShortName;
        this.routeLongName = routeLongName;
    }

    public String getRouteShortName() {
        return routeShortName;
    }

    public String getRouteLongName() {
        return routeLongName;
    }
}
