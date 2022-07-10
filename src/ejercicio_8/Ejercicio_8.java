
package ejercicio_8;

/**
 *
 * @author sebas
 */
public class Ejercicio_8 {

    
    public static void main(String[] args) {
        Persona persona = new Persona();
        
        persona.setEdad(25);
        
        persona.setNombre("Juan Carlos");
        
        persona.setTelefono("57+3124560796");
        
        System.out.print("edad=" +persona.getEdad());
        System.out.print("  nombre= " +persona.getNombre());
        System.out.print("  telefono= " +persona.getTelefono());
        
    }
    
}

class Persona{

    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}