package com.example.dchelper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=findViewById(R.id.button);
        Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT).show();
        for(int i=0;i<10;i++){
            System.out.println("Fuck u");
        }
        while(true){
            System.out.println("Hello Wolrd");
        }
    }
}