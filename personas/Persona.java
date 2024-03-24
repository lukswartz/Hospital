package personas;
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Persona
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String numTelefono;
    private String fechaNacimiento;
    

    /**
     * Constructor for objects of class Persona
     */
    public Persona(String nombre, String numTelefono, String fechaNacimiento)
    {
        // initialise instance variables
        this.nombre = nombre;
        this.numTelefono = numTelefono;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public Persona(String nombre){
        this.nombre= nombre;
        numTelefono = null;
        fechaNacimiento = null;
    }

    public String getNombre(){ return nombre;}
    public String getnumTelefono(){ return numTelefono;}
    public String getFechaNacimiento() {return fechaNacimiento;}
    
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setNumTelefono(String numTelefono){this.numTelefono = numTelefono;}
    public void setfechaNacimiento(String fechaNacimiento){this.fechaNacimiento = fechaNacimiento;}
    
    
}
