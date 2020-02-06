package com.design.layout.components;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

import androidx.fragment.app.FragmentActivity;

import com.design.layout.R;
import com.design.layout.adapters.GridviewText;

import java.util.ArrayList;

public class MenuActivity extends FragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_template);



    }

}
