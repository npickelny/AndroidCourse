package com.example.nico.cursoandroidconversortemperatura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Transformar(View v){
        EditText et = (EditText)findViewById(R.id.editText);

        Intent intent = new Intent(this,SecondActivity.class);

        int i = Integer.parseInt(et.getText().toString());
        intent.putExtra("valor",i);
        startActivity(intent);
    }
}
