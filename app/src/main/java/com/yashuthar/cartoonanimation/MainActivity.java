package com.yashuthar.cartoonanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view){
          ImageView shinchan = (ImageView) findViewById(R.id.shinchan);
          shinchan.animate().translationXBy(1500f).translationYBy(1500f).rotationBy(3600).setDuration(2000);


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView shinchan = (ImageView) findViewById(R.id.shinchan);
        shinchan.setTranslationX(-1500f);
        shinchan.setTranslationY(-1500f);

    }
}