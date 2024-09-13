package com.example.animationeffect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class loginwithlayout extends AppCompatActivity {
    Button withphonebtn , withemailidbtn , signupwithbtn ,nextbutton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_loginwithlayout);
        nextbutton1 = findViewById(R.id.nextbutton1);
        withphonebtn = findViewById(R.id.withphonebtn);
        withemailidbtn = findViewById(R.id.withemailidbtn);
        signupwithbtn = findViewById(R.id.signupwithemailbtn);


        withphonebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(loginwithlayout.this , Homepage.class);
                startActivity(intent);
            }
        });
        withemailidbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(loginwithlayout.this , login_with_emailpage.class);
                startActivity(intent);
            }
        });
        signupwithbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(loginwithlayout.this , signupwithemail.class);
                startActivity(intent);
            }
        });
        nextbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(loginwithlayout.this , namedetailpage.class);
                startActivity(intent);
            }
        });
    }
}