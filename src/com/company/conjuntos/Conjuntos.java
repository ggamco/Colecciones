package com.company.conjuntos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Conjuntos {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        HashSet<String> lista = new HashSet<>();
        lista.add(sc.next());
        lista.add(sc.next());

        for (String data : lista) {
            System.out.println(data);
        }

        System.out.println("###############");

        Iterator<String> iterator = lista.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        lista = new HashSet<>();

        while(lista.iterator().hasNext()){
            System.out.println("Existe siguiente dato");
        }




    }

}
