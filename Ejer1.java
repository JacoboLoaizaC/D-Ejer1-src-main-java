package com.company;

import java.util.Scanner;

public class Ejer1 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        double numeroA;
        double numeroB;

        System.out.println("Escribe dos numeros para onbtener el resultado de suma, resta, multiplicacion y division");

        System.out.println("Dame el valor del primer numero");
        numeroA = scanner.nextDouble();

        System.out.println("Dame el valor del segundo numero");
        numeroB = scanner.nextDouble();

        System.out.println("La suma de estos numeros es " + (numeroA + numeroB));
        System.out.println("La resta de estos dos numeros es " + (numeroA - numeroB));
        System.out.println("La multiplicacion de estos dos numeros es " + (numeroA * numeroB));
        System.out.println("La division de estos dos numeros es " + (numeroA / numeroB));
    }
}
