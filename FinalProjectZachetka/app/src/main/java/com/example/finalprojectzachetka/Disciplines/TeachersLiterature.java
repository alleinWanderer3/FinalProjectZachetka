package com.example.finalprojectzachetka.Disciplines;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
@Entity(foreignKeys = {
        @ForeignKey(entity = Teachers.class, parentColumns = "id", childColumns = "Teacher_id"),
        @ForeignKey(entity = Listliterature.class, parentColumns = "id", childColumns = "discipline_id"
        )})
public class TeachersLiterature {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    public   int id;
    @ColumnInfo(name = "Teacher_id")
    public int mTeacherID;
    @ColumnInfo(name = "discipline_id")
    public int mdisciplineID;

    public TeachersLiterature() {
    }

  /*  public int getId() {
        return id;
    }

    public int getmTeacherID() {
        return mTeacherID;
    }

    public int getMdisciplineID() {
        return mdisciplineID;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setmTeacherID(int mTeacherID) {
        this.mTeacherID = mTeacherID;
    }

    public void setMdisciplineID(int mdisciplineID) {
        this.mdisciplineID = mdisciplineID;
    }

    public TeachersLiterature(int id, int mTeacherID, int mdisciplineID) {
        this.id = id;
        this.mTeacherID = mTeacherID;
        this.mdisciplineID = mdisciplineID;


    }*/
}
