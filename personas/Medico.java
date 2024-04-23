package personas;
/**
 * Write a description of class Medico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Medico extends Sanitario
{
        

    /**
     * Constructor for objects of class Medico
     */
    public Medico(String nombre, String dni,String especialidad)
    {
        super(nombre, dni, especialidad);
    }

    public String especialidad(){return super.especialidad();}
    
    
    public String toString(){
        return this.getClass().getSimpleName() + "\n" + super.toString() + 
                " Especialidad: " + especialidad() + "\n" +
                "=======================================";
        
    }
}
