package com.example.a4th_year_android_timetable_app;

import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;

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
//        holder.tvBody.setText(postList.get(position).getDeparture_time());
//        holder.tvBody.setText(postList.get(position).getStop_name());

    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvTitle;
        TextView tvBody;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle); //Gets the id tvTitle in the layout file
            tvBody = itemView.findViewById(R.id.tvBody); //Gets the id tvBody in the layout file
        }

    }
}
