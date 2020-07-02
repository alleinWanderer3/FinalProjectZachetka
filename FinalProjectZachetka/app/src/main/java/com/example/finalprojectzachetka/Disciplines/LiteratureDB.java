package com.example.finalprojectzachetka.Disciplines;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
@Database(entities = {Teachers.class, TeachersLiterature.class, Listliterature.class}, version =  1)
  public abstract class LiteratureDB extends RoomDatabase {

  public static LiteratureDAO getLiteratureDAO() {
    return null;
  }


    /*LiteratureDB db =  Room.databaseBuilder(getApplicationContext(),
            LiteratureDB.class, "database").build();

    protected abstract Context getApplicationContext();
*/
}

