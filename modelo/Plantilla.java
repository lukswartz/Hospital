package modelo;
import personas.*;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


/**
 * Write a description of class Plantilla here.
 * Almacena todos los objetos empleados. 
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
    
    
    //METODOS DEL OBJETO PLANTILLA 
    
    public Empleado obtenerEmpleadoPorId(int id){
        for(Empleado e: empleados){
            if(e.getIdEmpleado() == id){
                return e; 
            }
        }
        
        return null; 
    }
    
    public void mostrarEmpleadosAdmin(){
        System.out.println("Mostrando empleados de administración existentes en el sistema...");
        for(Empleado e: empleados){
            if(e instanceof EmpleadoAdministracion){
                
                System.out.println("Nombre: " + e.getNombre() + " ID: " + e.getIdEmpleado());
            }
        }
    }
    public EmpleadoAdministracion obtenerAdmin(int id){
        
        for(Empleado e: empleados){
            if(e.getIdEmpleado() == id){
                return (EmpleadoAdministracion)e; 
            }
        }
        
        return null; 
        
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
        
        public Sanitario buscarSanitarioPorID(int idEmpleado){
            
                int index = 0; 
                List<Sanitario> lista = getSanitarios(); 
                                
                while(index< lista.size()){
                
                    Sanitario s = lista.get(index); 
                        
                    if(idEmpleado==s.getIdEmpleado()){
                    
                        if(s instanceof Medico){
                        
                            return (Medico)s; 
                        }else if(s instanceof Enfermero){
                            return (Enfermero)s; 
                        }else if(s instanceof Fisio){
                            return (Fisio)s; 
                        }
                    }
                    index++;
            }
            
            
            return null; 
            
        }
        
        
    public String empleadosEnSistemaComoString(){
        StringBuilder listado = new StringBuilder("****LISTADO DE EMPLEADOS ALMACENADOS EN EL SISTEMA*****\n");
        for(Empleado e: empleados){
            listado.append("Id: " + e.getIdEmpleado() + 
                           ". Nombre: " +  e.getNombre() +
                           ". Categoria: " +  e.getClass().getSimpleName()+"\n"
                            );
                                                                  
        }
        
        return listado.toString();
    }
    
    public void imprimirPlantilla(){
        if(empleados.isEmpty()){
            System.out.println("No hay empleados en el sistema");
        }
        for(Empleado e: empleados){
            
            System.out.println(e.toString());
            
        }
    }
    
   
}
    
   

