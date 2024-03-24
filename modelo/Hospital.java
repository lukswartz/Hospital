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
    private Plantilla plantilla;
    private ArchivoPacientes pacientes;
    IU iu; 
    
    
    public Hospital(){
        
        plantilla = Plantilla.getInstancia();
        pacientes = ArchivoPacientes.getInstancia();
        iniciar();
        iu = new IU();
        
        
        
    }
    
    public void iniciar(){
        Poblador p = new Poblador();
        p.poblar();
        
        plantilla.imprimirPlantilla();
        pacientes.imprimirArchivo();
                
        
    }
    
    public void iniciarLoop(){
        boolean finalizar = false;
        
        
        
        while(!finalizar){
            Scanner entrada = new Scanner(System.in);
            char opcion;
            
            iu.mostrarMenuPrincipal();
            
            opcion=entrada.next().charAt(0);
            if(opcion == '5'){
                System.out.println("Saliendo de la aplicación");
                finalizar = true;
            }else{
                iu.irSubmenu(opcion);
            }
            
        }
    }
    
   
}
