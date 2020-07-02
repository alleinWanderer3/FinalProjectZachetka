package com.example.finalprojectzachetka.Disciplines;

import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

@Database(entities = {Teachers.class, TeachersLiterature.class, Listliterature.class}, version =  1, exportSchema = false)
public abstract class LiteratureDB extends RoomDatabase {

    public abstract LiteratureDAO getLiteratureDAO();

    @Override
    protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration config) {
        return null;
    }

    @Override
    protected InvalidationTracker createInvalidationTracker() {
        return null;
    }
}












//public class DBHelper extends SQLiteOpenHelper {
//    public static final int DATABASE_VERSION = 1;
//    public static final String TABLE_DISCIPLINES = "discipline";
//    public static final String DATABASE_NAME = "disciplines";
//    public static final String KEY_ID = "_id";
//    public static final String KEY_NAME = "name";
//    public static final String KEY_LINKS = "link";










//    public DBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
//
//    }
//        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
//    }
//
//    public DBHelper(Context baseContext) {
//        super(null, DATABASE_NAME, null, DATABASE_VERSION);
//    }
//
//
//    @Override
//    public void onCreate(SQLiteDatabase db) {
//        db.execSQL("create table " + TABLE_DISCIPLINES + "(" + KEY_ID
//                + " integer primary key," + KEY_NAME + " text," + KEY_LINKS + " text" + ")");
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//
//        db.execSQL("drop table if exists " + TABLE_DISCIPLINES);
//
//        onCreate(db);
//    }
//}

