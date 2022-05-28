package com.stedile.listadecompras_v1_0;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.stedile.listadecompras_v1_0.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_main);
        //TextView tvHello = findViewById(R.id.tvHello); Forma antiga de ser feito o find

        //Nova forma usando o viewBinding
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}