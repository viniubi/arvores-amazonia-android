package com.example.ecoecho;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ArvoreDao {
    @Query("SELECT * FROM arvore")
    List<Arvore> getAll();

    @Query("SELECT * FROM arvore WHERE id = :id LIMIT 1")
    Arvore getArvoreById(int id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<Arvore> arvore);
}
