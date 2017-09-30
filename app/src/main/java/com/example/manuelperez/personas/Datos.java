package com.example.manuelperez.personas;

import java.util.ArrayList;

/**
 * Created by manuelperez on 9/30/17.
 */

public class Datos {
    private static ArrayList<Persona> personas = new ArrayList();

    public static void guardarPersona(Persona p){
        personas.add(p);
    }

    public static ArrayList<Persona> obtenerPersonas(){
        return personas;
    }
}
