package com.meryt.android.wordcount;

import android.view.Menu;

import android.content.Intent;
import android.view.MenuItem;

import android.support.v4.app.FragmentTransaction;

import android.os.Bundle;

import android.support.v4.app.FragmentActivity;


public class ProjectsActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_projects);

        if (savedInstanceState == null) {
            ProjectListFragment listFragment = new ProjectListFragment();
            FragmentTransaction t = getSupportFragmentManager().beginTransaction();
            t.replace(R.id.projects_main, listFragment);
            t.commit();

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.calendar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_calendar:
                Intent calendarIntent = new Intent(this, CalendarActivity.class);
                startActivity(calendarIntent);
                return true;
            case R.id.action_projects:
                Intent projectsIntent = new Intent(this, ProjectsActivity.class);
                startActivity(projectsIntent);
                return true;
            case R.id.action_settings:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
