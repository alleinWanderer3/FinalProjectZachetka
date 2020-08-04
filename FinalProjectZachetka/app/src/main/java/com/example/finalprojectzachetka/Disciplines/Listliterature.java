package com.example.finalprojectzachetka.Disciplines;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


    @Entity //аннотация
    public class Listliterature{
@PrimaryKey(autoGenerate = true)

@ColumnInfo(name = "id")
        public int mId;
@ColumnInfo(name = "name")
        public String mNameDiscipline;
@ColumnInfo(name = "link")
        public String mLink;





        public Listliterature() {
            this.mId = 0;
            this.mNameDiscipline = mNameDiscipline;

            this.mLink = mLink;
        }



        public int getmId() {
            return mId;
        }

        public String getmNameDiscipline() {
            return mNameDiscipline;
        }

        public String getmLink() {
            return mLink;
        }

        public void setmId(int mId) {
            this.mId = mId;
        }

        public void setmNameDiscipline(String mNameDiscipline) {
            this.mNameDiscipline = mNameDiscipline;
        }

        public void setmLink(String mLink) {
            this.mLink = mLink;
        }
    }
