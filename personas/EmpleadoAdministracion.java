package personas;
import modelo.*;
import modelo.consulta.*;
import java.util.List;

/**
 * La clase EmpleadoPersonal representa a un empleado de la unidad Personal del Hospital. 
 * Todos estos empleados tienen un horario de trabajo fijo con turno de MAÑANA y de lunes a viernes. 
 * 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmpleadoAdministracion extends Empleado
{
    
    /**
     * Constructor for objects of class EmpleadoPersonal
     */
    public EmpleadoAdministracion(String nombre,String dni)
    {
        super(nombre, dni);
        
    }

    
    
    public String toString(){
        return this.getClass().getSimpleName() + "\n" + 
                super.toString() +
                "=======================================";
                
    }
   
   
    
   
}
