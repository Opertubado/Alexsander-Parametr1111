package com.example.logonrm.alexsander.model;

import android.view.View;
import android.widget.TextView;

import com.example.logonrm.alexsander.R;

/**
 * Created by logonrm on 27/10/2017.
 */

public class ItemViewHolder {
    public final TextView tvNome;

    public ItemViewHolder(View view) {
        tvNome = (TextView)view.findViewById(R.id.tvItem);
    }
}
