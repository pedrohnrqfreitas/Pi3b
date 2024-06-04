package com.example.pi.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pi.R;
import com.example.pi.databinding.FragmetLoginBinding;


public class LoginActivity extends AppCompatActivity {

    private FragmetLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = FragmetLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}
