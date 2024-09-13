package com.example.animationeffect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class animationportfolio extends AppCompatActivity {
    TextView portfoliologoo;
    Animation topanim;
    public static int splash_screen = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animationportfolio);
        portfoliologoo = findViewById(R.id.portfoliologo);
        topanim = AnimationUtils.loadAnimation(this, R.anim.topanim);
        portfoliologoo.setAnimation(topanim);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(animationportfolio.this ,loginwithlayout.class);
                startActivity(intent);
                finish();

            }
        },splash_screen);


    }
}