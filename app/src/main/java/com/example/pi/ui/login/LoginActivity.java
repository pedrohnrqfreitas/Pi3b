package com.example.pi.ui.login;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;


import androidx.appcompat.app.AppCompatActivity;


import com.example.pi.MainActivity;
import com.example.pi.databinding.FragmetLoginBinding;


public class LoginActivity extends AppCompatActivity {

    private FragmetLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = FragmetLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.tvCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, CadastroActivity.class);
                startActivity(intent);
            }
        });

        binding.loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        binding.TvEsqueciSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, EsqueciSenhaActivity.class);
                startActivity(intent);
            }
        });
    }
}
