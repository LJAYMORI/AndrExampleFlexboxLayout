package com.example.jonguk.andrexampleflexboxlayout;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

class ItemViewHolder extends RecyclerView.ViewHolder {
    private TextView mTextView;

    ItemViewHolder(View itemView) {
        super(itemView);
        mTextView = (TextView) itemView.findViewById(R.id.item_name);
    }

    void bind(String text) {
        mTextView.setText(text);
    }
}