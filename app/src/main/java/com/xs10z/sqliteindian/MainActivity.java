package com.xs10z.sqliteindian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

// Currently at 11:40 on Indian video part 2

public class MainActivity extends AppCompatActivity {

    //DatabaseHelper myDb;
    //test

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDb = new DatabaseHelper(this);
        myDb.insertData("foo","bar","fubar");
    }
}