package com.example.nico.cursoandroidconversortemperatura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView tv = (TextView)findViewById(R.id.textView);

        int temp = Integer.parseInt(getIntent().getExtras().get("valor").toString());
        float total = (temp*(9/5))+32;
        tv.setText(String.valueOf(total)+"*");

    }
}
