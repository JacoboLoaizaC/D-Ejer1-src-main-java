package com.company;

import java.util.Scanner;

public class Ejer2 {
    public static void main (String [] args) {
       Scanner scanner = new Scanner(System.in);

       double equivalencia;
       double cantidadDolares;

       System.out.println("Ingresa el valor del dolar en pesos: ");
       equivalencia = scanner.nextDouble();
       System.out.println("Ingresa la cantidad de dolares: ");
       cantidadDolares = scanner.nextDouble();

       double pesos = cantidadDolares * equivalencia;

       System.out.printf("%f dolares equivalen a %f pesos/n", cantidadDolares, pesos);

    }
}
