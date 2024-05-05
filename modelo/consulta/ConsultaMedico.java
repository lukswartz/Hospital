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
    
    
    public ConsultaMedico(Medico medico, int dia, int mes, int anyo, boolean tarde)
    {
       super(dia, mes, anyo, tarde); 
       this.medico = medico; 
       
    }

    public Medico medico(){
        return medico; 
    }
    public String especialidad(){
        
        return medico.especialidad();
    }
    
    
    public void imprimirListaPacientes(){
        
        System.out.println("Consulta: Sanitario: " + medico.getNombre() + " Especialidad: " + medico.especialidad());
        super.imprimirListaPacientes();
    }
}
