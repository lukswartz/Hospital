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
        
        boolean op= pacientes.add(p);
        if(op){
            System.out.println("Paciente agregado al archivo"); 
        }else{
            System.out.println("No se ha podido agregar el paciente"); 
        }
        
        return op; 
        
        
    }
    
    public Paciente buscarPacientePorId(int idPaciente){
          
        int index = 0; 
        
        while(index<pacientes.size()){
        
            Paciente p=pacientes.get(index);
            if(idPaciente == p.getIdPaciente()){
               return p; 
            }
            index++;
        }
        
        return null; 
        
    }
    public void imprimirArchivo(){
        
        if(!pacientes.isEmpty()){
        for(Paciente p: pacientes){
            System.out.println(p);
        }
        }else{
            System.out.println("No hay ningun paciente en el sistema");
            
        }
    }
    
    
}
