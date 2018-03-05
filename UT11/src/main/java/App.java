public class App {
    public static void main(String[] args) {

        Profesor p1 = new Profesor("Alfonso", 1975, "1000");
        Alumno a1 = new Alumno("Pepe", 1995, "Primero");

        System.out.println(a1.toString());
        System.out.println(p1.toString());

        a1.calculaDescuento(50.0);
        p1.calculaDescuento(50.0);


    }
}
