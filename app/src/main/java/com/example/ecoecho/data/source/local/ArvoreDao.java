package com.example.ecoecho.data.source.local;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.ecoecho.data.Arvore;

import java.util.List;

@Dao
public interface ArvoreDao {
    @Query("SELECT * FROM arvore ORDER BY nome")
    List<Arvore> getAll();

    @Query("SELECT * FROM arvore WHERE id = :id LIMIT 1")
    Arvore getArvoreById(int id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<Arvore> arvore);

    @Query("DELETE FROM arvore")
    void deleteAll();
}
