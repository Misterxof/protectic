package com.mistcorp.protectic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Test1c2 extends AppCompatActivity {

    public int score;
    RadioGroup rg1;
    RadioButton a1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test1c2q1);

        rg1 = (RadioGroup)findViewById(R.id.radioGroup1c2q1);

        a1 = (RadioButton)findViewById(R.id.answer1c2q1);

        score = 0;
    }

    public void onClickButton1(View view){
        int selectedId = rg1.getCheckedRadioButtonId();

        if(selectedId == a1.getId()){
            score++;
        }
        setContentView(R.layout.test1c2q2);
    }

    public void onClickButton2(View view){
        RadioGroup gr = (RadioGroup)findViewById(R.id.radioGroup1c2q2);
        int selectedId2 = gr.getCheckedRadioButtonId();

        RadioButton a2 = (RadioButton)findViewById(R.id.answer1c2q2);

        if(selectedId2 == a2.getId()){
            score++;
        }
        setContentView(R.layout.test1c2q3);
    }

    public void onClickButton3(View view){
        RadioGroup gr3 = (RadioGroup)findViewById(R.id.radioGroup1c2q3);
        int selectedId3 = gr3.getCheckedRadioButtonId();

        RadioButton a3 = (RadioButton)findViewById(R.id.answer1c2q3);

        if(selectedId3 == a3.getId()){
            score++;
        }
        setContentView(R.layout.test1c2q4);
    }

    public void onClickButton4(View view){
        RadioGroup gr4 = (RadioGroup)findViewById(R.id.radioGroup1c2q4);
        int selectedId4 = gr4.getCheckedRadioButtonId();

        RadioButton a4 = (RadioButton)findViewById(R.id.answer1c2q4);

        if(selectedId4 == a4.getId()){
            score++;
        }
        setContentView(R.layout.test1c2q5);
    }

    public void onClickButton5(View view){
        RadioGroup gr5 = (RadioGroup)findViewById(R.id.radioGroup1c2q5);
        int selectedId5 = gr5.getCheckedRadioButtonId();

        RadioButton a5 = (RadioButton)findViewById(R.id.answer1c2q5);

        if(selectedId5 == a5.getId()){
            score++;
        }
        setContentView(R.layout.test1c2r);
        TextView tv1 = (TextView)findViewById(R.id.textView12);
        tv1.setText("Ваш результат: "+score+" из 5.");
    }

    public void onClickButton6(View view){

        Intent i = new Intent(this, second_tab.class);
        i.putExtra("fragment", 1);
        startActivity(i);
    }
}
