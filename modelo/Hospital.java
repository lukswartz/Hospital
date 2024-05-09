package modelo;

import personas.*;
import interfaz.*;
import java.util.Scanner;
import java.util.List;


/**
 * Write a description of class Hospital here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hospital
{
    private ArchivoPacientes pacientes;
    private Plantilla plantilla; 
    private ArchivoEstudiantes estudiantes; 
    
    private IU iu; 
    
        
    public Hospital(){
      pacientes = ArchivoPacientes.getInstancia();
       plantilla = Plantilla.getInstancia();
       estudiantes = ArchivoEstudiantes.getInstancia();
       iu = new IU();
       
       
       cargarDatosPrueba(); 
       

    
    }
    
    public void iniciar(){
        iu.menuPrincipal();
        
    }

    public void cargarDatosPrueba(){
        GeneradorDatosIniciales g = new GeneradorDatosIniciales(); 
        g.generar();
        System.out.println(plantilla.empleadosEnSistemaComoString());
        for(Empleado e : plantilla.empleados()){
            e.imprimirAsignaciones();            
        }
    }
    
}
