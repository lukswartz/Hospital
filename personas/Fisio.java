package personas;


/**
 * Write a description of class Fisio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fisio extends Sanitario
{
     
    
    public Fisio(String nombre, String dni, String unidad, String turno)
    {
        super(nombre, dni, unidad, turno);
        
    }

    public String toString(){
        return this.getClass().getSimpleName() + 
                super.toString() + 
                "=======================================";
                
    }
}
