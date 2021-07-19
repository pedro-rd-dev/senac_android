package com.senac_android.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.senac_android.models.Usuario;
import com.senac_android.utilitarios.Android;
import com.senac_android.R;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    public void mostrarToast(View v){

        Toast.makeText(this,"teste",Toast.LENGTH_SHORT).show();
    }

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




        Usuario usuario = new Usuario();
        usuario.setUserName("PEDRO");
        usuario.setPassword("123456");
        usuario.save();


        List<Usuario> usuarios = Usuario.listAll(Usuario.class);



        Log.d("CicloDeVida", "onCreate");

    }

    @Override
    protected void onStart(){
        Log.d("CicloDeVida","onStart - a activity começou a executar");
        super.onStart();
    }

    @Override
    protected void onResume(){
        Log.d("CicloDeVida","onResume - Estado de interação com a tela");

        super.onResume();
    }

    @Override
    protected void onPause(){
        Log.d("CicloDeVida","onPause - A Activity começou a encerrar");

        super.onPause();
    }

    @Override
    protected void onStop(){
        Log.d("CicloDeVida","onStop - A Activity Não está mais visivel");

        super.onStop();
    }

    @Override
    protected void onDestroy(){
        Log.d("CicloDeVida","onDestroy - A Activity foi destruida");


        super.onDestroy();
    }

}
