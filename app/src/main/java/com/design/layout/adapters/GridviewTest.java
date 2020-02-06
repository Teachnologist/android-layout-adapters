package com.design.layout.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.design.layout.R;

import java.util.ArrayList;
import java.util.List;

public class GridviewTest extends ArrayAdapter<String> {

    private Context mContext;
    private List<String> mItems = new ArrayList<>();
    private LayoutInflater INFLATOR;

    public GridviewTest(Context context, ArrayList<String> list){
        super(context,0,list);

        mContext = context;
        mItems = list;
        INFLATOR = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
       // View gridItem = convertView;

        convertView = INFLATOR.inflate(R.layout.menu_element,parent,false);



        TextView itemView = (TextView) convertView.findViewById(R.id.textviewid);

        String value = mItems.get(position);
        itemView.setId(position);
        itemView.setText(value.toUpperCase());
        itemView.setFocusable(true);

        if(position == 0) {
            itemView.requestFocus();
        }

        if(position == mItems.size() - 1) {
            itemView.setNextFocusRightId(0);
            itemView.setNextFocusDownId(R.id.test);
        }
        return convertView;
    }

}
