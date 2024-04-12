package personas;
/**
 * Write a description of class Medico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Medico extends Sanitario
{
    private String especialidad;
    

    /**
     * Constructor for objects of class Medico
     */
    public Medico(String nombre, String dni, String unidad, String turno, String especialidad)
    {
        super(nombre, dni, unidad, turno);
        this.especialidad = especialidad;
    }

    public String getEspecialidad(){return especialidad;}
    
    public String toString(){
        return this.getClass().getSimpleName() + "\n" + super.toString() + 
                " Especialidad: " + especialidad + "\n" +
                "=======================================";
        
    }
}
