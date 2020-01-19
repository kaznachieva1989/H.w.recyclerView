package com.example.hwrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {

    ArrayList<String> data;

    public MainAdapter() {
        data = new ArrayList<>();
        data = new ArrayList<>();
        data.add("Kaznahieva Nurzhamal 1");
        data.add("Aliev Agahan 2");
        data.add("Alieva Malika 3");
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.viewholder_main, parent, false);
        MainViewHolder viewHolder = new MainViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.setText(data.get(position % data.size()));
    }

    @Override
    public int getItemCount() {
        return 1000;
    }

    public void addText(String text) {
        data.add(text);
        notifyDataSetChanged();
    }
}
