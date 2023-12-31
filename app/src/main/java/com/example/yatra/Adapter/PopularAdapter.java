package com.example.yatra.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.yatra.Model.PopularModel;
import com.example.yatra.Model.TopDestinationModel;
import com.example.yatra.R;

import java.util.ArrayList;
import java.util.List;

public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.ViewHolder> {
    private Context context;
    private List<PopularModel> popularModelList;

    public PopularAdapter(Context context, List<PopularModel> popularModelList) {
        this.context = context;
        this.popularModelList = popularModelList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.popular_hotel, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context).load(popularModelList.get(position).getImg_url()).into(holder.pop_img);
        holder.hotel_name.setText(popularModelList.get(position).getName());
        holder.price.setText(popularModelList.get(position).getPrice());
//        holder.discount.setText(popularModelList.get(position).getDiscount());
        holder.pop_description.setText(popularModelList.get(position).getDescription());

    }

    @Override
    public int getItemCount() {
        return popularModelList.size();
    }

    //this method is called when the search query changes
    @SuppressLint("NotifyDataSetChanged")
//    public void setFilteredList(List<PopularModel> filteredList){
//        this.popularModelList = filteredList;
//        notifyDataSetChanged();
//    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView pop_img;
        TextView hotel_name, price, discount, pop_description;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            pop_img = itemView.findViewById(R.id.pop_img);
            hotel_name = itemView.findViewById(R.id.hotel_name);
            price =itemView.findViewById(R.id.price);
            discount =itemView.findViewById(R.id.discount);
            pop_description =itemView.findViewById(R.id.pop_description);
        }
    }
}
