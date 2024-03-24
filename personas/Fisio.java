package personas;


/**
 * Write a description of class Fisio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fisio extends Sanitario
{
    public Fisio(String nombre, String unidad, String turno)
    {
        super(nombre, unidad, turno);
    }

    public String toString(){
        return super.toString() + this.getClass().getName();
    }
}
