package es.cip.diego;

public class Main {

    public static void main(String[] args){
        int num;
        int result;

        num = Input.CelToFar();

        result = Conversions.CelToFar(num);

        System.out.println("El resultado es: " + result);
    }
}
