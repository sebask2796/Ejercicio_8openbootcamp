
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
        
        persona.setTelefono(31245606);
        
        System.out.print(" mi edad es=" +persona.getEdad());
        System.out.print(" mi nombre es= " +persona.getNombre());
        System.out.print(" mi telefono es= " +persona.getTelefono());
        
    }
    
}

class Persona{

    private int edad;
    private String nombre;
    private int telefono;

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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
    
}