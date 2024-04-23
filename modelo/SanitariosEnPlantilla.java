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
    
    public List<Medico> medicosEnConsultaPorFecha(int dia, int mes, int anyo){
        
        List<Medico> res = new ArrayList<>();
        List<Medico> todos = medicos();
        LocalDate fecha = LocalDate.of(anyo, mes, dia);
        
        for( Medico m: todos){
            
            List<Asignacion> turnos = m.turnos();
            for(Asignacion a: turnos){
                if("Consulta".equals(a.unidad()) && 
                    (!fecha.isBefore(a.getFechaInicio()) && !fecha.isAfter(a.getFechaFin())))
                        res.add(m);
            }
        }
        
        return res; 
        
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

    

