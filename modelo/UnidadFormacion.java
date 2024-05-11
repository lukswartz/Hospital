package modelo;
import java.util.List;
import java.util.ArrayList;
import java.util.*;


/**
 * Write a description of class UnidadFormacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UnidadFormacion
{
    private Map<String, Clase> clases; 
    

    /**
     * Constructor for objects of class UnidadFormacion
     */
    public UnidadFormacion()
    {
       clases = new HashMap<>();
    }

    
    public Map<String, Clase> clases(){
        // put your code here
        return clases; 
    }
    
    public String[] listaClases(String[] array){
        return clases.keySet().toArray(array);
    }
    public void agregarNuevaClase(Clase c){
        clases.put(c.descripcion(), c);
        
    }
}
