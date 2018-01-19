import java.util.Scanner;

public class App {

    public static void main(String[] args){
        int min=1, max=100;
        int random = random(min,max);
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(random);


        for(int i = 0; i < 100; i++){
            System.out.println("Introduzca un número: ");
            int input = Integer.parseInt(scanner.nextLine());

            if(input == random){
                System.out.println("Felicidades, has ganado con "+counter+" intentos");
                break;
            } else {
                System.out.println("Intentalo de nuevo");
                counter++;
            }
        }
    }

    public static int random(int min, int max){
        int randomnumber = (int)(Math.random() * ((max - min) + 1)) + min;
        return randomnumber;
    }
}
