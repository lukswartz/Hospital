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
    private String dni; 
    private String numTelefono;
    private String fechaNacimiento;
    

    /**
     * Constructor for objects of class Persona
     */
    public Persona(String nombre, String dni, String numTelefono, String fechaNacimiento)
    {
        // initialise instance variables
        this.nombre = nombre;
        this.dni = dni; 
        this.numTelefono = numTelefono;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public Persona(String nombre, String dni){
        this(nombre, dni, null, null); 
    }

    public String getNombre(){ return nombre;}
    public String getDNI() {return dni;}
    public String getnumTelefono(){ return numTelefono;}
    public String getFechaNacimiento() {return fechaNacimiento;}
    
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setDNI(String dni) {this.dni = dni;}
    public void setNumTelefono(String numTelefono){this.numTelefono = numTelefono;}
    public void setfechaNacimiento(String fechaNacimiento){this.fechaNacimiento = fechaNacimiento;}
    
    public String toString(){
        
        return " NOMBRE: " + nombre + " DNI: " + dni  + 
               " NUMERO DE TELÉFONO: " + numTelefono  + 
               " FECHA DE NACIMIENTO: " + fechaNacimiento + "\n";
               
    }
    
}
