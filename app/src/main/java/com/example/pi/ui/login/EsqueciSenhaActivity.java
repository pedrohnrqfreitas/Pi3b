package com.example.pi.ui.login;


import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import com.example.pi.databinding.FragmentEsqueciSenhaBinding;

public class EsqueciSenhaActivity extends AppCompatActivity {

    private FragmentEsqueciSenhaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = FragmentEsqueciSenhaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
