package modelo.consulta;
import personas.*;


/**
 * Write a description of class ConsultaFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConsultaFactory
{
    public static Consulta nuevaConsulta(String tipoConsulta, Sanitario s, int dia, int mes, int anyo){
        
        switch(tipoConsulta){
            
            case "Medico":
                return new ConsultaMedico((Medico)s, dia, mes, anyo);
                
                
            case "Enfermero":
                return new ConsultaEnfermeria((Enfermero)s, dia, mes, anyo);
                
            
            case "Fisioterapia": 
                return new ConsultaFisioterapia((Fisio)s, dia, mes, anyo); 
            
            default: 
                return null; 
            
            
        }
    }
}
