package com.example.ecoecho.data.source.remote;

import androidx.annotation.NonNull;

import com.example.ecoecho.data.Arvore;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiController {
    public static final String BASE_URL = ""; // TODO

    public void buscarArvores(OnBuscarArvores callback) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ArvoreService service = retrofit.create(ArvoreService.class);

        Call<List<Arvore>> call = service.getArvores();
        call.enqueue(new Callback<List<Arvore>>() {
            @Override
            public void onResponse(@NonNull Call<List<Arvore>> call,
                                   @NonNull Response<List<Arvore>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    callback.onSucesso(response.body());
                } else {
                    try {
                        JsonObject jsonObject = JsonParser.parseString(response.errorBody().string())
                                .getAsJsonObject();

                        callback.onFalha(jsonObject.get("message").getAsString());
                    } catch (Exception e) {
                        callback.onFalha(e.getMessage());
                    }
                }
            }

            @Override
            public void onFailure(@NonNull Call<List<Arvore>> call,
                                  @NonNull Throwable throwable) {
                callback.onFalha(throwable.getMessage());
            }
        });
    }

    public interface OnBuscarArvores {
        void onSucesso(List<Arvore> arvores);

        void onFalha(String erro);
    }
}
