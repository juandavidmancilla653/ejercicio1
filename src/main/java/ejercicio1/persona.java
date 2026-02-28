package ejercicio1;

public class persona {
    private String nombre;
    private String apellido;
    private String cedula;
    private int anioNacimiento;

    public persona(String nombre, String apellido, String cedula, int anioNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.anioNacimiento = anioNacimiento;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Cédula: " + cedula);
        System.out.println("Año de nacimiento: " + anioNacimiento);
        System.out.println("---");
    }
}