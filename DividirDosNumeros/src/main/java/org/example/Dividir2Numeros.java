package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Dividir2Numeros {

    public static void dividir(){
       double num1, num2, resultado;
       boolean nextDivi = false;
       String userDesicion;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Ingrese el pŕimer numero: ");
            num1 = input.nextDouble();

            System.out.println("Ingrese al segundo numero: ");
            num2 = input.nextDouble();

            resultado = num1 / num2;

            System.out.printf("El resultado es %.1f \n", resultado);

            System.out.print("Quiere realizar otra división?: ");
            userDesicion = input.next();

            if(userDesicion.toLowerCase().equals("si")){
                nextDivi = true;
            }


        }while (nextDivi);


    }

    public static void main(String[] args) {

        dividir();

    }
}