package com.example.finalprojectzachetka.Disciplines;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity //аннотация
public class Teachers {

    @PrimaryKey
    @ColumnInfo(name = "id")
    public int mId;
    @ColumnInfo(name = "name")
    public String mName;
    @ColumnInfo(name = "discipline")
    public String mdiscipline;

    public Teachers() {
    }

    public Teachers(int mId, String mName, String mLink) {
        this.mId = mId;
        this.mName = mName;
        this.mdiscipline = mdiscipline;
    }

    public int getmId() {
        return mId;
    }

    public String getmName() {
        return mName;
    }

    public String getmdiscipline() {
        return mdiscipline;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmdiscipline(String mdiscipline) {
        this.mdiscipline = mdiscipline;
    }

    @Override
    public String toString() {
        return //"Teachers{" +
                //"mId=" + mId +
                 mName;
                         //'" + mName + '\'' +
                //", mdiscipline='" + mdiscipline + '\'' +
                //'}';
    }
}
