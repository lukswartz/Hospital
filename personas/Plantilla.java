package personas;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


/**
 * Write a description of class Plantilla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plantilla
{
    private static Plantilla plantillaHospital = null;
    private List<Empleado> empleados;
    
    private Plantilla(){
        
        empleados = new ArrayList<>();
        
    }
    
    public static Plantilla getInstancia(){
        
        if(plantillaHospital == null){
            plantillaHospital = new Plantilla();
        }
        
        return plantillaHospital;
    }
    
    public boolean agregarEmpleado(Empleado e){
        
        return empleados.add(e);
        
        
    }
    
    public void eliminarEmpleado(int idEmpleado){
        Iterator<Empleado> it = empleados.iterator();
        while(it.hasNext()){
            Empleado e = it.next(); 
            if(e.getIdEmpleado() == idEmpleado){
                it.remove();
                System.out.println("El empleado " + e.getNombre() + " ha sido eliminado del Sistema");
                break;
            }
            
        }
        
    }
    
    public Empleado getMedicoPorId(int idEmpleado){
        
        for(Empleado e : empleados){
            if(e instanceof Medico){
                if(e.getIdEmpleado() == idEmpleado){
                    return e;
                }
            }
        }
        System.out.println(" No existe el Medico con ese número de Id");
        return null;
    }
    
    public List<Sanitario> getSanitarios(){
        List<Sanitario> sanitarios= new ArrayList<>();
        
        for(Empleado e : empleados){
            if(e instanceof Medico || e instanceof Enfermero || e instanceof Fisio){
                sanitarios.add((Sanitario)e);
                }
            }
            return sanitarios;
        }
        
    public void imprimirPlantilla(){
        if(empleados.isEmpty()){
            System.out.println("No hay empleados en el sistema");
        }
        for(Empleado e: empleados){
            
            System.out.println(e.toString());
            // String clase = e.getClass().toString();
            // System.out.println(e.getIdEmpleado()+ " " + e.getNombre() + " " + clase.substring(15,clase.length()));
        }
    }
    
}
    
   

