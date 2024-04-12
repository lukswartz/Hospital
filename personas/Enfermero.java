package personas;


/**
 * Write a description of class Enfermero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enfermero extends Sanitario
{
    // instance variables - replace the example below with your own
    
    
    public Enfermero(String nombre, String dni,  String unidad, String turno)
    {
        super(nombre, dni, unidad, turno);
    }

    public String toString(){
        return this.getClass().getSimpleName() + "\n" +
                super.toString() + 
                "=======================================";
                
    }
}
