package personas;
import java.time.LocalTime;
import java.time.LocalDate;


/**
 * Write a description of class Cita here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cita
{
    
    
    private LocalDate fecha; 
    private LocalTime hora; 
    private int idPaciente; 
    
    
    
    public Cita(LocalDate fecha)
    {
        this.fecha = fecha; 
        idPaciente = 0; 
        
    }

    
    public LocalDate fecha(){
        
        return fecha; 
    }
    
    public LocalTime hora(){
        return hora; 
    }
    
    public void setHora(int hora, int minutos){
        
        this.hora = LocalTime.of(hora, minutos);
        
        
    }
   
    public int paciente(){
        return idPaciente; 
    }
    
    public void setPaciente(int idPaciente){
        this.idPaciente = idPaciente; 
    }
    
    
    public String toString(){
        return "Cita:  " + fecha.toString() + "--" + hora.toString();
    }
}
