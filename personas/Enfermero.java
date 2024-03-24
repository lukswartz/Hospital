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
    
    public Enfermero(String nombre, String unidad, String turno)
    {
        super(nombre, unidad, turno);
    }

    public String toString(){
        return super.toString() + " Categoria: " + this.getClass().getSimpleName() + "\n";
    }
}
