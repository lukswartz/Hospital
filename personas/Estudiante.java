package personas;

/**
 * Write a description of class Estudiante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Estudiante extends Persona
{
    
    private int idEstudiante; 
    private static int contadorEstudiante = 0; 
    private String tipoEstudiante; 
    
    private Sanitario tutor; 

    /**
     * Constructor for objects of class Estudiante
     */
    public Estudiante(String nombre, String dni, String tipoEstudiante, Sanitario tutor)
    {
        // initialise instance variables
        super(nombre, dni);
        this.tutor = tutor; 
        this.tipoEstudiante = tipoEstudiante; 
        contadorEstudiante++;
        idEstudiante = obtenerNuevoIdEstudiante();
        
    }

    
    public int getIdEstudiante(){
        return idEstudiante; 
    }
    public String toString(){
        return this.getClass().getSimpleName() + "\n" + 
                super.toString() + 
                " ID: " + idEstudiante + ". Tutor: " + tutor.getNombre()  + "\n" +
                "=======================================";
                
    }
    
    private int obtenerNuevoIdEstudiante(){
        return contadorEstudiante + 9000;
    }
}
