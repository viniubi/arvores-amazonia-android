package com.example.ecoecho.activity.arvore;

import android.animation.ArgbEvaluator;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.bumptech.glide.Glide;
import com.example.ecoecho.R;
import com.example.ecoecho.databinding.ActivityArvoreBinding;
import com.google.android.material.appbar.AppBarLayout;

public class ArvoreActivity extends AppCompatActivity {
    private final ArgbEvaluator argbEvaluator = new ArgbEvaluator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityArvoreBinding binding = ActivityArvoreBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int colorExpanded = ContextCompat.getColor(this, R.color.white);
        int colorCollapsed = ContextCompat.getColor(this, R.color.dark_soil_green);

        binding.toolbar.setNavigationIconTint(colorExpanded);
        binding.toolbar.setTitle("Teste");

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
}