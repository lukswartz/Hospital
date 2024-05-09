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
public class ArchivoEstudiantes
{
    // instance variables - replace the example below with your own
    private static ArchivoEstudiantes estudiantesHospital = null;
    private List<Estudiante> estudiantes ;
    
    private ArchivoEstudiantes(){
        
        estudiantes = new ArrayList<>();
        
    }
    
    public static ArchivoEstudiantes getInstancia(){
        
        if(estudiantesHospital == null)
            estudiantesHospital = new ArchivoEstudiantes();
        
            return estudiantesHospital;
            
    }
    
    public boolean agregarEstudiante(Estudiante e){
        
        boolean op= estudiantes.add(e);
        if(op){
            System.out.println("Estudiante agregado al archivo"); 
        }else{
            System.out.println("No se ha podido agregar el paciente"); 
        }
        
        return op; 
        
        
    }
    
    public Estudiante buscarPacientePorId(int idEstudiante){
          
        int index = 0; 
        
        while(index<estudiantes.size()){
        
            Estudiante e=estudiantes.get(index);
            if(idEstudiante == e.getIdEstudiante()){
               return e; 
            }
            index++;
        }
        
        return null; 
        
    }
    public void imprimirArchivo(){
        
        if(!estudiantes.isEmpty()){
        for(Estudiante e: estudiantes){
            System.out.println(e);
        }
        }else{
            System.out.println("No hay ningun paciente en el sistema");
            
        }
    }
    
    
}
