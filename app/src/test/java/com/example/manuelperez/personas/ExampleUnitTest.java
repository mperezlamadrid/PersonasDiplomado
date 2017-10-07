package com.example.manuelperez.personas;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void cantidad_mujeres_correcta() throws Exception {
        Persona p1 = new Persona("12345678", "Manuel", "Perez", 0);
        Persona p2 = new Persona("98765432", "Bryan", "Cuadrado", 0);
        Persona p3 = new Persona("47382674", "Nicole", "Escobar", 1);
        Persona p4 = new Persona("93487542", "Katrina", "Rodriguez", 1);
        Persona p5 = new Persona("93487544", "Dairy", "Lamadrid", 1);
        Persona p6 = new Persona("35454546", "Bryan", "Algutria", 0);
        Persona p7 = new Persona("35454546", "Yessica", "Villalobos", 1);

        Persona personas[] = {p1, p2, p3, p4, p5, p6, p7};
        ArrayList<Persona> p = new ArrayList<>(Arrays.asList(personas));

        assertEquals(4, Metodos.cuantas_mujeres(p));

    }

    @Test
    public void cantidad_hombres_correcta() throws Exception {
        Persona p1 = new Persona("12345678", "Manuel", "Perez", 0);
        Persona p2 = new Persona("98765432", "Bryan", "Cuadrado", 0);
        Persona p3 = new Persona("47382674", "Nicole", "Escobar", 1);
        Persona p4 = new Persona("93487542", "Katrina", "Rodriguez", 1);
        Persona p5 = new Persona("93487544", "Dairy", "Lamadrid", 1);
        Persona p6 = new Persona("35454546", "Bryan", "Algutria", 0);
        Persona p7 = new Persona("35454546", "Yessica", "Villalobos", 1);

        Persona personas[] = {p1, p2, p3, p4, p5, p6, p7};
        ArrayList<Persona> p = new ArrayList<>(Arrays.asList(personas));

        assertEquals(3, Metodos.cuantos_hombres(p));

    }

    @Test
    public void cuales_son_hombres_correcta() throws Exception {
        Persona p1 = new Persona("12345678", "Manuel", "Perez", 0);
        Persona p2 = new Persona("98765432", "Bryan", "Cuadrado", 0);
        Persona p3 = new Persona("47382674", "Nicole", "Escobar", 1);
        Persona p4 = new Persona("93487542", "Katrina", "Rodriguez", 1);
        Persona p5 = new Persona("93487544", "Dairy", "Lamadrid", 1);
        Persona p6 = new Persona("35454546", "Bryan", "Algutria", 0);
        Persona p7 = new Persona("35454546", "Yessica", "Villalobos", 1);

        Persona personas[] = {p1, p2, p3, p4, p5, p6, p7};
        Persona hombres[] = {p1, p2, p6};

        ArrayList<Persona> pers = new ArrayList<>(Arrays.asList(personas));
        ArrayList<Persona> homb = new ArrayList<>(Arrays.asList(hombres));

        assertEquals(homb, Metodos.cuales_hombres(pers));

    }
}