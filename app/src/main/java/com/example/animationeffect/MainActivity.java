package com.example.animationeffect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static int splash_screen = 4500;
    ImageView logo;
    TextView name;
    Animation topanim,bottomanim;
    TextView portfoliologin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logo = findViewById(R.id.logo);
        name = findViewById(R.id.name);
        topanim = AnimationUtils.loadAnimation(this,R.anim.topanim);
        bottomanim = AnimationUtils.loadAnimation(this,R.anim.bottomanim);
        logo.setAnimation(topanim);
        name.setAnimation(bottomanim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,animationportfolio.class);
                startActivity(intent);
                finish();

            }
        },splash_screen);


            }

    }
