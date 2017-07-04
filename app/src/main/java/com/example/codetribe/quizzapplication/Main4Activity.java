package com.example.codetribe.quizzapplication;

import android.content.Intent;
import  android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity implements View.OnClickListener {

    public RadioGroup wags, starring, harpo, titanik, luther, mama, Sade, kardishan, sports, ctp;
    public int score = 0;
    public Button total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        wags = (RadioGroup) findViewById(R.id.wags);
        starring = (RadioGroup) findViewById(R.id.starring);
        harpo = (RadioGroup) findViewById(R.id.harpo);
        titanik = (RadioGroup) findViewById(R.id.titanik);
        luther = (RadioGroup) findViewById(R.id.luther);
        Sade = (RadioGroup) findViewById(R.id.Sade);
        kardishan = (RadioGroup) findViewById(R.id.kardishan);
        sports = (RadioGroup) findViewById(R.id.sports);
        ctp = (RadioGroup) findViewById(R.id.ctp);
        mama = (RadioGroup) findViewById(R.id.mama);
        total = (Button) findViewById(R.id.total);

        total.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.total) {
            int key = wags.getCheckedRadioButtonId();
            switch (key) {
                case R.id.wag:
                    score++;
                    break;
            }
            int key1 = starring.getCheckedRadioButtonId();
            switch (key1) {
                case R.id.patrick:
                    score++;
                    break;
            }
            int key2 = harpo.getCheckedRadioButtonId();
            switch (key2) {
                case R.id.oprah:
                    score++;
                    break;
            }
            int key12 = titanik.getCheckedRadioButtonId();
            switch (key12) {
                case R.id.titanic:
                    score++;
                    break;
            }
            int key13 = luther.getCheckedRadioButtonId();
            switch (key13) {
                case R.id.lvandros:
                    score++;
                    break;
            }
            int key14 = kardishan.getCheckedRadioButtonId();
            switch (key14) {
                case R.id.north:
                    score++;
                    break;
            }
            int key15 = sports.getCheckedRadioButtonId();
            switch (key15) {
                case R.id.ronaldo:
                    score++;
                    break;
            }
            int key16 = ctp.getCheckedRadioButtonId();
            switch (key16) {
                case R.id.capet:
                    score++;
                    break;
            }
            int mama = ctp.getCheckedRadioButtonId();
            switch (key16) {
                case R.id.mariam:
                    score++;
                    break;
            }
        }
            total.setText("you scored "+score+"/10");
        Toast.makeText(this,"Your total "+ score,Toast.LENGTH_LONG).show();
          Intent total = new Intent(this,MainActivity.class);
        startActivity(total);
    }
}