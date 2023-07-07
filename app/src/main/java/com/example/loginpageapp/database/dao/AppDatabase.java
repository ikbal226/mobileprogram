package com.example.loginpageapp.database.dao;

import androidx.room.Database;
import androidx.room.RoomDatabase;


import com.example.loginpageapp.model.ModelDatabase;
import com.example.loginpageapp.database.dao.dao.DatabaseDao;

@Database(entities = {ModelDatabase.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DatabaseDao databaseDao();
}
