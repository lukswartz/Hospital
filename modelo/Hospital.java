package modelo;

import personas.*;
import interfaz.*;
import java.util.Scanner;


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
    private IU iu; 
    
        
    public Hospital(){
      pacientes = ArchivoPacientes.getInstancia();
       plantilla = Plantilla.getInstancia();
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
    }
    
    
}
