package es.cip.diego;

import java.util.Scanner;

public class Input {

    public static int CelToFar(){
        System.out.println("Introduzca una temperatura en Celcius: ");
        int input;
        Scanner entradaEscaner = new Scanner (System.in);

        input = Integer.parseInt(entradaEscaner.nextLine ());
        return input;
    }
}
