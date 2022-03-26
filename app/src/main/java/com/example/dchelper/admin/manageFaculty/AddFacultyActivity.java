package com.example.dchelper.admin.manageFaculty;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dchelper.R;
import com.google.firebase.database.FirebaseDatabase;

public class AddFacultyActivity extends AppCompatActivity {
    private EditText f_id,f_name;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_faculty);
        f_id=findViewById(R.id.f_id);
        f_name=findViewById(R.id.f_name);
        btn=findViewById(R.id.addButton);
        btn.setOnClickListener(view -> {
            Toast.makeText(this, FirebaseDatabase.getInstance().getReference().toString(), Toast.LENGTH_LONG).show();
            });
    }
}