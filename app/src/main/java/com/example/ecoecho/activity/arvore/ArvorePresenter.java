package com.example.ecoecho.activity.arvore;

import com.example.ecoecho.data.Aba;
import com.example.ecoecho.data.Arvore;
import com.example.ecoecho.data.source.local.ArvoreDao;

import java.util.ArrayList;
import java.util.List;

public class ArvorePresenter {
    private final ArvoreActivity view;
    private final ArvoreDao arvoreDao;

    public ArvorePresenter(ArvoreActivity view, ArvoreDao arvoreDao) {
        this.view = view;
        this.arvoreDao = arvoreDao;
    }

    public void buscarArvore(int id) {
        Arvore arvore = arvoreDao.getArvoreById(id);
        List<Aba> abasDisponiveis = getAbasDisponiveis(arvore);
        view.mostrarArvore(arvore, abasDisponiveis);
    }

    private List<Aba> getAbasDisponiveis(Arvore arvore) {
        List<Aba> abasDisponiveis = new ArrayList<>();

        for (Aba aba : Aba.values()) {
            String informacao = arvore.getInformacaoByAba(aba);
            if (informacao != null && !informacao.trim().isEmpty()) {
                abasDisponiveis.add(aba);
            }
        }

        return abasDisponiveis;
    }

}
