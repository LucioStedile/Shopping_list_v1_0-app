package com.stedile.listadecompras_v1_0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.stedile.listadecompras_v1_0.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

    private ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}