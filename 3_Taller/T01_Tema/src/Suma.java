/*
    Materia:Programación orientada a objetos.
    Práctica 1 - Programa 1
    Autor: Joshua Osorio O.
    Fecha: 06/02/2026
    Descripción: Programa que recibe dos números enteros y muestra su suma.
 */

import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {
        int numero1, numero2, suma;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escriba el primer numero entero: ");
        numero1 = entrada.nextInt();
        System.out.print("Escriba el segundo numero entero: ");
        numero2 = entrada.nextInt();
        suma = numero1 + numero2;
        System.out.printf("La suma es %d%n", suma);
    }
}
