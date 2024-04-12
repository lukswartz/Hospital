package personas;
import modelo.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class Paciente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paciente extends Persona
{
    // instance variables - replace the example below with your own
    private int idPaciente;
    private static int contadorPacientes = 0;
    private List<Asistencia> historial; 

    /**
     * Constructor for objects of class Paciente
     */
    public Paciente(String nombre, String dni)
    {
        // initialise instance variables
       super(nombre, dni);
       contadorPacientes++;
       idPaciente = obtenerNuevoNumeroHistorial();
       historial = new ArrayList<>();
    }

    public int getIdPaciente(){ return idPaciente;}
    public List<Asistencia> getHistorial(){ return historial;}
    
    public String toString(){
        return this.getClass().getSimpleName() + "\n" + 
                super.toString() + 
                " ID: " + idPaciente + "\n" +
                "=======================================";
                
    }
    /**
     * Método privado que asigna un identificador único a cada paciente. 
     * Los identificadores de paciente empiezan por 3
     */
    private int obtenerNuevoNumeroHistorial(){
        return contadorPacientes + 3000;
    }
}
