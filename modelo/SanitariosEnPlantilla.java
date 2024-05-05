package modelo;
import personas.*;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;



/**
 * Clase que extrae respectivas listas de Sanitarios presentes
 * en el objeto plantilla. 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SanitariosEnPlantilla
{
    // instance variables - replace the example below with your own
   private List<Sanitario> sanitarios; 

    /**
     * Constructor for objects of class SanitariosEnPlantilla
     */
    public SanitariosEnPlantilla()
    {
    
       sanitarios = new ArrayList<>();
       List<Empleado> empleados = Plantilla.getInstancia().empleados();
       
       for(Empleado e: empleados){
            if(e instanceof Medico || e instanceof Enfermero || e instanceof Fisio){
                sanitarios.add((Sanitario)e);
                }
            }
       }
       
    public List<Medico> medicos(){
        
        List<Medico> medicos = new ArrayList<>();
        for(Sanitario s: sanitarios){
            if(s instanceof Medico){
                medicos.add((Medico)s);
            }
        }
        
        return medicos; 
    }
    
   public List<Medico> medicosDe(String especialidad){
       
       List<Medico> medicos = new ArrayList<>();
        for(Sanitario s: sanitarios){
            if(s instanceof Medico && s.especialidad().equalsIgnoreCase(especialidad)){
                medicos.add((Medico)s);
            }
        }
        
        return medicos; 
   }
   
    public List<Enfermero>enfermeros(){
        
        List<Enfermero> enfermeros = new ArrayList<>();
        for(Sanitario s: sanitarios){
            if(s instanceof Enfermero){
                enfermeros.add((Enfermero)s);
            }
        }
        
        return enfermeros; 
    }
       
    }

    

