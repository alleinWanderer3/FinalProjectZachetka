package com.example.finalprojectzachetka;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.finalprojectzachetka.Disciplines.AppDBLiterature;
import com.example.finalprojectzachetka.Disciplines.Listliterature;
import com.example.finalprojectzachetka.Disciplines.LiteratureDAO;
import com.example.finalprojectzachetka.Disciplines.Teachers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TeacherActivity extends AppCompatActivity {

    private Button mbtnAdd;

    private Button mbtnGet;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);


        final LiteratureDAO literatureDAO = ((AppDBLiterature) getApplicationContext()).getmLiteratureDB().getLiteratureDAO();
        mbtnAdd = (findViewById(R.id.btnAdd));
        mbtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(){
                    @Override
                    public void run() {
                        literatureDAO.insertListliteratures(Arrays.asList(new Listliterature(new Random().nextInt(),"LinearAlgebra", "google inc")));
                    }
                }.start();

            }
        });
        mbtnGet = findViewById(R.id.btnRead);
        mbtnGet.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                literatureDAO.getTeachers().observe(TeacherActivity.this, new Observer<List<Teachers>>() {
                    @Override
                    public void onChanged(List<Teachers> teachers) {
                        Toast.makeText(TeacherActivity.this,teachers.toString(),Toast.LENGTH_LONG).show();
                    }
                });



                /* new Thread(){
                    @Override
                    public void run() {
                        final List<Teachers> ls = literatureDAO.getTeachers().getValue();
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {

                            }
                        });
                    }
                }.start();
                */
            }
        });

    }

    private List<Teachers> createTeachers() {

        List<Teachers> teachers = new ArrayList<>(1);
        //for (int i = 0; i < 10; i++) {
        int id = new Random().nextInt();
            teachers.add(new Teachers());
  //  (id, "teacher" + id, "Link" + System.currentTimeMillis()));
        //}
        return teachers;
    }


    private void showToast(LiveData<List<Teachers>> teachers) {
        StringBuilder builder = new StringBuilder();
    }

}













  /*  public Preferences contentValues;
    Button btnAdd, btnRead, btnClear;
    EditText disc, links;
    DBHelper dbHelper;

    private LiteratureDB mLiteratureDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mLiteratureDB = Room.databaseBuilder(getApplicationContext(), LiteratureDB.class, "literature_db")
                .build();

    }

    public LiteratureDB getmLiteratureDB() {
        return mLiteratureDB;
    }
}
       /* setContentView(R.layout.activity_teacher);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(this);

        btnRead = (Button) findViewById(R.id.btnRead);
        btnRead.setOnClickListener(this);

        btnClear = (Button) findViewById(R.id.btnClear);
        btnClear.setOnClickListener(this);

        links = (EditText) findViewById(R.id.Links);
        disc = (EditText) findViewById(R.id.Discipline);

       // dbHelper = new DBHelper(this, mCtx);

    }

    @Override
    public void onClick(View v) {

        String etdisc = disc.getText().toString();
        String etlinks = links.getText().toString();

        SQLiteDatabase database = dbHelper.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        switch (v.getId()) {

            case R.id.btnAdd:
                contentValues.put(DBHelper.KEY_NAME, etdisc);
                contentValues.put(DBHelper.KEY_LINKS, etlinks);

                ContentProvider database1;
                database.insert(DBHelper.TABLE_DISCIPLINES, null, contentValues);
                break;

            case R.id.btnRead:
                Cursor cursor = database.query(DBHelper.TABLE_DISCIPLINES, null, null, null, null, null, null);

                if (cursor.moveToFirst()) {
                    int idIndex = cursor.getColumnIndex(DBHelper.KEY_ID);
                    int disciplineIndex = cursor.getColumnIndex(DBHelper.KEY_NAME);
                    int linkIndex = cursor.getColumnIndex(DBHelper.KEY_LINKS);
                    do {
                        Log.d("mLog", "ID = " + cursor.getInt(idIndex) +
                                ", discipline = " + cursor.getString(disciplineIndex) +
                                ", link = " + cursor.getString(linkIndex));
                    } while (cursor.moveToNext());
                } else
                    Log.d("mLog","0 rows");

                cursor.close();
                break;

            case R.id.btnClear:
                database.delete(DBHelper.TABLE_DISCIPLINES, null, null);
                break;
        }
        dbHelper.close();
    }
}
*/
