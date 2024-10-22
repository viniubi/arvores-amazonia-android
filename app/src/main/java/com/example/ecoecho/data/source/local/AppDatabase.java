package com.example.ecoecho.data.source.local;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.ecoecho.data.Arvore;

@Database(entities = {Arvore.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase INSTANCE;

    public synchronized static AppDatabase getDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(
                            context.getApplicationContext(),
                            AppDatabase.class,
                            "ecoecho")
                    .allowMainThreadQueries()
                    .build();
        }

        return INSTANCE;
    }

    public abstract ArvoreDao arvoreDao();
}
