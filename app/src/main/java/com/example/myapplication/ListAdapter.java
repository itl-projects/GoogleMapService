package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder> {

    private List<DataClass> moviesList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView textview2, textView3, textView4;

        public MyViewHolder(View view) {
            super(view);
            textview2 = (TextView) view.findViewById(R.id.textView2);
            textView3 = (TextView) view.findViewById(R.id.textView3);
            textView4 = (TextView) view.findViewById(R.id.textView4);
        }
    }


    public ListAdapter(List<DataClass> moviesList) {
        this.moviesList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listitems, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        DataClass list = moviesList.get(position);
        holder.textview2.setText(list.getName());
        holder.textView3.setText(list.getId());
        holder.textView4.setText(list.getPhn());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}