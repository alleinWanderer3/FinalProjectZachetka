package com.example.finalprojectzachetka;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalprojectzachetka.Disciplines.AppDBLiterature;
import com.example.finalprojectzachetka.Disciplines.Listliterature;

import java.util.List;

public class DisciplinesActivity extends AppCompatActivity implements RoomAdapter.OnDeleteListener {

    //private Button mbtnAdd;
    Button mbtnGet;
    RoomAdapter adapter;
    RecyclerView recyclerView;

//    public static void bind(RoomAdapter.LiteratureViewHolder literatureViewHolder, View itemView) {
//    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((AppDBLiterature)getApplication()).getmLiteratureDB().getLiteratureDAO().getListliteratures().observe(this, new Observer<List<Listliterature>>() {
            @Override
            public void onChanged(List<Listliterature> listliteratures) {
                recyclerView.setAdapter(new RoomAdapter(getApplicationContext(),listliteratures));
            }
        });
        setContentView(R.layout.show_literature);
        recyclerView = findViewById(R.id.listOfDisc);
        //   RoomAdapter.bind(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));


        // dbHelper = AppDBLiterature.getInstance().getDatabaseInstance();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_add_button, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_add: {
                startActivity(new Intent(this, RoomAdapter.class));
                break;
            }
        }
        return false;
    }

    @Override
    protected void onResume() {
        super.onResume();
      //  RoomAdapter roomAdapter = new RoomAdapter(this, LiteratureDAO.getAllData());
     //   roomAdapter.setOnDeleteListener(this);
      //  recyclerView.setAdapter(roomAdapter);
    }

    @Override
    public void onDelete(Listliterature dataModel) {
       // LiteratureDB.getLiteratureDAO().delete(dataModel);
    }
}

//}








//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        rvList = (RecyclerView) findViewById(R.id.rvList);
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
//        rvList.setLayoutManager(linearLayoutManager);
//
//        BludoDao bludoDao = (BludoDao) AppDatabase.createPersistentDatabase(getApplicationContext()).bludoDao();
//        bludoDao.getAll().observe(this, (List<Bludo> bludoList) -> {
//            adapter = new RoomAdapter(MainActivity.this, bludoList);
//            rvList.setAdapter(adapter);
//        });
//
//    }
//}
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.show_literature);
//
//        Button mbtnGet = (Button) findViewById(R.id.btn_get);
//        mbtnGet.setOnClickListener(((View.OnClickListener) this));
//        List<Listliterature> list = Listliterature.getmLink();
//
//        final LiteratureDAO literatureDAO = ((AppDBLiterature) getApplicationContext()).getmLiteratureDB().getLiteratureDAO();
//    }
//}



//        mbtnAdd = (findViewById(R.id.btnAdd));
//        mbtnAdd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                literatureDAO.insertTeachers(createTeachers());
//            }
//        });
//        mbtnGet = findViewById(R.id.btnRead);
//        mbtnGet.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                showToast(literatureDAO.getTeachers());
//            }
//        });
//
//    }
//
//    private List<Teachers> createTeachers() {
//
//        List<Teachers> teachers = new ArrayList<>(25);
//        for (int i = 0; i < 10; i++) {
//            teachers.add(new Teachers(i, "teacher" + i, "Link" + System.currentTimeMillis()));
//        }
//        return teachers;
//    }
//
//
//    private void showToast(LiveData<List<Teachers>> teachers) {
//        StringBuilder builder = new StringBuilder();
//    }
//}
       /* for(int h=0, mID = Teachers.m(); h<mID; h++){
            builder.append(teachers.toString()).append("\n");

            }
            Toast.makeText(this, builder.toString(). Toast.L)
    }
}
                //получаем из инта нужный нам айдишник и открываем нужное поле
      //  Database db = (Database) AppDB.getInstance().getDatabase();}
   /* DAO disciplinesDao = db.disciplinesDao();
    EntityDisciplines disciplines = new EntityDisciplines();
    .id = 1;
    employee.name = "John Smith";
    employee.salary = 10000;

employeeDao.insert(employee);


public class DisciplinesActivity extends AndroidViewModel {

    AppDB appDB = new AppDB();
public Database literature;
    public DisciplinesActivity(@NonNull AppDB appDB){
        super(AppDB);
    literature = Room.databaseBuilder(AppDB, Database.class, "leterature").build();

    }
}












               /* long id = getIntent().getLongExtra("_id",-6);
                DBHelper dbhelper = new DBHelper(getBaseContext());
                SQLiteDatabase sqliteDB = dbhelper.getReadableDatabase();
                Cursor c = sqliteDB.query(DBHelper.TABLE_DISCIPLINES, null, BaseColumns._ID + "=" + id, null, null, null,
                        null);
                TextView lv = (TextView) findViewById(R.id.response);
                TextView tw = (TextView) findViewById(R.id.request);
                //выводим все в текствьюхи
                if (c.moveToFirst()) {
                    tw.setText(c.getString(c.getColumnIndex(DatabaseContract.NamesColumns.disc)));
                    lv.setText(c.getString(c.getColumnIndex(DatabaseContract.NamesColumns.link)));
                }
                dbhelper.close();
                sqliteDB.close();
                Log.v(TAG, "ID=" + id);
            }
        }




        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                    db = new DBHelper(this);

                    try {
                        db.createDatabase();
                    } catch (IOException e) {
                        throw new Error("Unable to create database");

                    }

                    try {
                        db.openDataBase();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                    File database=getApplicationContext().getDatabasePath("mushrooms.db");

                    if (!database.exists()) {
                        // Database does not exist so copy it from assets here
                        Log.i("Database", "Not Found");
                    } else {
                        Log.i("Database", "Found");
                    }


                    ListView listView = (ListView) findViewById(R.id.);
                    final String[] dicsiplines = {
                    };
                    final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this , android.R.layout.simple_list_item_1 , mushrooms);
                    listView.setAdapter(adapter);

                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            Intent intent = new Intent(MainActivity.this , Information.class);
                            intent.putExtra("id" , position);
                            intent.putExtra("title" , adapter.getItem(position));
                            startActivityForResult(intent , 0);
                        }
                    });


                }



            });

        };*/



