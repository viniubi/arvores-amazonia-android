package com.example.ecoecho.activity.arvore.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.ecoecho.databinding.FragmentInformationBinding;

import io.noties.markwon.Markwon;
import io.noties.markwon.ext.tables.TablePlugin;
import io.noties.markwon.image.glide.GlideImagesPlugin;

public class InformationFragment extends Fragment {
    public static final String EXTRA_INFORMACAO = "info";
    private String informacao;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();

        if (arguments != null) {
            informacao = arguments.getString(EXTRA_INFORMACAO);
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        FragmentInformationBinding binding = FragmentInformationBinding.inflate(
                inflater,
                container,
                false);

        Markwon markwon = Markwon.builder(requireContext())
                .usePlugin(GlideImagesPlugin.create(requireContext()))
                .usePlugin(TablePlugin.create(requireContext()))
                .build();

        markwon.setMarkdown(binding.tvInfo, informacao);

        return binding.getRoot();
    }

    public static InformationFragment newInstance(String informacao) {
        InformationFragment fragment = new InformationFragment();
        Bundle bundle = new Bundle();
        bundle.putString(EXTRA_INFORMACAO, informacao);
        fragment.setArguments(bundle);
        return fragment;
    }
}
