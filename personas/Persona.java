package personas;
/**
 * Representa una persona con sus atributos para identificarla de forma única
 * 
 * @author Juan Ortiz López
 */
public abstract class Persona
{
    
    private String nombre;
    private String dni; 
    private String numTelefono;
    private String fechaNacimiento;
    

    /**
     * Constructor for objects of class Persona
     * Se puede iniciar el objeto sólo con nombre y dni, opcionalmente se pueden asignar los valores 
     * del número de Teléfono y de la fecha de Nacimiento en el momento de instanciar. 
     * @param Strin nombre, String dni (obligatorios ambos) 
     * 
     */
    public Persona(String nombre, String dni, String numTelefono, String fechaNacimiento)
    {
        // initialise instance variables
        this.nombre = nombre;
        this.dni = dni; 
        this.numTelefono = numTelefono;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    //Sobrecarga de constructor para inicializar el objeto sin asignar numTelefono y fechaDeNacimiento
    public Persona(String nombre, String dni){
        this(nombre, dni, null, null); 
    }

    // Métodos setters y getters
    public String getNombre(){ return nombre;}
    public String getDNI() {return dni;}
    public String getnumTelefono(){ return numTelefono;}
    public String getFechaNacimiento() {return fechaNacimiento;}
    
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setDNI(String dni) {this.dni = dni;}
    public void setNumTelefono(String numTelefono){this.numTelefono = numTelefono;}
    public void setfechaNacimiento(String fechaNacimiento){this.fechaNacimiento = fechaNacimiento;}
    
    // Se sobreescribe el método heredado de la clase Object toString para mostrar atributos como String
    public String toString(){
        
        return " NOMBRE: " + nombre + " DNI: " + dni  + 
               " NUMERO DE TELÉFONO: " + numTelefono  + 
               " FECHA DE NACIMIENTO: " + fechaNacimiento + "\n";
               
    }
    
}
