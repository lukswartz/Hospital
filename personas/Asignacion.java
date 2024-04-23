package personas;
import java.time.LocalDate;
import java.time.format.*;
import java.util.*;


/**
 * Objetos que indican el turno del trabajador entre dos fechas 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asignacion
{
    // instance variables - replace the example below with your own
    private String unidad; //Consultas, Urgencias, UCI, Quirófano
    private String turno; 
    private LocalDate fechaInicio;
    private LocalDate fechaFin; 
    
    /**
     * Si solo se pasan dia, mes y año de inicio, la fecha de fin es igual a la fecha de inicio
     * (asignación para un sólo dia)
     */
    
     public Asignacion(String unidad, String turno, int diaInicio, int mesInicio, int anyoInicio){
        this(unidad, turno, diaInicio, mesInicio, anyoInicio,diaInicio, mesInicio, anyoInicio );
        
    }

    /**
     * Sobrecarga de constructor para introducir, unidad, turno, dia, mes y año de la fecha de inicio y de fin. 
     *
     */
    
    public Asignacion(String unidad, String turno, int diaInicio, int mesInicio, int anyoInicio,
                                              int diaFin, int mesFin, int anyoFin){
        this(unidad, turno, LocalDate.of(anyoInicio, mesInicio, diaInicio), LocalDate.of(anyoFin, mesFin, diaFin));
        
    }
    
   
    public Asignacion(String unidad, String turno, LocalDate fechaInicio, LocalDate fechaFin)
    {
       this.unidad = unidad; 
       this.turno = turno; 
       this.fechaInicio = fechaInicio; 
       this.fechaFin = fechaFin; 
        
       
    }

    public String turno(){
        return turno; 
    }
    public String unidad(){
        return unidad; 
    }
    public LocalDate getFechaInicio(){
        return fechaInicio; 
    }
    
     public LocalDate getFechaFin(){
        return fechaFin; 
    }
    
    public void setFechaInicio (int dia, int mes, int anyo){
        fechaInicio = LocalDate.of(anyo, mes, dia);
    }
    
    public void setFechaFin (int dia, int mes, int anyo){
        fechaFin = LocalDate.of(anyo, mes, dia);
    }
    
    /**
     * Imprime en una lista, cada fecha incluida en el perido junto con la unidad y el turno asignado. 
     */
    public void printAsignacion(){
        
        for (LocalDate date = fechaInicio; date.isBefore(fechaFin.plusDays(1)); date = date.plusDays(1)) {
    
            System.out.println(date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+ " Unidad: " + unidad + " Turno: " + turno);
        }
    }
}
