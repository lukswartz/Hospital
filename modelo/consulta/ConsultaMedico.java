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
    private Medico medico; 
    
    
    
    public ConsultaMedico(Medico m, int dia, int mes, int anyo)
    {
       super(dia, mes, anyo);
       this.medico = m; 
       
    }

    public String especialidad(){
        
        return medico.getEspecialidad();
    }
    
}
