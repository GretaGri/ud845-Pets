package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Greta Grigutė on 2018-06-10.
 */
public class PetDbHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "Pets.db";
    private static final String COMMA_SEP = ", ";
    private static final String SQL_CREATE_ENTRIES = "CREATE TABLE " + PetContract.PetEntry.TABLE_NAME
            + " (" + PetContract.PetEntry._ID + "INTEGER PRIMARY KEY" + COMMA_SEP + PetContract.PetEntry.COLUMN_PET_NAME
            + "TEXT" + COMMA_SEP + PetContract.PetEntry.COLUMN_PET_BREED + "TEXT" + COMMA_SEP
            + PetContract.PetEntry.COLUMN_PET_GENDER + "INTEGER" + COMMA_SEP
            + PetContract.PetEntry.COLUMN_PET_WEIGHT + "INTEGER" +")";

    public PetDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL(SQL_CREATE_ENTRIES);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    onCreate(db);
    }
}
