package com.senac_android.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.senac_android.R;
import com.senac_android.models.Usuario;

import java.util.List;

public class UsuarioAdapter extends BaseAdapter {
    Context context;
    List<Usuario> usuarios;
    private LayoutInflater mInflater;

    public UsuarioAdapter(Context context, List<Usuario> usuarios) {
        this.context = context;
        this.usuarios = usuarios;
    }

    @Override
    public int getCount() {
        return usuarios.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }


    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint("InflateParams")
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        final Usuario usuario = usuarios.get(i);

        final UsuarioAdapter.ListContent holder;
        if (view == null) {
            mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = mInflater.inflate(R.layout.usuario_it_lista, null);
            holder = new UsuarioAdapter.ListContent();
            holder.usuario_item_lista_nome = (TextView) view.findViewById(R.id.usuario_item_lista_nome);
            holder.usuario_item_lista_textview_estadoCivil = (TextView) view.findViewById(R.id.usuario_item_lista_textview_estadoCivil);
            holder.usuario_item_lista_button = (Button) view.findViewById(R.id.usuario_item_lista_button);


            view.setTag(holder);
        }
        else {
            holder = (UsuarioAdapter.ListContent) view.getTag();
        }

        holder.usuario_item_lista_nome.setText(usuario.getNome());
        holder.usuario_item_lista_textview_estadoCivil.setText(String.valueOf(usuario.isEstadoCivil()));
        holder.usuario_item_lista_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"teste",Toast.LENGTH_SHORT).show();
            }
        });


        return view;
    }


    public static class ListContent {
        TextView usuario_item_lista_nome,usuario_item_lista_textview_estadoCivil;
        Button usuario_item_lista_button;
    }
}
