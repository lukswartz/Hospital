package modelo;

import personas.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class Archivo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArchivoPacientes
{
    // instance variables - replace the example below with your own
    private static ArchivoPacientes pacientesHospital = null;
    private List<Paciente> pacientes;
    
    private ArchivoPacientes(){
        
        pacientes = new ArrayList<>();
        
    }
    
    public static ArchivoPacientes getInstancia(){
        
        if(pacientesHospital == null)
            pacientesHospital = new ArchivoPacientes();
        
            return pacientesHospital;
            
    }
    
    public boolean agregarPaciente(Paciente p){
        
        return pacientes.add(p);
        
    }
    
    public void imprimirArchivo(){
        
        if(!pacientes.isEmpty()){
        for(Paciente p: pacientes){
            System.out.println(p.getDetails());
        }
        }else{
            System.out.println("No hay ningun paciente en el sistema");
            
        }
    }
    
    
}
