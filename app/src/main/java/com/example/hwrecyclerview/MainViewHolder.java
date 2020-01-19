package com.example.hwrecyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {

    private TextView mainText;

    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        mainText = itemView.findViewById(R.id.vhm_main_text);
    }

    public void setText(String text) {
        mainText.setText(text);
    }
}
