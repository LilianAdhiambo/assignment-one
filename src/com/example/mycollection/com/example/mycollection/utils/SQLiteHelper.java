package com.example.mycollection.com.example.mycollection.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by lilian on 10/10/14.
 */
public class SQLiteHelper extends SQLiteOpenHelper {

    //static variables

    public static final int DATABASE_VERSION=1;
    public static final String DATABASE_NAME="validation table";
    public static final String TABLE__NAME="validation";
    Constants myconstants;



public SQLiteHelper (Context context){
    super(context,DATABASE_NAME,null,DATABASE_VERSION);
}

    public void onCreate(SQLiteDatabase db){
        String CREATE_TABLE_VALIDATION="create table" + myconstants.KEY_ID +"integer key" + myconstants.KEY_USERNAME + "text" +
                myconstants.KEY_Email + "text" + myconstants.KEY_fullName + "text" + myconstants.KEY_PASSWORD + "text");
                db.execSQL(CREATE_TABLE_VALIDATION);
    }

}
