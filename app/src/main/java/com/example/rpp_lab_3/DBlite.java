package com.example.rpp_lab_3;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBlite extends SQLiteOpenHelper {

    public static final int VERSION = 1;

    public static final String DATABASE_NAME = "Lab_3";
    public static final String TABLE_NAME = "Students";

    public static final String KEY_ID = "_id";
    public static final String KEY_FIO = "FIO";
    public static final String KEY_DATE= "Date";


    public DBlite( Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + "(" + KEY_ID
                + " integer primary key," + KEY_FIO + " text," + KEY_DATE + " text" + ")");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
       // db.execSQL("drop table if exists " + TABLE_NAME);
        db.execSQL("drop table if exists " + TABLE_NAME);

        onCreate(db);



    }
}
