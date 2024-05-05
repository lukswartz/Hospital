package modelo.consulta;
import personas.*;
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
   private Sanitario sanitario; 
   private LocalDate fecha; 
   private LocalTime hora; 
   private String especialidad; 
   private int idPaciente; 
   

    /**
     * Constructor for objects of class Cita
     */
    public Cita(Sanitario s, LocalDate f, LocalTime h)
    {
       sanitario = s; 
       fecha = f; 
       hora = h; 
       especialidad = sanitario.especialidad();
    }

    public void asignaCitaAPaciente(int idPaciente){
        this.idPaciente = idPaciente; 
    }
    
    public String toString(){
        
        return "Cita para " + especialidad + " Fecha: " + fecha.toString() + "  Hora: " + hora; 
    }
}
