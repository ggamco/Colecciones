package com.company.indices;

import java.util.ArrayList;

public class ColeccionesBasadasEnIndices {

    public static void main(String[] args) {

        ArrayList<String> listaNombres = new ArrayList<>();
        listaNombres.add("Gustavo");
        listaNombres.add("Antonio");
        listaNombres.add(1, "Pedro");

        String nombre = listaNombres.get(0);

        System.out.println("El nombre almacenado es: " + nombre);

        for(int i = 0; i<listaNombres.size();i++){
            System.out.println(listaNombres.get(i));
        }

        listaNombres.set(1, "Francisco");
        listaNombres.add("Jose");
        listaNombres.add(null);
        System.out.println("El tamaño de la lista es: " + listaNombres.size());

        System.out.println("====");
        for(String name : listaNombres){
            System.out.println(name);
        }
        System.out.println("====");

        listaNombres.trimToSize();
        System.out.println("El tamaño de la lista es: " + listaNombres.size());

        ArrayList<Integer> listaEnteros = new ArrayList<>();
        //listaEnteros.add("cade");

        ArrayList lista = new ArrayList();
        lista.add(13);
        lista.add("trece");


    }

}
