package com.gita.viewpager;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by adv on 3/14/2017.
 */
public class CustomAdapter extends RecyclerView.Adapter {
    private ArrayList<MyData> data;
    public CustomAdapter(ArrayList<MyData> list) {
        this.data=list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.design_list, parent, false);
        ViewHolder vh = new ViewHolder(v);



        return vh;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        TextView title = (TextView) holder.itemView.findViewById(R.id.name);
        TextView desc = (TextView) holder.itemView.findViewById(R.id.location);
        TextView pass=(TextView)holder.itemView.findViewId(R.id.pass) ;
        title.setText(data.get(position).getName());
        desc.setText(data.get(position).getLocation());
        pass.setText(data.get(position).getPassword());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        View view;


        public ViewHolder(View v) {
            super(v);
            view=v;
        }
    }
}
