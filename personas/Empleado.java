package personas;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

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
    private List<Asignacion> turnos; //lista con los turnos asignados al empleado
    
    

    /**
     * Constructor de Empleado. Asigna el nombre, asigna un idEmpleado
     * 
     */
    public Empleado(String nombre, String dni)
    {
        // initialise instance variables
        super(nombre, dni);
        turnos = new ArrayList<>();
        contadorEmpleados++;
        idEmpleado = obtenerNuevoIdEmpleado();
        
    }
    

    
    /*
     * Métodos geters y seters
     */

    public int getIdEmpleado(){ return idEmpleado;}
    

    public List<Asignacion> turnos(){
        return turnos; 
    }
    
    
    /**
     * agrega a la lista de turnos del empleado una nueva asignación. 
     */
    public void asignarTurno(Asignacion a){
        turnos.add(a);
    }
    
    
    
    /**
     * Método que recorre la lista de asignaciones y comprueba si en la fecha
     * pasada por parámetro el empleado está en la unidad pasada por parámetro. 
     */

    
    public void imprimirAsignaciones(){
        
        System.out.println("Lista de turnos asignados a: " + this.getNombre());
        
        if(turnos.isEmpty()){
            System.out.println("El empleado no tiene turnos asignados");
        }else{
        
            for(Asignacion a: turnos){
                System.out.println(a);
            }
        }
    }
    public String toString(){
        
        return super.toString() + 
               " ID: " + idEmpleado  +  "\n";
        
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
