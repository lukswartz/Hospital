package modelo.consulta;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;

import personas.*;



/**
 * Write a description of class ConsultasProgramadas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConsultasProgramadas
{
   private List<ConsultaMedico> consultasMedicas; 
   
   public ConsultasProgramadas(){
       consultasMedicas = new ArrayList<>();
       
   }
   
   /**
    * método que crea una nueva consulta programada con un profesional Sanitario y la almacena en una lista de consultas
    *        
    * @return: 
    */
   public boolean crearNuevaConsultaMedica(Medico m, int dia, int mes, int anyo, boolean tarde) {
       
       if(medicoTieneConsultaProgramada(m,dia,mes,anyo)){
           return false; 
       }
       
       ConsultaMedico c = new ConsultaMedico(m, dia, mes, anyo, tarde);
       
       return consultasMedicas.add(c);
       
   }
   
   public boolean agregarConsultaExistente(ConsultaMedico cm){
       return consultasMedicas.add(cm);
       
   }
   public List<ConsultaMedico> consultas(){
       return consultasMedicas;
   }
   
   
   public void mostrarConsultasProgramadas(){
       for(Consulta c: consultasMedicas){
           c.imprimirListaPacientes();
       }
   }
   public Cita buscaPrimeraCitaDisponible(int idPaciente){
       
       for(ConsultaMedico c:consultasMedicas){
           
           LocalTime hora = c.asignarHora(idPaciente); 
           
          if(hora != null){
              
              return new Cita(c.medico(), c.fecha(),hora ); 
              
          }
       }
       
       return null; 
       
   }
   private boolean medicoTieneConsultaProgramada(Medico m, int dia, int mes, int anyo){
       
       if (consultasMedicas.isEmpty()) return false; 
       
       for(ConsultaMedico c: consultasMedicas){
           
           if(c.medico() == m && c.fecha().equals(LocalDate.of(anyo, mes, dia) ) ){
              return true;
           }
           
       }
       
       return false; 
       
   }
}
