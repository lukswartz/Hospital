package modelo.consulta;
import personas.*;


/**
 * Write a description of class ConsultaEnfermeria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConsultaEnfermeria extends Consulta
{
    
    private Enfermero enfermero; 
    
     public ConsultaEnfermeria(Enfermero enfermero, int dia, int mes, int anyo)
    {
        super(dia, mes, anyo);
        this.enfermero = enfermero;
        
       
    }
    
}
