package es.cip.diego;

import java.util.Scanner;

public class Input {

    public static float Question() {
        System.out.println("¿Qué opción desea?");
        System.out.println("1. Celcius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celcius");
        int input;
        Scanner entradaEscaner = new Scanner(System.in);
        input = Integer.parseInt(entradaEscaner.nextLine());
        float result = 0;
        if (input == 1) {
            result =CelToFar();
        } else if (input == 2) {
            result = FarToCel();
        }
        return result;
    }



    public static float CelToFar(){
        System.out.println("Introduzca una temperatura en Celcius: ");
        float input;
        Scanner entradaEscaner = new Scanner (System.in);

        input = Integer.parseInt(entradaEscaner.nextLine ());
        return Conversions.CelToFar(input);
    }

    public static float FarToCel(){
        System.out.println("Introduzca una temperatura en Fahrenheit: ");
        float input;
        Scanner entradaEscaner = new Scanner (System.in);

        input = Integer.parseInt(entradaEscaner.nextLine ());
        return Conversions.FarToCel(input);
    }


}
