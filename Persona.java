/**
 * @author Abigail Acosta
 */

public class Persona {
    protected String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    protected String getNombre() { 
        return this.nombre; 
    }
    public int getEdad() { 
        return edad;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
    }
}