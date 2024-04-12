package personas;
import java.util.List;
//import modelo.Cita;
import java.util.ArrayList;


/**
 * Un empleado de tipo Sanitario tiene una lista de Citas para cada dia de trabajo. 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Sanitario extends Empleado
{ 
    private List<String> citasSanitario; // citas asignadas a este Sanitario
    
    public Sanitario(String nombre, String dni, String unidad, String turno)
    {
        super(nombre, dni, unidad, turno);
        
         
        citasSanitario = new ArrayList<>();
    }
    
    
    
    public List<String> getCitas(){
        return citasSanitario;
    }
    
    
    public boolean agregarCita(String cita){
        
        return citasSanitario.add(cita);
    }
    
    public String toString(){
       return super.toString();
       
    }
}
