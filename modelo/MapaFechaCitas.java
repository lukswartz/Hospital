package modelo;
import java.util.HashMap;
import java.util.Map;
import java.time.LocalDate;


/**
 * Write a description of class MapaFechaCitas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MapaFechaCitas
{
    private Map<LocalDate, Integer> manana; 
    
    
    public MapaFechaCitas(){
        
        
        manana = new HashMap<>();
        
        
    }
    
    public void agregarEntrada(LocalDate fecha, int n){
        
        manana.put(fecha, n);
        
        
        
    }
}
