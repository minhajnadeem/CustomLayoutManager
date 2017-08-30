package com.example.minhaj.customlayoutmanager;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by minhaj on 30/08/2017.
 */

class MyViewHolder extends RecyclerView.ViewHolder {
    public TextView textView;
    public MyViewHolder(View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.tv);
    }
}
