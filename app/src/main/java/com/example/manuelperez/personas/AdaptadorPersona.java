package com.example.manuelperez.personas;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.content.res.ResourcesCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by manuelperez on 10/7/17.
 */

public class AdaptadorPersona extends BaseAdapter {
    private Context contexto;
    private ArrayList<Persona> personas;
    private Resources res;

    public AdaptadorPersona(Context contexto, ArrayList<Persona> personas) {
        this.contexto = contexto;
        this.personas = personas;
    }

    @Override
    public int getCount() {
        return personas.size();
    }

    @Override
    public Object getItem(int i) {
        return personas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        // Definir variables a utilizar

        res = contexto.getResources();
        View v = view;

        // Crear el objeto LayoutInflater para modificar la vista

        LayoutInflater inf = (LayoutInflater)contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inf.inflate(R.layout.item_lista, null);

        // Crear un objeto Persona

        Persona p = personas.get(i);

        // Capturar elementos de la vista

        ImageView foto = (ImageView)v.findViewById(R.id.imgFoto);
        TextView nombre = (TextView)v.findViewById(R.id.lblNombre);
        TextView apellido = (TextView)v.findViewById(R.id.lblApellido);

        // Setear elementos a la vista

        //foto.setImageDrawable(res.getDrawable(p.getFoto()));
        foto.setImageDrawable(ResourcesCompat.getDrawable(res, p.getFoto(), null));
        nombre.setText(p.getNombre());
        apellido.setText(p.getApellido());

        return v;
    }
}
