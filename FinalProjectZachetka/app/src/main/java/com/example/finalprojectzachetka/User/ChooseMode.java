package com.example.finalprojectzachetka.User;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.finalprojectzachetka.R;

public class ChooseMode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

        Button student = (Button) findViewById(R.id.student);
        student.setOnClickListener((View.OnClickListener) this);

        Button teacher = (Button) findViewById(R.id.teacher);
        teacher.setOnClickListener((View.OnClickListener) this);


    }
}
