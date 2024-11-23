package com.example.ecoecho.activity.sobre;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ecoecho.databinding.ActivitySobreBinding;

public class SobreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySobreBinding binding = ActivitySobreBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.toolbar.setNavigationOnClickListener(v -> finish());
    }
}