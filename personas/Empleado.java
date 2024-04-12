package personas;

/**
 * Write a description of class Empleado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Empleado extends Persona
{
    // instance variables - replace the example below with your own
    private int idEmpleado;
    private static int contadorEmpleados = 0;
    private String unidad; 
    private String turno; 
    
    

    /**
     * Constructor de Empleado. Asigna el nombre, asigna un idEmpleado
     * 
     */
    public Empleado(String nombre, String dni)
    {
        // initialise instance variables
        super(nombre, dni);
        contadorEmpleados++;
        idEmpleado = obtenerNuevoIdEmpleado();
        
    }
    
    /**
     * Constructor para indicar Ubicacion inicial y turno 
     * del empleado
     */
    public Empleado(String nombre, String dni, String unidad, String turno)
    {
        this(nombre, dni);
        this.unidad = unidad; 
        this.turno = turno; 
        
    }
    
    /*
     * Métodos geters y seters
     */

    public int getIdEmpleado(){ return idEmpleado;}
    public String getUnidad() { return unidad; }
    public String getTurno() { return turno; }
    
    public void setUnidad(String unidad){this.unidad = unidad;}
    public void setTurno(String turno) {this.turno = turno;}
       
    
    public String toString(){
        
        return super.toString() + 
               " ID: " + idEmpleado  + ". UNIDAD: " + getUnidad() + ". TURNO: " + getTurno() +  "\n";
        
    }
    /**
     * Método privado que asigna un identificador único a cada Empleado. 
     * Los identificadores de empleado empiezan por 1 para los sanitarios 
     * y por 2 para los no sanitarios.
     */
    private int obtenerNuevoIdEmpleado(){
        
        if(this instanceof Medico || this instanceof Enfermero || this instanceof Fisio){
            return contadorEmpleados + 1000;
        }else{
        return contadorEmpleados + 2000;
        }
    }
}
