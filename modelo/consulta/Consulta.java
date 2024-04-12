package modelo.consulta;

import modelo.*;
import personas.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Duration;
import java.time.format.*; 



/**
 * Write a description of class Consulta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Consulta
{
    private static final LocalTime HORA_COMIENZO = LocalTime.of(8,30);
    private static final LocalTime HORA_FINAL = LocalTime.of(14,30);
    private static final Duration MINUTOS_POR_PACIENTE = Duration.ofMinutes(60);
    private static final int NUMERO_HUECOS = (int) Duration.between(HORA_COMIENZO,HORA_FINAL).dividedBy(MINUTOS_POR_PACIENTE);
     
    private LocalDate fecha; 
    private Paciente[] pacientes; 
    
    

    public Consulta(int dia, int mes, int anyo){
        this(LocalDate.of(anyo, mes, dia));
        
    }
    public Consulta(LocalDate fecha){
        this(fecha, new Paciente[NUMERO_HUECOS]);
        
    }
    
    public Consulta(LocalDate fecha, Paciente[] pacientes)
    {
     
        this.fecha = fecha; 
        this.pacientes = pacientes; 
        
    }

    

    public void asignaHora(Paciente p){
        
        for(int i=0; i<pacientes.length; i++){
            if(pacientes[i]== null){
                pacientes[i] = p;
            }
        }
    }
    
    
}
