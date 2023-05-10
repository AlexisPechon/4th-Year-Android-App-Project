package com.example.a4th_year_android_timetable_app;

import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;

import org.w3c.dom.Text;

import java.util.List;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.ViewHolder> {
    //This class adds onto the items for the Recycler View

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
        holder.tvTitle.setText(postList.get(position).getName());
        holder.tvBody.setText(postList.get(position).getArrival_time());
        holder.tvSubBody.setText(postList.get(position).getDeparture_time());
        holder.tvLocationBody.setText(postList.get(position).getStop_name());

        holder.tvSubLocationBody.setText(postList.get(position).getSecond_stop_name());
        holder.tvSubArrivalBody.setText(postList.get(position).getSecond_arrival_time());
        holder.tvSubDepartureBody.setText(postList.get(position).getSecond_departure_time());


    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvTitle;
        TextView tvBody;
        TextView tvSubBody;
        TextView tvLocationBody;

        TextView tvSubLocationBody;
        TextView tvSubArrivalBody;
        TextView tvSubDepartureBody;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle); //Gets the id tvTitle in the layout file
            tvBody = itemView.findViewById(R.id.tvBody); //Gets the id tvBody in the layout file
            tvSubBody = itemView.findViewById(R.id.tvSubBody);
            tvLocationBody = itemView.findViewById(R.id.tvLocationBody);

            tvSubLocationBody = itemView.findViewById((R.id.tvSubLocationBody));
            tvSubArrivalBody = itemView.findViewById((R.id.tvSubArrivalBody));
            tvSubDepartureBody = itemView.findViewById(R.id.tvSubDepartureBody);
        }
    }
}
