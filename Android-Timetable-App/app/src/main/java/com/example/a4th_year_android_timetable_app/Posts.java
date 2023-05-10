package com.example.a4th_year_android_timetable_app;

public class Posts {

    private final String name;
    private final String arrival_time;
//    private final String departure_time;
//    private final String stop_name;

    public Posts(String name, String arrival_time, String departure_time, String stop_name) {
        this.name = name;
        this.arrival_time = arrival_time;
//        this.departure_time = departure_time;
//        this.stop_name = stop_name;
    }

    public String getName() {
        return name;
    }

    public String getArrival_time() {
        return arrival_time;
    }

//    public String getDeparture_time() {
//        return departure_time;
//    }
//
//    public String getStop_name() {
//        return stop_name;
//    }

    //
    // SPACE
    //

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
