package personas;


/**
 * Write a description of class Fisio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fisio extends Sanitario
{
     
    
    public Fisio(String nombre, String dni, String especialidad)
    {
        super(nombre, dni, especialidad);
        
    }

    public String toString(){
        return this.getClass().getSimpleName() +  
                super.toString() +
                 "Especialidad: " + super.especialidad() + "\n" + 
                "=======================================";
                
    }
}
