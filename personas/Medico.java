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
    public Medico(String nombre,String unidad, String turno, String especialidad)
    {
        super(nombre, unidad, turno);
        this.especialidad = especialidad;
    }

    public String getEspecialidad(){return especialidad;}
    
    public String toString(){
        return super.toString()+ " Especialidad: " + especialidad + "\n";
        
    }
}
