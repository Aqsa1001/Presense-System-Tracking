package com.razi.gallery;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListOnlineViewHolder extends RecyclerView.ViewHolder {
    public TextView txtEmail;

    public ListOnlineViewHolder(@NonNull View itemView) {
        super(itemView);
        txtEmail=(TextView) itemView.findViewById(R.id.txtEmail);
    }
}
