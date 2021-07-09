package com.senac_android.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.senac_android.utilitarios.Android;
import com.senac_android.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

        TextView loginTextRegistrar = findViewById(R.id.login_text_registrar);

        loginTextRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Android android = new Android(MainActivity.this);
                android.trocarDeActivity(RegisterActivity.class);
            }
        });
    }

    public void mostrarToast(View v){

        Toast.makeText(this,"teste",Toast.LENGTH_SHORT).show();
    }
}
