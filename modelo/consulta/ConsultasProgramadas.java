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
   private List<Consulta> consultas; 
   
   public ConsultasProgramadas(){
       consultas = new ArrayList<>();
       
   }
   
   /**
    * método que crea una nueva consulta programada con un profesional Sanitario y la almacena en una lista de consultas
    * 
    * @param: String tipo: tipo de consulta: "Medico", "Enfermeria", "Fisioterapia"
    *         Sanitario s: objeto de tipo sanitario del tipo adecuado a la consulta
    *        
    * @return: 
    */
   public boolean crearNuevaConsulta(String tipo, Sanitario s, int dia, int mes, int anyo) {
       
       if(sanitarioTieneConsultaProgramada(s,dia,mes,anyo)){
           return false; 
       }
       
       Consulta c= ConsultaFactory.nuevaConsulta(tipo, s, dia, mes, anyo);
       
       return consultas.add(c);
       
   }
   
   private boolean sanitarioTieneConsultaProgramada(Sanitario s, int dia, int mes, int anyo){
       
       for(Consulta c: consultas){
           
           if(c.sanitario() == s && c.fecha().equals(LocalDate.of(anyo, mes, dia) ) ){
              return true;
           }
           
       }
       
       return false; 
       
   }
   
}
