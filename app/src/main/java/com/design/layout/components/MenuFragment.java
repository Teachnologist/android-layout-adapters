package com.design.layout.components;

import android.os.Bundle;
import android.widget.GridView;

import androidx.leanback.app.BrowseSupportFragment;

import com.design.layout.R;
import com.design.layout.adapters.GridviewTest;
import com.design.layout.adapters.GridviewText;

import java.util.ArrayList;

public class MenuFragment extends BrowseSupportFragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        System.out.println("on activity create menu");
     //   GridView gv = new GridView(requireActivity());
        GridView gv = (GridView) requireActivity().findViewById(R.id.menu_test);
        System.out.println("Grid Created");

        ArrayList<String> nav_menu = new ArrayList<>();
        nav_menu.add("Column 1");
        nav_menu.add("Column 2");
        nav_menu.add("Column 3");
        nav_menu.add("Column 4");
       // GridviewText adapter1 = new GridviewText(requireActivity(),R.layout.menu_element,nav_menu);
        GridviewTest adapter1 = new GridviewTest(requireActivity(),nav_menu);
        gv.setAdapter(adapter1);
    }
}
