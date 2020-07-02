package com.example.finalprojectzachetka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Student extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        Button disciplines = (Button) findViewById(R.id.disciplines);
        disciplines.setOnClickListener((View.OnClickListener) this);


    }

    @Override
    public void onClick(View v) {

      Intent show_disciplines = new Intent(this, DisciplinesActivity.class);
      startActivity(show_disciplines);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
