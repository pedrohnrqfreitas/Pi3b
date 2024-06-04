package com.example.pi.ui.login;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pi.databinding.FragmentCadastroBinding;
public class CadastroActivity extends AppCompatActivity {

    private FragmentCadastroBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = FragmentCadastroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}
