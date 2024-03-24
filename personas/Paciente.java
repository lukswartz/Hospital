package personas;
/**
 * Write a description of class Paciente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paciente extends Persona
{
    // instance variables - replace the example below with your own
    private int numeroHistorial;
    private static int contadorPacientes = 0;

    /**
     * Constructor for objects of class Paciente
     */
    public Paciente(String nombre)
    {
        // initialise instance variables
       super(nombre);
       contadorPacientes++;
       numeroHistorial = obtenerNuevoNumeroHistorial();
    }

    public String getDetails(){
        
        return "Paciente: " + getNombre() + ". " + "Numero de Historial: " + numeroHistorial ;
    }
    private int obtenerNuevoNumeroHistorial(){
        return contadorPacientes + 3000;
    }
}
