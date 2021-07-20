package com.senac_android.api.services;

import com.senac_android.models.Usuario;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface UserService {

    @GET("api/usuarios/")
    Call<List<Usuario>> listarUsuarios();

}
