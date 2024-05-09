package modelo;
import modelo.consulta.*;
import java.time.LocalDate;
import personas.*;
import java.util.List;
import java.util.ArrayList;



/**
 * Write a description of class GestionCitasConsultas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GestionCitasConsultas
{
    
    private String especialidad; 
    
    
    
    
    public GestionCitasConsultas(String especialidad)
    {
      this.especialidad = especialidad;   
        
    }

    public Cita buscaCita(int idPaciente){
        
        SanitariosEnPlantilla sep = new SanitariosEnPlantilla();
        List<Medico> medicos = sep.medicosDe(especialidad); //listamos todos los medicos de la especialidad
        List<ConsultasProgramadas> consultas = new ArrayList<>(); //creamos lista de consultasProgramadas
        
        for(Medico m: medicos){
            consultas.add(m.consultasProgramadas()); //añadimos consultasProgramadas de cada medico a la lista
        }
        
        int indice = 0; 
        
        while(indice<consultas.size()){
            ConsultasProgramadas temp = consultas.get(indice); //almacenamos las ConsultasProgramadas en temp
            
            Cita cita = temp.buscaPrimeraCitaDisponible(idPaciente);
            if(cita!=null){
                Paciente p = ArchivoPacientes.getInstancia().buscarPacientePorId(idPaciente);
                p.agregarCita(cita);
                System.out.println(cita);
                return cita;
            }
            indice++;
        }
        return null;
    }
    
}
