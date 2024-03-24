package personas;
import modelo.*;
/**
 * La clase EmpleadoPersonal representa a un empleado de la unidad Personal del Hospital. 
 * Todos estos empleados tienen un horario de trabajo fijo con turno de MAÑANA y de lunes a viernes. 
 * 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmpleadoPersonal extends Empleado
{
    
    /**
     * Constructor for objects of class EmpleadoPersonal
     */
    public EmpleadoPersonal(String nombre, String unidad)
    {
        super(nombre, unidad, "Mañana");
        
    }

    /**
     * Un empleado de administracion puede agregar un nuevo empleado al sistema, 
     * el empleado queda almacenado en la plantilla del hospital. 
     */
    public void agregarEmpleado(Empleado e){
        
        boolean op = Plantilla.getInstancia().agregarEmpleado(e);
        if(op){
            System.out.println("Empleado agregado al sistema");
        }else{
            System.out.println("Empleado ya existente en el sistema");
        }
        
        
    }
    
    public void eliminarEmpleado(int idEmpleado){
        Plantilla.getInstancia().eliminarEmpleado(idEmpleado);
    }
    public void imprimirPlantilla(){
    
        Plantilla.getInstancia().imprimirPlantilla();
    }
   
   
   
}
