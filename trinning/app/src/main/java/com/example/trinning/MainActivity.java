package com.example.trinning;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Student> students = new ArrayList<>();
    //s1
    //0

    int hh = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView num1 = findViewById(R.id.num1);
        TextView num2 = findViewById(R.id.num2);
        Button b = findViewById(R.id.calculate);
        ImageView xxx = findViewById(R.id.XXX);
/*
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (num1.getText().toString().equals("")){
                }
                else if (num2.getText().toString().equals("")){
                }



                String name = num1.getText().toString();
                int age  =Integer.parseInt(num2.getText().toString());

                Intent i = new Intent(MainActivity.this,MainActivity2.class );
                i.putExtra("name",name);
                i.putExtra("age",age);
              startActivity (i);

            }
        });
*/

           Student s1 = new Student("ماجد",14,R.drawable.main2);
           Student s2 = new Student("سلمان",13,R.drawable.profile);
           Student S3 = new Student("محمد",13,R.drawable.wlpic);

           students.add(s1);
        students.add(s2);
        students.add(S3);



        num1.setText(students.get(hh).getStidentname());
        num2.setText(String.valueOf(students.get(hh).getStudentage()));
        xxx.setImageResource(students.get(hh).getStudentfhoto());


        b.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {

                   // بونص استاذ سلمان
                    if (  hh == students.size() ){

                       hh= 0;
                   }

                   hh++;

                   num1.setText(students.get(hh).getStidentname());
                   num2.setText(String.valueOf(students.get(hh).getStudentage()));
                   xxx.setImageResource(students.get(hh).getStudentfhoto());




               }
               });
        }


}


















