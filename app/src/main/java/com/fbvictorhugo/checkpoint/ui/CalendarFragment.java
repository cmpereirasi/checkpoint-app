package com.fbvictorhugo.checkpoint.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fbvictorhugo.checkpoint.R;

/**
 * By fbvictorhugo on 07/06/16.
 */
public class CalendarFragment extends Fragment {

    public static final String FRAGMENT_TAG = CalendarFragment.class.getName();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_calendar, container, false);
    }

}
