package com.senac_android.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.location.Location;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.senac_android.api.retrofit.RetrofitConfig;
import com.senac_android.models.Usuario;
import com.senac_android.utilitarios.Android;
import com.senac_android.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    public void mostrarToast(View v){

        Toast.makeText(this,"teste",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

        Android android = new Android(MainActivity.this);
        android.getCurrentLocation();



        TextView loginTextRegistrar = findViewById(R.id.login_text_registrar);

        loginTextRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Android android = new Android(MainActivity.this);
                android.trocarDeActivity(RegisterActivity.class);
            }
        });



        Call<List<Usuario>> call = new RetrofitConfig().setUserService().listarUsuarios();
        call.enqueue(new Callback<List<Usuario>>() {
            @Override
            public void onResponse(Call<List<Usuario>> call, Response<List<Usuario>> response) {

                List<Usuario> usuariosList = response.body();
                Log.d("teste","teste");
            }

            @Override
            public void onFailure(Call<List<Usuario>> call, Throwable t) {
                Log.d("teste","teste");

            }
        });

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
