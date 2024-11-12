package com.example.ecoecho.activity.arvore;

import android.animation.ArgbEvaluator;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.bumptech.glide.Glide;
import com.example.ecoecho.R;
import com.example.ecoecho.data.Aba;
import com.example.ecoecho.data.Arvore;
import com.example.ecoecho.data.source.local.AppDatabase;
import com.example.ecoecho.data.source.local.ArvoreDao;
import com.example.ecoecho.databinding.ActivityArvoreBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.List;

public class ArvoreActivity extends AppCompatActivity {
    public static final String EXTRA_ARVORE_ID = "arvore_id";
    private final ArgbEvaluator argbEvaluator = new ArgbEvaluator();
    private ActivityArvoreBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityArvoreBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArvoreDao arvoreDao = AppDatabase.getDatabase(this).arvoreDao();
        ArvorePresenter presenter = new ArvorePresenter(this, arvoreDao);

        int arvoreId = getIntent().getIntExtra(EXTRA_ARVORE_ID, 0);
        presenter.buscarArvore(arvoreId);

        int colorExpanded = ContextCompat.getColor(this, R.color.white);
        int colorCollapsed = ContextCompat.getColor(this, R.color.dark_soil_green);

        binding.toolbar.setNavigationOnClickListener(v -> finish());
        binding.toolbar.setNavigationIconTint(colorExpanded);
        binding.appBar.addOnOffsetChangedListener(
                (AppBarLayout.BaseOnOffsetChangedListener<AppBarLayout>) (v, verticalOffset) -> {
                    int totalScrollRange = binding.appBar.getTotalScrollRange();
                    float collapsePercentage = Math.abs(verticalOffset) / (float) totalScrollRange;

                    int color = (int) argbEvaluator.evaluate(
                            collapsePercentage,
                            colorExpanded,
                            colorCollapsed);

                    binding.toolbar.setNavigationIconTint(color);
                });
    }

    public void mostrarArvore(Arvore arvore, List<Aba> abasDisponiveis) {
        binding.toolbar.setTitle(arvore.getNome());

        Glide.with(this)
                .load(arvore.getImgUrl())
                .centerCrop()
                .placeholder(R.drawable.bg_loading)
                .error(R.drawable.bg_loading)
                .into(binding.ivArvore);

        binding.viewPager.setAdapter(new AbaAdapter(this, arvore, abasDisponiveis));

        new TabLayoutMediator(binding.tabLayout, binding.viewPager, (tab, position) -> {
            Aba abaAtual = abasDisponiveis.get(position);
            tab.setText(abaAtual.getStringResource());
        }).attach();
    }
}