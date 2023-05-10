package com.example.a4th_year_android_timetable_app;

public class Posts {

    private final String name;
    private final String arrival_time;

    public Posts(String name, String arrival_time) {
        this.name = name;
        this.arrival_time = arrival_time;
    }

    public String getName() {
        return name;
    }

    public String getArrival_time() {
        return arrival_time;
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
