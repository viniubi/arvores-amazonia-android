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
        String informacao = arvore.getInformacaoByAba(abasDisponiveis.get(position));
        return InformationFragment.newInstance(informacao);
    }

    @Override
    public int getItemCount() {
        return abasDisponiveis.size();
    }
}
