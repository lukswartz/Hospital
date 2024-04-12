package interfaz;
import java.util.Scanner;


/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu
{
    private String titulo;
    private MenuItem[] opciones;
    private Scanner entrada;
    
    public Menu( String titulo,MenuItem[] opciones){
        
        this.opciones = new MenuItem[opciones.length];
        this.titulo = titulo;
        entrada = new Scanner(System.in);
        
        for(int i=0; i<opciones.length; i++){
            
            this.opciones[i] = opciones[i];
        }
    }
    
    public void printMenu(){
        
        System.out.println("=========================================");
        System.out.println("MENU: " + titulo);
        System.out.println("=========================================");
        for(int i=0; i<opciones.length; i++){
            System.out.println("  " + (i+1) + " " + opciones[i].getEtiqueta() + ". ");
        }
        System.out.println("Indique el número de opción");
        
        
    }
    
    public int obtenerOpcionUsuario(){
        int numeroOpciones = this.getOpciones().length; 
        System.out.println("Opciones posibles: [1-" + numeroOpciones+"]");
        
        return  entrada.nextInt();
    }
    
    public MenuItem[] getOpciones(){
        return opciones; 
    }
}
