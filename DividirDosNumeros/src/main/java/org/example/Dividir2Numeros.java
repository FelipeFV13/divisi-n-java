package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Dividir2Numeros {

    public static void dividir(){
       double num1, num2, resultado;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el pŕimer numero: ");
        num1 = input.nextDouble();

        System.out.println("Ingrese al segundo numero: ");
        num2 = input.nextDouble();

        resultado = num1 / num2;

        System.out.printf("El resultado es %.1f", resultado);
    }

    public static void main(String[] args) {

        dividir();

    }
}