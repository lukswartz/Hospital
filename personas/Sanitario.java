package personas;

/**
 * Agrupa características comunes a las clases Medico, Enfermero y Fisio. 
 * Actualmente dispone de campos de instancia de tipo String para indicar la especialidad y 
 * el alumno a su cargo. 
 * @author Juan Ortiz 
 * @version (a version number or a date)
 */
public abstract class Sanitario extends Empleado
{ 
    
    private String especialidad; 
    private Estudiante alumno; 
     
    
    public Sanitario(String nombre, String dni,String especialidad)
    {
        super(nombre, dni);
    
        this.especialidad = especialidad; 
         
        
    }
    
    //métodos selectores
    
    public String especialidad(){
        return especialidad;
    };
    
    public Estudiante alumno(){
        return alumno; 
    }
    
    //método mutador para asignar un estudiante a este sanitario. 
    public void asignarEstudiante (Estudiante e){
        alumno = e; 
    }
    public String toString(){
       return super.toString();
       
    }
}
