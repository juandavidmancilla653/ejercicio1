package ejercicio1;

public class Main {

    public static void main(String[] args) {

        persona persona1 = new persona("Juan", "Perez", "123456", 1990);
        persona persona2 = new persona("Maria", "Lopez", "789101", 1999);

        persona1.mostrarDatos();
        persona2.mostrarDatos();
    }
}