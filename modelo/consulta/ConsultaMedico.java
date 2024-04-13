package modelo.consulta;
import personas.*;
import java.time.LocalDate;



/**
 * Write a description of class ConsultaMedico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConsultaMedico extends Consulta
{
    
    
    
    public ConsultaMedico(Medico m, int dia, int mes, int anyo)
    {
       super(m, dia, mes, anyo); 
       
    }

    
    public String especialidad(){
        
        return super.especialidad();
    }
    
}
