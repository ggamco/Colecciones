package com.company.indices;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        ArrayList<Double> listaNotas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            System.out.print("Introduce una nota: ");
            listaNotas.add(sc.nextDouble());
        }

        double notas = 0.0d;
        for(Double nota : listaNotas){
            notas += nota;
        }

        System.out.println("La nota media del alumno es: " + notas/listaNotas.size());
    }
}
