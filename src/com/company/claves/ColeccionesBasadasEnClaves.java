package com.company.claves;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class ColeccionesBasadasEnClaves {


    public static void main(String[] args) {

        //BASADAS EN CLAVES
        //HASHTABLE o HASHMAP

        Hashtable<String, String> listaPersonas = new Hashtable<>();

        HashMap<String, String> listaNombres = new HashMap<>();



        //1º HASHTABLE
        listaPersonas.put("profesor", "Gustavo");
        listaPersonas.put("alumno", "Jose Mari");
        listaPersonas.put("alumna", "Ana");
        listaPersonas.put("alumno", "Andrea");
        //listaPersonas.put(null, null);

        String profesor = listaPersonas.get("profesor");

        //System.out.println(profesor);

        listaPersonas.contains("Gustavo"); //true en caso de existir el value dentro de la coleccion
        listaPersonas.containsKey("profesor"); //true en caso de existir una clave llamada profesor
        //listaPersonas.remove("alumno");

        Set<String> keySet = listaPersonas.keySet();

        for(String key : keySet){
            System.out.println(key);
            System.out.println(listaPersonas.get(key));
        }

        System.out.println("###########################");

        //2º HASHMAP
        listaNombres.put("profesor", "Gustavo");
        listaNombres.put("alumno", "Andrea");
        listaNombres.put("alumna", "Rocio");
        listaNombres.put(null, null);

        String alumno = listaNombres.get("alumno");

        Set<String> keySetNombres = listaNombres.keySet();

        for(String key : keySetNombres){
            System.out.println(key);
            System.out.println(listaNombres.get(key));
        }

    }


}
