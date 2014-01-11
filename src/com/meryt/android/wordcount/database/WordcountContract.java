package com.meryt.android.wordcount.database;

import android.provider.BaseColumns;

public final class WordcountContract {

    public static abstract class Project implements BaseColumns {
        public static final String TABLE_NAME = "projects";
        public static final String COLUMN_NAME_PROJECT_ID = "projectId";
        public static final String COLUMN_NAME_TITLE = "title";
        public static final String COLUMN_NAME_DESCRIPTION = "description";

    }

    static final String SQL_CREATE_PROJECTS = "CREATE TABLE " + Project.TABLE_NAME + " (" +
            Project._ID + " INTEGER PRIMARY KEY, " +
            Project.COLUMN_NAME_PROJECT_ID + " TEXT, " +
            Project.COLUMN_NAME_TITLE + " TEXT, " +
            Project.COLUMN_NAME_DESCRIPTION + " TEXT " +
            ") ";

    static final String SQL_DELETE_PROJECTS = "DROP TABLE IF EXISTS " + Project.TABLE_NAME;
}
