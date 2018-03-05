public abstract class Persona implements Descuento{

    private String nombre;
    private int anyoNacimiento;
    private int descuento;

    public Persona(String nombre, int anyoNacimiento){
        this.anyoNacimiento = anyoNacimiento;
        this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnyoNacimiento() {
        return anyoNacimiento;
    }

    public void setAnyoNacimiento(int anyoNacimiento) {
        this.anyoNacimiento = anyoNacimiento;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
}
