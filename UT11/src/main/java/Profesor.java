public class Profesor extends Persona {

    private String salario;


    public Profesor(String nombre, int anyoNacimiento, String salario){
        super(nombre, anyoNacimiento);
        this.salario = salario;
    }

    public String getCurso() {
        return salario;
    }

    public void setCurso(String curso) {
        this.salario = curso;
    }

    @Override
    public String toString() {
        return "Alumno | Salario: "+ salario + " | Nombre: "+getNombre() + " | Año: " + getAnyoNacimiento() + " |";
    }

    public void calculaDescuento(Double importe) {
        System.out.println("El descuento de los profesores es del 2%");
        double descuento = importe * 0.02;
        double total = importe - descuento;
        System.out.println("El descuento es de " + descuento + "€, por lo tanto el total es de "+ total + "€.");
    }
}
