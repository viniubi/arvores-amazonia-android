package com.example.ecoecho.data.source.remote;

import com.example.ecoecho.data.Arvore;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface ArvoreService {
    @Headers({"Content-Type: application/json", "Accept: application/json"})

    @GET("/arvores")
    Call<List<Arvore>> getArvores();
}
