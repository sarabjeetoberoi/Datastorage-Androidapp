package com.androidexample.datastorage.data;

import com.androidexample.datastorage.data.PetContract.PetEntry;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
// this is for creating database and manage that i.e updation and all
public class PetDbHelper extends SQLiteOpenHelper{
    public static final String LOG_TAG = PetDbHelper.class.getSimpleName();
    // NAME OF DATABASE FILE
    private static final String DATABASE_NAME="shelter.db";

  private static final int DATABASE_VERSION=1;

//constructor
    public PetDbHelper(Context context)

    {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
          String SQL_CREATE_PETS_TABLE =  "CREATE TABLE " + PetEntry.TABLE_NAME + "("
                                + PetEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                                + PetEntry.COLUMN_PET_NAME + " TEXT NOT NULL, "
                                 + PetEntry.COLUMN_PET_BREED + " TEXT, "
                                 + PetEntry.COLUMN_PET_GENDER + " INTEGER NOT NULL, "
                  + PetEntry.COLUMN_PET_WEIGHT + " INTEGER NOT NULL DEFAULT 0)";
        db.execSQL(SQL_CREATE_PETS_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
