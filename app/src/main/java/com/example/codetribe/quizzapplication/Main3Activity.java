package com.example.codetribe.quizzapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import static com.example.codetribe.quizzapplication.R.id.Cricket;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {

    public RadioGroup lesotho, cameron, president, language, Limpopo, desert, masai, countries, morocco, afri;
    public Button results;

    // Cricket app = new Cricket();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        lesotho = (RadioGroup) findViewById(R.id.lesotho);
        cameron = (RadioGroup) findViewById(R.id.cameron);
        president = (RadioGroup) findViewById(R.id.president);
        language = (RadioGroup) findViewById(R.id.language);
        Limpopo = (RadioGroup) findViewById(R.id.Limpopo);
        desert = (RadioGroup) findViewById(R.id.desert);
        masai = (RadioGroup) findViewById(R.id.masai);
        countries = (RadioGroup) findViewById(R.id.countries);
        morocco = (RadioGroup) findViewById(R.id.morocco);
        afri = (RadioGroup) findViewById(R.id.afri);
        results = (Button) findViewById(R.id.results);

        results.setOnClickListener(this);

    }

    public void onClick(View v) {
        int total = 0;

        if (v.getId() == R.id.results) {
            int key = lesotho.getCheckedRadioButtonId();
            switch (key) {
                case R.id.leso:
                    total++;
                    break;
            }
            int key2 = cameron.getCheckedRadioButtonId();
            switch (key2) {
                case R.id.camerron:
                    total++;
                    break;
            }
            int keyp = president.getCheckedRadioButtonId();
            switch (keyp) {
                case R.id.banda:
                    total++;
                    break;
            }
            int keyl = language.getCheckedRadioButtonId();
            switch (keyl) {
                case R.id.ndebele:
                    total++;
                    break;
            }
            int keylp = Limpopo.getCheckedRadioButtonId();
            switch (keylp) {
                case R.id.Limpopo:
                    total++;
                    break;
            }
            int keyd = desert.getCheckedRadioButtonId();
            switch (keyd) {
                case R.id.kalari:
                    total++;
                    break;
            }
            int keym = masai.getCheckedRadioButtonId();
            switch (keym) {
                case R.id.maasai:
                    total++;
                    break;
            }
            int keyc = countries.getCheckedRadioButtonId();
            switch (keyc) {
                case R.id.fiftyfive:
                    total++;
                    break;
            }
            int keymc = morocco.getCheckedRadioButtonId();
            switch (keymc) {
                case R.id.casab:
                    total++;
                    break;
            }
            int keyA = afri.getCheckedRadioButtonId();
            switch (keyA) {
                case R.id.African:
                    total++;
                    break;
            }
        }

        results.setText("you scored "+total+"/10");

        Toast.makeText(this,"Your scored "+ total,Toast.LENGTH_LONG).show();
        Intent results = new Intent(this,MainActivity.class);
        startActivity(results);

    }
}

