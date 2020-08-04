package com.example.finalprojectzachetka.Disciplines;

import android.app.Application;
import android.widget.EditText;

import androidx.room.Room;
 public class AppDBLiterature extends Application {
     public static LiteratureDB mLiteratureDB;
     public static AppDBLiterature instance;

     @Override
     public void onCreate() {
         super.onCreate();
         instance = this;
         mLiteratureDB = Room.databaseBuilder(getApplicationContext(), LiteratureDB.class, "literature_db")
                 .build();




     }

     public static LiteratureDB getDatabase() {
         return mLiteratureDB;
     }
     public static AppDBLiterature getInstance() {
         return instance;

     }
 }







     /*
    public static AppDBLiterature instance;

    private LiteratureDB database;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        database = Room.databaseBuilder(this, LiteratureDB.class, "database")
                .build();

    }


    public static AppDBLiterature getInstance() {
        return instance;
    }

    public LiteratureDB getDatabase() {
        return database;
    }
}
/*import android.app.Application;

        import androidx.annotation.NonNull;
        import androidx.lifecycle.AndroidViewModel;
        import androidx.room.Room;

public class MainViewModel extends AndroidViewModel {
    public UserDataBase userDataBase;
    public MainViewModel(@NonNull Application application) {
        super(application);
        userDataBase = Room.databaseBuilder(application,UserDataBase.class,"user_db").build();

    }
}*/