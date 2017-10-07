package com.example.manuelperez.personas;

import java.util.ArrayList;

/**
 * Created by manuelperez on 9/30/17.
 */

public class Metodos {
    public static int cuantas_mujeres(ArrayList<Persona> personas){
        int cont = 0;

        for (int i = 0; i < personas.size() ; i++) {
            if (personas.get(i).getSexo() == 1) cont++;
        }

        return cont;
    }

    public static int cuantos_hombres(ArrayList<Persona> personas){
        int cont = 0;

        for (int i = 0; i < personas.size() ; i++) {
            if (personas.get(i).getSexo() == 0) cont++;

        }

        return cont;
    }

    public static ArrayList<Persona> cuales_mujeres(ArrayList<Persona> personas){
        ArrayList<Persona> mujeres = new ArrayList();

        for (int i = 0; i < personas.size() ; i++) {
            if (personas.get(i).getSexo() == 1)mujeres.add(personas.get(i));
        }

        return mujeres;
    }

    public static ArrayList<Persona> cuales_hombres(ArrayList<Persona> personas){
        ArrayList<Persona> hombres = new ArrayList();

        for (int i = 0; i < personas.size() ; i++) {
            if (personas.get(i).getSexo() == 0)hombres.add(personas.get(i));
        }

        return hombres;
    }
}
