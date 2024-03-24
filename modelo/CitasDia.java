package modelo;
import personas.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.time.LocalTime;
import java.util.HashMap;


/**
 * Write a description of class CitasDia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CitasDia
{
    private final int HORA_INICIO = 9;
    private final int HORA_FIN = 15;
    private final int MINUTOS_HUECO= 30;
    private final int NUMERO_HORAS_TURNO = HORA_FIN - HORA_INICIO;
    private final int NUMERO_HUECOS =  (NUMERO_HORAS_TURNO*60)/MINUTOS_HUECO;
    
    private LocalDate fecha;
    private int idEmpleado;
    private Map <LocalTime, Cita> agendaCitas;
    
    public CitasDia(String fecha, int idEmpleado){
        
        this.fecha = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        agendaCitas = new HashMap<>();
        
        this.idEmpleado = idEmpleado;
        Medico m = (Medico)Plantilla.getInstancia().getMedicoPorId(idEmpleado);
        List<Cita> citasConfirmadas = m.getAgenda();
        
            for(Cita c: citasConfirmadas){
                String hora= c.getHora();
                LocalTime horaCita= LocalTime.parse(hora,DateTimeFormatter.ofPattern("HH:mm"));
                              
                
                if(c.getFecha().equals(fecha)){
                    agendaCitas.put(horaCita, c);
                }
            }
        
        // for (int i=0; i<NUMERO_HUECOS; i++){
            // System.out.println(agendaCitas[i]);
        // }
    }
    
    
    public void ListadoCitasDiarioParaUnProfesional(){
        
        agendaCitas.forEach((hora, cita)->System.out.println("Hora: " + hora + "  " + cita ));
    }
}
