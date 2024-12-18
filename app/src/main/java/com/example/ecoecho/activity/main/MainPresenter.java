package com.example.ecoecho.activity.main;

import com.example.ecoecho.data.Arvore;
import com.example.ecoecho.data.source.local.ArvoreDao;
import com.example.ecoecho.data.source.remote.ApiController;

import java.util.List;

public class MainPresenter {
    private final MainActivity view;
    private final ApiController apiController;
    private final ArvoreDao arvoreDao;

    public MainPresenter(MainActivity view, ApiController apiController, ArvoreDao arvoreDao) {
        this.view = view;
        this.apiController = apiController;
        this.arvoreDao = arvoreDao;
    }

    public void mostrarArvoresDatabase() {
        view.mostrarArvores(arvoreDao.getAll());
    }

    public void buscarDadosApi() {
        apiController.buscarArvores(new ApiController.OnBuscarArvores() {
            @Override
            public void onSucesso(List<Arvore> arvores) {
                arvoreDao.deleteAll();
                arvoreDao.insertAll(arvores);
                mostrarArvoresDatabase();
            }

            @Override
            public void onFalha(String erro) {
                view.mostrarErro(erro);
                mostrarArvoresDatabase();
            }
        });
    }
}
