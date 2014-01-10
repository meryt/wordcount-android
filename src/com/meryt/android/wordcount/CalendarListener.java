package com.meryt.android.wordcount;

import java.util.Date;

import android.view.View;
import com.roomorama.caldroid.CaldroidFragment;
import com.roomorama.caldroid.CaldroidListener;

public class CalendarListener extends CaldroidListener {
    private CaldroidFragment fragment;

    public CalendarListener(CaldroidFragment fragment) {
        this.fragment = fragment;
    }

    @Override
    public void onSelectDate(Date date, View view) {
        fragment.setBackgroundResourceForDate(R.color.antique_brass, date);
        fragment.refreshView();
    }
}
