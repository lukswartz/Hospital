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
    

    /**
     * Constructor de Empleado. Asigna el nombre, asigna un idEmpleado
     * e inicializa la agenda con un ArrayList vacia. 
     */
    public Empleado(String nombre)
    {
        // initialise instance variables
        super(nombre);
        contadorEmpleados++;
        idEmpleado = obtenerNuevoIdEmpleado();
        
    }
    
    /**
     * Constructor para indicar Ubicacion inicial y turno 
     * del empleado
     */
    public Empleado(String nombre, String unidad, String turno)
    {
        // initialise instance variables
        this(nombre);
        
    }
    
    /*
     * Métodos geters y seters
     */

    public int getIdEmpleado(){ return idEmpleado;}
    
    
    public String toString(){
        return "ID: " + idEmpleado + ".  Nombre: " + getNombre() + "." + "\n";
        
    }
    
    private int obtenerNuevoIdEmpleado(){
        return contadorEmpleados + 1000;
    }
}
