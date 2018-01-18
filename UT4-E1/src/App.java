public class App {

    public static void main(String[] args){
        int tirada1;
        int tirada2;
        int tirada3;
        int tirada4;
        int max = 6;
        int min = 1;

        System.out.println("Tirada jugador 1:");
        tirada1 = (int)(Math.random() * ((max - min) + 1)) + min;
        System.out.println(tirada1);
        tirada2 = (int)(Math.random() * ((max - min) + 1)) + min;
        System.out.println(tirada2);
        int jugador1 = tirada1+tirada2;

        System.out.println("Tirada jugador 2:");
        tirada3 = (int)(Math.random() * ((max - min) + 1)) + min;
        System.out.println(tirada3);
        tirada4 = (int)(Math.random() * ((max - min) + 1)) + min;
        System.out.println(tirada4);
        int jugador2 = tirada1+tirada2;

        int maximo = Math.max(jugador1,jugador2);
        System.out.println("La tirada más alta ha sido " + maximo);

        if (maximo == jugador1){
            System.out.println("Gana el jugaor 1");
        } else {
            System.out.println("Gana el jugador 2");
        }

        int media= (tirada1+tirada2+tirada3+tirada4)/4;
        
        System.out.println("La media de los 4 dados es " + media);

    }
}
