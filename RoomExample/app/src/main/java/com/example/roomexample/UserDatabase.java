package com.example.roomexample;

import androidx.room.Query;

import java.util.List;

public interface UserDatabase {
    @Query("SELECT * FROM user")
    List<User> getAllusers;
    @
}
