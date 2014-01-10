package com.meryt.android.wordcount;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import com.meryt.android.wordcount.adapter.ProjectListAdapter;
import com.meryt.android.wordcount.model.Project;

public class ProjectListFragment extends ListFragment {

    private ArrayAdapter<Project> adapter;
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        adapter = new ProjectListAdapter(view.getContext(), R.layout.project_list_entry);
        setListAdapter(adapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.basic_list, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        populateProjectList();
    }

    private void populateProjectList() {

    }
}
