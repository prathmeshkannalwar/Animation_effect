package com.example.animationeffect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Homepage extends AppCompatActivity {

Button getotpbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        getotpbtn = findViewById(R.id.getotpbtn);


        getotpbtn.setOnClickListener(new View.OnClickListener()
         {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(Homepage.this, otppage.class);
               startActivity(intent);

            }
        });




    }
}