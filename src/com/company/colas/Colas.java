package com.company.colas;

import java.util.PriorityQueue;

public class Colas {

    public static void main(String[] args) {

        //FUNCIONA ORDENANDO CADENAS DE CARACTERES ¡OJO! SOLO CON POLL
        PriorityQueue<String> cola = new PriorityQueue<>();
        cola.add("barco");
        cola.add("coche");
        cola.add("casa");
        cola.add("perro");
        cola.add("alfombra");
        cola.add("piso");

        while(cola.size()>0) {
            System.out.println(cola.poll());
        }

        PriorityQueue<Integer> enteros = new PriorityQueue<>();

        enteros.add(35);
        enteros.add(29);
        enteros.add(13);
        enteros.add(12);
        enteros.add(15);
        enteros.add(42);
        enteros.add(17);

        System.out.println("###########");

        for (int i = 0; enteros.size()>i;){
            System.out.println(enteros.poll());
        }

//        while(enteros.size()>0) {
//            System.out.println(enteros.poll());
//        }


    }
}
