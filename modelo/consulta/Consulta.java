package modelo.consulta;

import modelo.*;
import personas.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Duration;
import java.time.format.*; 



/**
 * Esta clase representa la actividad de ver un listado de pacientes citados en 
 * una fecha determinada en Consultas Externas
 * La consulta tiene campos de clase que alamcenan información sobre hora de inicio, hora de finalización, 
 * minutos disponibles por paciente. 
 * Los pacientes citados se representan por un array de enteros que almacenan el id del Paciente citado. 
 * El orden en el array determina su hora de la cita. 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Consulta
{
    //CONSTANTES DE CLASE. TODAS LAS CONSULTAS TENDRÁN ESTOS ATRIBUTOS. 
    private static final Duration MINUTOS_POR_PACIENTE = Duration.ofMinutes(45);
    private  LocalTime horaInicio;
    private  LocalTime horaFinal;
    private int numeroHuecos; 
    private LocalDate fecha; 
    private Estudiante alumno; 
    private int[] pacientes; //array con los id de pacientes citados agregados en orden cronológico
    private boolean tarde; //Indicador de mañana o tarde. 
    

    public Consulta(int dia, int mes, int anyo, boolean tarde){
        this(LocalDate.of(anyo, mes, dia), tarde);
        
    }
    public Consulta(LocalDate fecha, boolean tarde){
       
        this.fecha = fecha;
        this.tarde = tarde; 
        
        if(tarde){
            horaInicio = LocalTime.of(15,0);
            horaFinal = LocalTime.of(20,0);
            
             
        }else{
        
            horaInicio = LocalTime.of(8,30);
            horaFinal = LocalTime.of(14,30);
        }
    
        numeroHuecos = (int) Duration.between(horaInicio, horaFinal).dividedBy(MINUTOS_POR_PACIENTE);
        pacientes = new int[numeroHuecos];
        
    }
    

    
    /**
     * Método selector que nos devuelve la fecha de la consulta actual como objeto 
     * de tipo LocalDate de la Api java.time
     */
    public LocalDate fecha(){
        return fecha; 
    }
    
    public void asignarEstudiante(Estudiante e){
        alumno = e; 
    }
    
    /**
     * Método asignarHora: 
     * @param: recibe como parámetro el id de Paciente. 
     * @return: un objeto LocalTIme con la hora de la cita asignada al paciente. 
     *          Si no hay hueco devuelve null. 
     */
    public LocalTime asignarHora(int idPaciente){
        
        if(pacienteRepetido(idPaciente)) {
            System.out.println("Paciente ya citado este día");
            return null;
        } 
        
        if(consultaLlena()){
            System.out.println("Consulta llena");
            return null;
            
        }
        
        int indice = 0; 
        boolean asignado = false; 
        
        while(!asignado && indice<pacientes.length){
            
            if(pacientes[indice] == 0){
                pacientes[indice] = idPaciente; 
                asignado = true; 
                
                System.out.println("Se le ha asignado cita al paciente a las: " + indiceAHora(indice).toString() + ".");
                return indiceAHora(indice);
            }
            indice++;
        }
         return null; 
         
    }
    
    public void muestraHorasLibres(){
        
        System.out.println("Citas disponibles para la fecha: " + fecha().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        
         for(int i=0; i<pacientes.length; i++){
            if(pacientes[i] == 0){
                LocalTime hora= horaInicio.plusMinutes(MINUTOS_POR_PACIENTE.toMinutes()*i);
                System.out.println(hora.toString());
            }
        }
        
    }
    public void imprimirListaPacientes(){
        
        if(consultaVacia()){
            System.out.println("No ha pacientes citados");
            return; 
        }
        String res = fecha().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        
        for(int i=0; i<pacientes.length; i++){
            if(pacientes[i]!=0){
                
                res+="\nId de Paciente: " + pacientes[i] + " Hora: " +  indiceAHora(i).toString() + "\n";
                
            }
        }
        
        System.out.println(res);
    }
    
    private boolean pacienteRepetido(int idPaciente){
        int indice = 0; 
        
        while(indice<pacientes.length){
            
            if(pacientes[indice] == idPaciente) {
                return true;
            } 
            indice++;
            
            
        }
        
        return false; 
        
    }
    private boolean consultaLlena(){
        
        for(int i=0; i<pacientes.length; i++){
            if(pacientes[i] == 0) return false; 
        }
        return true; 
    }
    private boolean consultaVacia(){
        for(int i=0; i<pacientes.length; i++){
            if(pacientes[i] != 0) return false; 
        }
        return true; 
    }
    
    private LocalTime indiceAHora(int indice){
        
        return horaInicio.plusMinutes(MINUTOS_POR_PACIENTE.toMinutes()*indice);
         
    }
}
