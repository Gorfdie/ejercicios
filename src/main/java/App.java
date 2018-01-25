
import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = 20;
        options();
        int input = scanner.nextInt();

        while (input< 0 || input > 4) {

            System.out.println("Introduzca una opción válida");
            options();
            input =scanner.nextInt();
        }
        while (input!=0){
            cases(input,length);
            options();
            input= scanner.nextInt();
        }
        System.out.println("Cerrando...");
        scanner.close();
    }

    public static int random(int min, int max){
        int randomnumber = (int)(Math.random() * ((max - min) + 1)) + min;
        return randomnumber;
    }

    public static int[] arry(int length){
        int[] numeros = new int[length];

        for (int i=0;i<= length-1; i++){
            int num = random(1,10);
            numeros[i] = num;
            //System.out.println(num);
        }
        return numeros;
    }

    public static int max(int[] array){
        int max=0;
        for(int i = 0; i < 20; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static int min(int[] array){
        int min=10;
        for(int i = 0; i < 20; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static int media(int[] array){
        int sum = 0;
        for(int i = 0; i < 20; i++){
        sum = array[i]+sum;
        }
        return sum/array.length;
    }

    public static String print(int[] array){
       return Arrays.toString(array);
    }

    public static void options(){
        System.out.println("Seleccione una opción: \n");
        System.out.println("1.Imprimir el mayor valor del array.\n2.Imprimir el menor valor del array.\n3.Calcular la media de todos los valores del array.\n4.Imprimir todos los valores del array.\n0.Salir");

    }

    public static void cases(int input, int length){
        System.out.println("----------------------------------------------");
        switch (input) {
            case 1:
                System.out.println("El valor más alto es "+ max(arry(length)));
                break;
            case 2:
                System.out.println("El valor más bajo es "+ min(arry(length)));
                break;
            case 3:
                System.out.println("El valor medio es "+ media(arry(length)));
                break;
            case 4:
                System.out.println("Los valores del array son " + print(arry(length)));
                break;
        }
        System.out.println("----------------------------------------------");

    }
}
