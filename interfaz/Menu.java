package interfaz;


/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu
{
    private int numOpciones;
    private String titulo;
    private String[] opciones;
    
    public Menu( String titulo, int numOpciones,String[] opciones){
        
        this.numOpciones = numOpciones;
        this.opciones = new String[numOpciones];
        this.titulo = titulo;
        
        for(int i=0; i<numOpciones; i++){
            
            this.opciones[i] = opciones[i];
        }
    }
    
    public void printMenu(){
        
        System.out.println("=========================================");
        System.out.println("MENU: " + titulo);
        System.out.println("=========================================");
        for(int i=0; i<numOpciones; i++){
            System.out.println("  " + (i+1) + " " + opciones[i] + ". ");
        }
        System.out.println("Indique el número de opción");
        
        
    }
}
