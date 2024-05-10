package personas;

import java.time.LocalDate;
import java.time.format.*;
import java.util.*;
import modelo.consulta.*;



/**
 * Objetos que indican la unidad y el turno de un trabajador en una fecha. 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asignacion
{
    // instance variables - replace the example below with your own
    private int idEmpleado; 
    private String unidad; //Consultas,Hospitalizacion, Urgencias, UCI, Quirófano
    private String turno; 
    private LocalDate fecha;  
    
   
    /**
     * Sobrecarga de constructor para introducir, unidad, turno, dia, mes y año de la fecha de inicio y de fin. 
     *
     */
    
    public Asignacion(String unidad, String turno, int dia, int mes, int anyo){
        this(unidad, turno, LocalDate.of(anyo, mes, dia));
        
    }
    
   
    public Asignacion(String unidad, String turno, LocalDate fecha)
    {
       this.unidad = unidad; 
       this.turno = turno; 
       this.fecha= fecha; 
       
       
    }


    public String turno(){
        return turno; 
    }
    public String unidad(){
        return unidad; 
    }
    public LocalDate getFecha(){
        return fecha; 
    }
    
    
    
    
    /**
     * Imprime en una lista, cada fecha incluida en el perido junto con la unidad y el turno asignado. 
     */
    public String toString(){
        
       return "Asignación de turno. Fecha: " + fecha.toString() +
               " Unidad: " + unidad  + " Turno: "  + turno ; 
               
    }
    
   
}
