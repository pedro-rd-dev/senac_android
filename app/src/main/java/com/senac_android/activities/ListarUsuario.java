package com.senac_android.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.senac_android.R;
import com.senac_android.adapters.UsuarioAdapter;
import com.senac_android.api.retrofit.RetrofitConfig;
import com.senac_android.models.Usuario;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListarUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.usuario_lista);


        Call<List<Usuario>> call = new RetrofitConfig().setUserService().listarUsuarios();
        call.enqueue(new Callback<List<Usuario>>() {
            @Override
            public void onResponse(Call<List<Usuario>> call, Response<List<Usuario>> response) {

                ListView listView = findViewById(R.id.usuario_lista_listview_lista);

                List<Usuario> usuariosList = response.body();
                Log.d("teste","teste");

                UsuarioAdapter adaptador = new UsuarioAdapter(ListarUsuario.this,usuariosList);
                listView.setAdapter(adaptador);

            }

            @Override
            public void onFailure(Call<List<Usuario>> call, Throwable t) {
                Log.d("teste","teste");

            }
        });

    }
}
