package com.example.ecoecho.activity.arvore;

import static com.example.ecoecho.data.Aba.BIOLOGIA;
import static com.example.ecoecho.data.Aba.CONSUMO;
import static com.example.ecoecho.data.Aba.CULTIVO;
import static com.example.ecoecho.data.Aba.ECOLOGIA;
import static com.example.ecoecho.data.Aba.REFERENCIAS;
import static com.example.ecoecho.data.Aba.SOBRE;

import com.example.ecoecho.data.Aba;
import com.example.ecoecho.data.Arvore;
import com.example.ecoecho.data.source.local.ArvoreDao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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
        LinkedHashMap<Aba, String> abaMap = new LinkedHashMap<>();
        abaMap.put(SOBRE, arvore.getSobre());
        abaMap.put(BIOLOGIA, arvore.getBiologia());
        abaMap.put(ECOLOGIA, arvore.getEcologia());
        abaMap.put(CONSUMO, arvore.getConsumo());
        abaMap.put(CULTIVO, arvore.getCultivo());
        abaMap.put(REFERENCIAS, arvore.getReferencias());

        List<Aba> abasDisponiveis = new ArrayList<>();
        for (Map.Entry<Aba, String> entry : abaMap.entrySet()) {
            String value = entry.getValue();
            if (value != null && !value.trim().isEmpty()) {
                abasDisponiveis.add(entry.getKey());
            }
        }

        return abasDisponiveis;
    }

}
