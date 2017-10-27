package com.example.logonrm.alexsander.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.logonrm.alexsander.R;
import com.example.logonrm.alexsander.model.Item;
import com.example.logonrm.alexsander.model.ItemViewHolder;

import java.util.List;

public class ItemAdapter extends BaseAdapter{

    private Context context;
    private List<Item> items;
    public ItemAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position)
    {return items.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;

        ItemViewHolder holder;

        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
            holder = new ItemViewHolder(view);
            view.setTag(holder);
        }
        else {
            view = convertView;
            holder = (ItemViewHolder) view.getTag();
        }

        Item item = items.get(position);

        holder.tvNome.setText(item.getNome());

        return view;
    }
}
