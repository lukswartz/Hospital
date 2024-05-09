package personas;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;


/**
 * Un empleado de tipo Sanitario tiene una lista de Citas para cada dia de trabajo. 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Sanitario extends Empleado
{ 
    
    private String especialidad; 
    private Estudiante alumno; 
    
    
    
    
    public Sanitario(String nombre, String dni,String especialidad)
    {
        super(nombre, dni);
    
        this.especialidad = especialidad; 
         
        
    }
    
    
    
    public String especialidad(){
        return especialidad;
    };
    
    public Estudiante alumno(){
        return alumno; 
    }
    
    public void asignarEstudiante (Estudiante e){
        alumno = e; 
    }
    public String toString(){
       return super.toString();
       
    }
}
