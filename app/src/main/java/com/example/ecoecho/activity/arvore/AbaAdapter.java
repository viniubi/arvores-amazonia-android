package com.example.ecoecho.activity.arvore;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.ecoecho.activity.arvore.fragment.InformationFragment;
import com.example.ecoecho.data.Aba;
import com.example.ecoecho.data.Arvore;

import java.util.List;

public class AbaAdapter extends FragmentStateAdapter {
    private final Arvore arvore;
    private final List<Aba> abasDisponiveis;

    public AbaAdapter(@NonNull FragmentActivity fragmentActivity,
                      Arvore arvore,
                      List<Aba> abasDisponiveis) {
        super(fragmentActivity);
        this.arvore = arvore;
        this.abasDisponiveis = abasDisponiveis;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (abasDisponiveis.get(position)) {
            case SOBRE:
                return InformationFragment.newInstance(arvore.getSobre());
            case BIOLOGIA:
                return InformationFragment.newInstance(arvore.getBiologia());
            case ECOLOGIA:
                return InformationFragment.newInstance(arvore.getEcologia());
            case CONSUMO:
                return InformationFragment.newInstance(arvore.getConsumo());
            case CULTIVO:
                return InformationFragment.newInstance(arvore.getCultivo());
            case REFERENCIAS:
                return InformationFragment.newInstance(arvore.getReferencias());
            default:
                return InformationFragment.newInstance(null);
        }
    }

    @Override
    public int getItemCount() {
        return abasDisponiveis.size();
    }
}
