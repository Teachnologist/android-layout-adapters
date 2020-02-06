package com.design.layout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.leanback.app.BrowseSupportFragment;

import com.design.layout.adapters.GridviewTest;

import java.util.ArrayList;

public class HomeActivityFragment extends BrowseSupportFragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        System.out.println("on activity create view happens");

    }

}
