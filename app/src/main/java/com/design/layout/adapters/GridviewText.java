package com.design.layout.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.design.layout.R;

import java.util.ArrayList;

public class GridviewText extends BaseAdapter implements View.OnClickListener {


    Context context;
    private ArrayList item;
    private LayoutInflater inflater;

    public GridviewText(Context applicationContext, ArrayList items) {

        context = applicationContext;
        this.item = items;
         this.inflater = LayoutInflater.from(applicationContext);
    }


    public int getCount(){

        return this.item.size();
    }

    public Object getItem(int i){
        return this.item.get(i);
    }


    public long getItemId(int i){
        return 0l;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder viewHolder;

        view = this.inflater.inflate(R.layout.menu_element,viewGroup, false);

      //  view = new TextView(context);
                viewHolder = new ViewHolder(view);

        view.setId(i);
        viewHolder.itemView.setFocusable(true);
        viewHolder.itemView.setClickable(true);

        viewHolder.itemView.setText(this.item.get(i).toString());
        view.setOnClickListener(this);
//view.setOnClickListener(this);
        return view;
    }

    private class ViewHolder {
        TextView itemView;

        public ViewHolder(View view) {
            itemView = (TextView) view.findViewById(R.id.textviewid);
        }
    }

    @Override
    public void onClick(View v) {
        System.out.println("CLICKED: "+v.getId());
        switch(v.getId()){
            case 0:
                System.out.println("GO HOME");
                break;
            case 1:
                System.out.println("SETTINGS");
               /* Intent myIntent = new Intent(context, NextActivity.class);
                myIntent.putExtra("key", "Hello from old activity"); //Optional parameters
                context.startActivity(myIntent);*/
                break;
        }

    }


}
