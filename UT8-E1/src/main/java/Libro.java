public class Libro {

    private String Libro;
    private String Autor;
    private int Ejemplares;
    private int Prestamos;

    public Libro() {

    };

    public Libro(String Libro, String Autor, int Ejemplares, int Prestamos){
        this.Autor = Autor;
        this.Libro = Libro;
        this.Ejemplares = Ejemplares;
        this.Prestamos = Prestamos;
    }


    public String getLibro() {
        return Libro;
    }

    public void setLibro(String libro) {
        Libro = libro;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getEjemplares() {
        return Ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        Ejemplares = ejemplares;
    }

    public int getPrestamos() {
        return Prestamos;
    }

    public void setPrestamos(int prestamos) {
        Prestamos = prestamos;
    }

    public void Prestamo(){
        Ejemplares -= 1;
        Prestamos += 1;
    }

    public boolean Devolución(){
        if (Prestamos <= 0){
            System.out.println("No hay libros prestados");
            return false;
        } else {
            System.out.println("Se ha devuelto correctamente");
            Ejemplares += 1;
            Prestamos -= 1;
            return true;
        }
    }

    @Override
    public String toString() {
        return Libro +" - "+ Autor +" - "+ Ejemplares +" - "+ Prestamos;
    }
}
