package modelo.consulta;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

import personas.*;



/**
 * Write a description of class ConsultasProgramadas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConsultasProgramadas
{
   private List<ConsultaMedico> consultas; 
   
   public ConsultasProgramadas(){
       consultas = new ArrayList<>();
       
   }
   
   /**
    * método que crea una nueva consulta programada con un profesional Sanitario y la almacena en una lista de consultas
    * 
    * 
    *        
    * @return: 
    */
   public boolean crearNuevaConsulta(Medico m, int dia, int mes, int anyo) {
       
       if(medicoTieneConsultaProgramada(m,dia,mes,anyo)){
           return false; 
       }
       
       ConsultaMedico c = new ConsultaMedico(m, dia, mes, anyo);
       
       return consultas.add(c);
       
   }
   
   private boolean medicoTieneConsultaProgramada(Medico m, int dia, int mes, int anyo){
       
       if (consultas.isEmpty()) return false; 
       
       for(ConsultaMedico c: consultas){
           
           if(c.medico() == m && c.fecha().equals(LocalDate.of(anyo, mes, dia) ) ){
              return true;
           }
           
       }
       
       return false; 
       
   }
   
   public void mostrarConsultasProgramadas(){
       for(Consulta c: consultas){
           c.imprimirListaPacientes();
       }
   }
}
