package com.xs10z.sqliteindian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.filament.View;

import java.util.Locale;

// Currently at 11:40 on Indian video part 2

public class MainActivity extends AppCompatActivity {

    DatabaseHelper myDb;
    EditText editName, editSurname, editMarks;
    Button btnAddData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDb = new DatabaseHelper(this);

        editName = (EditText) findViewById(R.id.et_name);
        editSurname = (EditText) findViewById(R.id.et_surname);
        editMarks = (EditText) findViewById(R.id.et_marks);
        btnAddData = (Button) findViewById(R.id.btn_add);

        AddData();

        //DatabaseHelper myDb = new DatabaseHelper(this);
        //myDb.insertData("foo","bar","1");
    }

    public void AddData() {
        btnAddData.setOnClickListener(
                new android.view.View.OnClickListener() {
                    @Override
                    public void onClick(android.view.View v) {

                        boolean isInserted = myDb.insertData(editName.getText().toString(),
                                editSurname.getText().toString(),
                                editMarks.getText().toString());

                        if (isInserted = true) {
                            Toast.makeText(MainActivity.this, "Data Inserted", Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(MainActivity.this, "Data NOT Inserted", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
    }
}