package com.meryt.android.wordcount;

import java.util.Calendar;

import android.os.Bundle;

import com.roomorama.caldroid.CaldroidFragment;

public class CalendarFragment extends CaldroidFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setCaldroidListener(new CalendarListener(this));
    }
}
