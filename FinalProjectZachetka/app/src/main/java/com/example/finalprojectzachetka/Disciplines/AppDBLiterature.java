package com.example.finalprojectzachetka.Disciplines;

import android.app.Application;
import android.os.Bundle;

import androidx.room.Room;

 public class AppDBLiterature extends Application {
     private LiteratureDB mLiteratureDB;

     @Override
     public void onCreate() {
         super.onCreate();

         mLiteratureDB = Room.databaseBuilder(getApplicationContext(), LiteratureDB.class, "literature_db")
                 .build();

     }

     public LiteratureDB getmLiteratureDB() {
         return mLiteratureDB;
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