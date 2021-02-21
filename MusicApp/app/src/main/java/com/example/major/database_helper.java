package com.example.major;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Create by MSOFT on 4/21/2020.
*/
import androidx.annotation.Nullable;

public class database_helper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="register.db";
    public static final String TABLE_NAME="register";
    public static final String COL_1="ID";
    public static final String COL_2="name_surname";
    public static final String COL_3="e_mail";
    public static final String COL_4="user_password";
    public static final String COL_5="confirm_password";

    public database_helper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE" +TABLE_NAME+ "(ID INTEGER PRIMARY KEY AUTOINCREMENT, name_surname, e_mail, user_password, confirm_password)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS"+TABLE_NAME); //Drop older table if exists.
        onCreate(db);


    }
}
