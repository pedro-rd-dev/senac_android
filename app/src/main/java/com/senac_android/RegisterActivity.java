package com.senac_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

        TextView regitro_text_login = findViewById(R.id.regitro_text_login);

        regitro_text_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Android android = new Android(RegisterActivity.this);
                android.trocarDeActivity(MainActivity.class);
            }
        });
    }
}
