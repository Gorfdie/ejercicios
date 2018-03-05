public class Alumno extends Persona {

    private String curso;


    public Alumno(String nombre, int anyoNacimiento, String curso){
        super(nombre, anyoNacimiento);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Alumno | Curso: "+ curso + " | Nombre: "+getNombre() + " | Año: " + getAnyoNacimiento() + " |";
    }


    public void calculaDescuento(Double importe) {
        System.out.println("El descuento de los alumnos es del 10%");
        double descuento = importe * 0.1;
        double total = importe - descuento;
        System.out.println("El descuento es de " + descuento + "€, por lo tanto el total es de "+ total + "€.");
    }
}
