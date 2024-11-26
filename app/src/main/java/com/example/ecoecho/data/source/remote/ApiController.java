package com.example.ecoecho.data.source.remote;

import android.util.Log;

import androidx.annotation.NonNull;

import com.example.ecoecho.data.Arvore;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.UnknownHostException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiController {
    public static final String BASE_URL = "https://fasnei20xx.pythonanywhere.com/";

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

                        String message = jsonObject.get("message").getAsString();
                        callback.onFalha(message);
                        Log.e(ApiController.class.getSimpleName(), "onResponse: " + message);
                    } catch (Exception e) {
                        callback.onFalha(e.getMessage());
                        Log.e(ApiController.class.getSimpleName(), "onResponse: " + e.getMessage());
                    }
                }
            }

            @Override
            public void onFailure(@NonNull Call<List<Arvore>> call,
                                  @NonNull Throwable throwable) {
                if (throwable instanceof UnknownHostException) {
                    callback.onFalha("Erro de rede, verifique sua conexão com a internet!");
                } else {
                    callback.onFalha(throwable.getMessage());
                }

                Log.e(ApiController.class.getSimpleName(), "onFailure: " + throwable.getMessage());
            }
        });
    }

    public interface OnBuscarArvores {
        void onSucesso(List<Arvore> arvores);

        void onFalha(String erro);
    }
}
