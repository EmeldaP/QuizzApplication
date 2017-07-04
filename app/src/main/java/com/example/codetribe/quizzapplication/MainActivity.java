package com.example.codetribe.quizzapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public Button Cricket, Africa, life;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Africa = (Button) findViewById(R.id.Africa);
        Cricket = (Button) findViewById(R.id.Cricket);
        life =(Button) findViewById(R.id.life);

        Africa.setOnClickListener(this);
        Cricket.setOnClickListener(this);
        life.setOnClickListener(this);

//        Cricket.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent Cricket = new Intent(MainActivity.this, Main2Activity.class);
//                startActivity(Cricket);
//            }
//        });
    }

    @Override
    public void onClick(View v) {

       if(v.getId()==R.id.Africa)
       {
           Intent Africa = new Intent(MainActivity.this, Main3Activity.class);
           startActivity(Africa);
       }else if(v.getId()==R.id.Cricket)
       {
           Intent Cricket = new Intent(MainActivity.this, Main2Activity.class);
           startActivity(Cricket);
       } else if (v.getId()==R.id.life){
         Intent life = new Intent(MainActivity.this, Main4Activity.class);
       startActivity(life);
       }

        }
    }


