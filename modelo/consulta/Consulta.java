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
public abstract class Consulta
{
    //CONSTANTES DE CLASE. TODAS LAS CONSULTAS TENDRÁN ESTOS ATRIBUTOS. 
    private static final LocalTime HORA_COMIENZO = LocalTime.of(8,30);
    private static final LocalTime HORA_FINAL = LocalTime.of(14,30);
    private static final Duration MINUTOS_POR_PACIENTE = Duration.ofMinutes(60);
    private static final int NUMERO_HUECOS = (int) Duration.between(HORA_COMIENZO,HORA_FINAL).dividedBy(MINUTOS_POR_PACIENTE);
    
    private Sanitario sanitario; 
    private LocalDate fecha; 
    private Paciente[] pacientes; 
    
    

    public Consulta(Sanitario sanitario, int dia, int mes, int anyo){
        this(sanitario, LocalDate.of(anyo, mes, dia));
        
    }
    public Consulta(Sanitario sanitario, LocalDate fecha){
        this.sanitario = sanitario;
        this.fecha = fecha;
        pacientes = new Paciente[NUMERO_HUECOS];
        
    }
    

    
    /**
     * Método selector que nos devuelve la fecha de la consulta actual como objeto 
     * de tipo LocalDate de la Api java.time
     */
    public LocalDate fecha(){
        return fecha; 
    }
    
    public Sanitario sanitario(){
        return sanitario; 
    }
    
    /**
     * método que deveuelve la especialidad del sanitario
     */
    public String especialidad(){
        return sanitario.especialidad();
    };
    
    
    /**
     * Método asignarHora: 
     * @param: recibe como parámetro un objeto Paciente. 
     * @return: devuelve un entero con el índice de la posición donde se almacena el paciente
     *           devuelve -1 si no puede asignarse hora (no hay cita ese dia o el paciente está
     *           repetido)
     */
    public int asignarHora(Paciente p){
        
        if(pacienteRepetido(p)) return -1; 
        
        int indice = 0; 
        
        while(indice<pacientes.length){
            
            if(pacientes[indice] == null){
                pacientes[indice] = p; 
                return indice; 
            }
            indice++;
        }
        
        return -1; 
    }
    
    
    private boolean pacienteRepetido(Paciente p){
        int indice = 0; 
        
        while(indice<pacientes.length){
            
            if(pacientes[indice] == p) {
                return true;
            } 
            indice++;
            
            
        }
        
        return false; 
        
    }
    
    public void imprimirListaPacientes(){
        
    String res = ""; 
        
        
        for(int i=0; i<pacientes.length; i++){
            if(pacientes[i]!=null){
                
                LocalTime hora= HORA_COMIENZO.plusMinutes(MINUTOS_POR_PACIENTE.toMinutes()*i);
                res+="Paciente: " + pacientes[i].getNombre() + " Hora: " +  hora.toString() + "\n";
                
            }
        }
        
    System.out.println(res);
    }
}
