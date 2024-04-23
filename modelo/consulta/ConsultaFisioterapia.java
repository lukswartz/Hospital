package modelo.consulta;
import personas.*;


/**
 * Write a description of class ConsultaFisioterapia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConsultaFisioterapia extends Consulta
{
    // instance variables - replace the example below with your own
    private Fisio fisio; 
    
     public ConsultaFisioterapia(Fisio f, int dia, int mes, int anyo)
    {
       super(dia, mes, anyo); 
       
       this.fisio = f; 
       
    }
}
