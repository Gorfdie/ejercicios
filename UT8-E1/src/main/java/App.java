public class App {

    public static void main(String[] args) {

    Libro l1 = new Libro("El Quijote de La Mancha", "Miguel de Cervantes", 2 , 0);
    Libro l2 = new Libro("El Capitán Alatriste", "Arturo Pérez Reverte", 1, 0 );
    System.out.println(l1.toString());
    System.out.println(l2.toString());

    l1.Prestamo();
    l1.Prestamo();
    l2.Prestamo();

    System.out.println(l1.toString());
    System.out.println(l2.toString());


    l1.Devolución();
    System.out.println(l1.toString());
    System.out.println(l2.toString());



    }
}
