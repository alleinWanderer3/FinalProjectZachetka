package com.example.finalprojectzachetka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.finalprojectzachetka.ui.login.LoginActivity;

import static com.example.finalprojectzachetka.R.id.student;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button Button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
        Button student = (Button) findViewById(R.id.student);
        student.setOnClickListener(this);

        Button teacher = (Button) findViewById(R.id.teacher);
        teacher.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case student:
                Intent choose_student = new Intent(this, Student.class);
                startActivity(choose_student);

                Button student = (Button) findViewById(R.id.student);
                student.setOnClickListener((View.OnClickListener) this);
                Intent login_student = new Intent(this, LoginActivity.class);
                startActivity(login_student);

                // TODO Call second activity
                break;

            case R.id.teacher:
                Intent choose_teacher = new Intent(this, TeacherActivity.class);
                startActivity(choose_teacher);

            Button teacher = (Button) findViewById(R.id.teacher);
            teacher.setOnClickListener((View.OnClickListener) this);
            //Intent login_teacher = new Intent(this, LoginActivityTeacher.class);
         //   startActivity(login_teacher);

                break;
            default:
                break;
        }

    }
}
