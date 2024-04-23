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
    private List<String> citasSanitario; // citas asignadas a este Sanitario
    
    public Sanitario(String nombre, String dni,String especialidad)
    {
        super(nombre, dni);
    
        this.especialidad = especialidad; 
         
        citasSanitario = new ArrayList<>();
    }
    
    
    
    
    
    public String especialidad(){
        return especialidad;
    };
    
    public String toString(){
       return super.toString();
       
    }
}
