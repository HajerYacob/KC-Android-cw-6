package com.example.trinning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

     TextView name = findViewById(R.id.textView2);
        TextView age = findViewById(R.id.textView5);



        TextView ruslt1= findViewById(R.id.num1);
        TextView ruslt2= findViewById(R.id.num2);

        Bundle b = getIntent().getExtras();
        String rus= b.getString("name" );
        int rus2 = b.getInt("age");

        ruslt1.setText(String.valueOf(rus2));
        ruslt2.setText(rus);






    }
}