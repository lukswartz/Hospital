package modelo;

import personas.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

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
    
    public void eliminarPaciente(int idPaciente){
        
        Iterator<Paciente> it = pacientes.iterator();
        while(it.hasNext()){
            Paciente p = it.next(); 
            if(p.getIdPaciente() == idPaciente){
                it.remove();
                System.out.println("El paciente " + p.getNombre() + " ha sido eliminado del Sistema");
                break;
            }
            
        }
        
    }
    public void imprimirArchivo(){
        
        if(!pacientes.isEmpty()){
        for(Paciente p: pacientes){
            System.out.println(p);
            p.ImprimirCitas();
        }
        }else{
            System.out.println("No hay ningun paciente en el sistema");
            
        }
    }
    
    
}
