package com.meryt.android.wordcount.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class WordcountDbHelper extends SQLiteOpenHelper {
    // If you change the schema, increment the version number.
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Wordcount.db";

    public WordcountDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(WordcountContract.SQL_CREATE_PROJECTS);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO
    }
}