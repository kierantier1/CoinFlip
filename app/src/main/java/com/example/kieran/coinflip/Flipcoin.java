package com.example.kieran.coinflip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;


public class Flipcoin extends AppCompatActivity {
    Button bFlip;
    ImageView imgFace;
    int nImgName;   //Code for file names

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flipcoin);
        bFlip = (Button) findViewById(R.id.ButtonFlip);
        imgFace = (ImageView) findViewById(R.id.Coin);

        bFlip.setOnClickListener(new View.OnClickListener() {   //Button detection for flip
            @Override
            public void onClick(View view) {
                Coinflip();
                imgFace.setImageResource(nImgName);
            }
            });
    }
    public int Coinflip(){ //Random number/file generator taken from stackoverflow - see Journal Oct. 3
        int nNumImg = 2;
        Random Rand = new Random();
        int nRand = Rand.nextInt(nNumImg) +1;
        String sImgName = "c" + nRand;
        int nImgName = getResources().getIdentifier(sImgName, "drawable", getPackageName());
        return nImgName;
    }

}
