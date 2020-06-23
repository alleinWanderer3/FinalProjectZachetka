package com.example.finalprojectzachetka.Disciplines;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;


import java.util.List;

    @Dao
    public interface LiteratureDAO {

        @Query("SELECT * FROM Teachers")
        LiveData<List<Teachers>> getTeachers();

        @Query("SELECT * FROM Listliterature")
        LiveData<List<Listliterature>> getListliteratures();

        @Insert(onConflict = OnConflictStrategy.REPLACE) //сравнение по праймари кей,если что новый объект заменит старый
        void insertTeachers(List<Teachers> teachers);

        @Insert(onConflict = OnConflictStrategy.REPLACE) //сравнение по праймари кей,если что новый объект заменит старый
        void insertListliteratures(List<Listliterature> listliteratures);

        @Insert(onConflict = OnConflictStrategy.REPLACE) //сравнение по праймари кей,если что новый объект заменит старый
        void setLinksTeachersLiterature(List<TeachersLiterature> teachersLiterature);

        //@Query("SELECT * FROM Listliterature inner join TeachersLiterature on Listliterature.id=TeachersLiterature.Listliterature_id where)
       // List<Listliterature> getLiteraturefromTeacher(int TeachderID;

    }

