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
public class EmpleadoAdministracion extends Empleado
{
    
    /**
     * Constructor for objects of class EmpleadoPersonal
     */
    public EmpleadoAdministracion(String nombre,String dni)
    {
        super(nombre, dni,"Administracion", "Mañana");
        
    }

    /**
     * Un empleado de administracion puede agregar un nuevo empleado al sistema, 
     * el empleado queda almacenado en la plantilla del hospital. 
     */
    public void agregarEmpleado(Empleado e){
        
        
        
    }
    
    public void eliminarEmpleado(int idEmpleado){
        
    }
    
    
    public void asignarUnidad(Sanitario s, String unidad){
        
        Sanitario san = s;
        s.setUnidad(unidad);
        
        System.out.println("El empleado " + s.getNombre() + " ha sido cambiado a la unidad: " + unidad);
        
    }
    
    public void asignarTurno(Sanitario s, String turno){
        
        Sanitario san = s;
        s.setTurno(turno);
        
        System.out.println("El empleado " + s.getNombre() + " ha sido cambiado al turno: " + turno);
        
        
    }
    public String toString(){
        return this.getClass().getSimpleName() + "\n" + 
                super.toString() +
                "=======================================";
                
    }
   
   
   
}
