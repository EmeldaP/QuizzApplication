package com.example.codetribe.quizzapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;


import static com.example.codetribe.quizzapplication.R.id.Cricket;
import static com.example.codetribe.quizzapplication.R.id.score;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    public RadioGroup coach, rank, captain, over, t20, umpire, ipl, bowlers, players, NZ;
    public Button score;
    int count = 0;
   //Cricket app = new Cricket();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        coach = (RadioGroup) findViewById(R.id.coach);
        rank = (RadioGroup) findViewById(R.id.rank);
        captain = (RadioGroup) findViewById(R.id.captain);
        over = (RadioGroup) findViewById(R.id.over);
        t20 = (RadioGroup) findViewById(R.id.t20);
        umpire = (RadioGroup) findViewById(R.id.umpire);
        ipl = (RadioGroup) findViewById(R.id.ipl);
        bowlers = (RadioGroup) findViewById(R.id.bowler);
        players = (RadioGroup) findViewById(R.id.players);
        NZ = (RadioGroup) findViewById(R.id.NZ);
        score = (Button) findViewById(R.id.score);

        score.setOnClickListener(this);


    }


    public void onClick(View view) {


        if (view.getId() == R.id.score) {
            int key = coach.getCheckedRadioButtonId();
            switch (key) {
                case R.id.arthur:
                    count++;
                    break;
            }
            int key2 = rank.getCheckedRadioButtonId();
            switch (key2) {
                case R.id.RSA:
                    count++;
                    break;
            }
            int key3 = captain.getCheckedRadioButtonId();
            switch (key3) {
                case R.id.smith:
                    count++;
                    break;
            }
            int key4 = rank.getCheckedRadioButtonId();
            switch (key4) {
                case R.id.RSA:
                    count++;
                    break;
            }
            int key5 = over.getCheckedRadioButtonId();
            switch (key5) {
                case R.id.six:
                    count++;
                    break;
            }
            int key6 = t20.getCheckedRadioButtonId();
            switch (key6) {
                case R.id.twenty:
                    count++;
                    break;
            }
            int key7 = umpire.getCheckedRadioButtonId();
            switch (key7) {
                case R.id.fourruns:
                    count++;
                    break;
            }
            int key8 = ipl.getCheckedRadioButtonId();
            switch (key8) {
                case R.id.india:
                    count++;
                    break;
            }
            int key9 = bowlers.getCheckedRadioButtonId();
            switch (key9) {
                case R.id.steyn:
                    count++;
                    break;
            }
            int key1 = players.getCheckedRadioButtonId();
            switch (key1) {
                case R.id.eleven:
                    count++;
                    break;
            }
            int key0 = NZ.getCheckedRadioButtonId();
            switch (key0) {
                case R.id.allBlacks:
                    count++;
                    break;
            }

            score.setText("you scored "+count+"/10");
            Toast.makeText(this,"Your scored "+ count,Toast.LENGTH_LONG).show();

           Intent Cricket = new Intent(this,Main2Activity.class);
            startActivity(Cricket);

        }

    }
}

