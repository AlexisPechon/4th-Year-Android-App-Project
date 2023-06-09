package com.example.a4th_year_android_timetable_app;

import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;

import org.w3c.dom.Text;

import java.util.List;

/*
 * Author: Alexis Pechon
 * Student ID: x19358953
 * Date: 13/05/2023
 * File: PostsAdapter.java
 */

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.ViewHolder> {
    //This class adds onto the items for the Recycler View.
    //The purpose of this class is to display the information from the API
    //onto the mobile application using the variables that were created inside the
    //Posts.java class and the IDs inside of the list_item.xml file in the res file.

    private final List<Posts> postList;

    public PostsAdapter(List<Posts> postList) {
        this.postList = postList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        //Inflating the layout
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //Irish Version
        holder.tvIrishTitle.setText(postList.get(position).getIrish_language());
        holder.tvIrishBody.setText(postList.get(position).getIrish_name());
        holder.tvIrishLocationBody.setText(postList.get(position).getIrish_stop_name());
        holder.tvIrishArrivalBody.setText(postList.get(position).getIrish_arrival_time());
        holder.tvIrishDepartureBody.setText(postList.get(position).getIrish_departure_time());
        holder.tvIrishRouteIdBody.setText(postList.get(position).getIrish_route_id());

        //Irish Sub Version
        holder.tvIrishSubLocationBody.setText((postList).get(position).getIrish_second_stop_name());
        holder.tvIrishSubArrivalBody.setText((postList).get(position).getIrish_second_arrival_time());
        holder.tvIrishSubDepartureBody.setText(postList.get(position).getIrish_second_departure_time());
        holder.tvIrishSubRouteIdBody.setText(postList.get(position).getIrish_second_route_id());

        //English Version
        holder.tvEnglishBody.setText(postList.get(position).getEnglish_language());
        holder.tvTitle.setText(postList.get(position).getName());
        holder.tvBody.setText(postList.get(position).getArrival_time());
        holder.tvSubBody.setText(postList.get(position).getDeparture_time());
        holder.tvLocationBody.setText(postList.get(position).getStop_name());
        holder.tvRouteIdBody.setText(postList.get(position).getRoute_id());

        //English Sub Version
        holder.tvSubLocationBody.setText(postList.get(position).getSecond_stop_name());
        holder.tvSubArrivalBody.setText(postList.get(position).getSecond_arrival_time());
        holder.tvSubDepartureBody.setText(postList.get(position).getSecond_departure_time());
        holder.tvSubRouteIdBody.setText((postList).get(position).getSecond_route_id());


    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        //Irish Variables
        TextView tvIrishTitle;
        TextView tvIrishBody;
        TextView tvIrishArrivalBody;
        TextView tvIrishDepartureBody;
        TextView tvIrishLocationBody;
        TextView tvIrishRouteIdBody;

        //Irish Sub Version
        TextView tvIrishSubBody;
        TextView tvIrishSubLocationBody;
        TextView tvIrishSubArrivalBody;
        TextView tvIrishSubDepartureBody;
        TextView tvIrishSubRouteIdBody;

        //English Variables
        TextView tvEnglishBody;
        TextView tvTitle;
        TextView tvBody;
        TextView tvLocationBody;
        TextView tvRouteIdBody;

        //English Sub Variables
        TextView tvSubBody;
        TextView tvSubLocationBody;
        TextView tvSubArrivalBody;
        TextView tvSubDepartureBody;
        TextView tvSubRouteIdBody;

        public ViewHolder(@NonNull View itemView){
            super(itemView);

            //Irish Variables
            tvIrishTitle = itemView.findViewById(R.id.tvIrishTitle);
            tvIrishBody = itemView.findViewById(R.id.tvIrishBody);
            tvIrishLocationBody = itemView.findViewById(R.id.tvIrishLocationBody);
            tvIrishArrivalBody = itemView.findViewById(R.id.tvIrishArrivalBody);
            tvIrishDepartureBody = itemView.findViewById(R.id.tvIrishDepartureBody);
            tvIrishRouteIdBody = itemView.findViewById(R.id.tvIrishRouteIdBody);

            //Irish Sub Variables
            tvIrishSubLocationBody = itemView.findViewById(R.id.tvIrishSubLocationBody);
            tvIrishSubArrivalBody = itemView.findViewById(R.id.tvIrishSubArrivalBody);
            tvIrishSubDepartureBody = itemView.findViewById(R.id.tvIrishSubDepartureBody);
            tvIrishSubRouteIdBody = itemView.findViewById(R.id.tvIrishSubRouteIdBody);

            //English Variables
            tvEnglishBody = itemView.findViewById(R.id.tvEnglishBody);
            tvTitle = itemView.findViewById(R.id.tvTitle); //Gets the id tvTitle in the layout file
            tvBody = itemView.findViewById(R.id.tvBody); //Gets the id tvBody in the layout file
            tvSubBody = itemView.findViewById(R.id.tvSubBody);
            tvLocationBody = itemView.findViewById(R.id.tvLocationBody);
            tvRouteIdBody = itemView.findViewById(R.id.tvRouteIdBody);

            //English Sub Variables
            tvSubLocationBody = itemView.findViewById((R.id.tvSubLocationBody));
            tvSubArrivalBody = itemView.findViewById((R.id.tvSubArrivalBody));
            tvSubDepartureBody = itemView.findViewById(R.id.tvSubDepartureBody);
            tvSubRouteIdBody = itemView.findViewById((R.id.tvSubRouteIdBody));
        }
    }
}
