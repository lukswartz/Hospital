package personas;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

/**
 * Representa a objetos de tipo empleado. Un empleado se caracteriza por disponer 
 * de un identificador único de tipo entero. También dispone de un campo de instancia
 * de tipo List<> que almacenará la lista de turnos asignados a este empleado. La asignación 
 * incluye fecha, unidad y turno junto con el identificador del empleado. 
 * @author Juan Ortiz 
 * 
 */
public abstract class Empleado extends Persona
{
    
    private int idEmpleado;
    private static int contadorEmpleados = 0;
    private List<Asignacion> turnos; //lista con los turnos asignados al empleado
    
    

    /**
     * Constructor de Empleado. Asigna el nombre, asigna un idEmpleado de forma secuencial
     * mediante el método privado obtenerNuevoIdEmpleado(). 
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
