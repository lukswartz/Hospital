package personas;
import modelo.asistencia.*;
import modelo.consulta.*;
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
    private List<Cita> citas;
    private List<Asistencia> historial; 

    /**
     * Constructor for objects of class Paciente
     * @param String nombre, String dni. 
     */
    public Paciente(String nombre, String dni)
    {
       super(nombre, dni);
       contadorPacientes++;
       idPaciente = obtenerNuevoNumeroHistorial();
       citas = new ArrayList<>();
       historial = new ArrayList<>();
    }

    public void agregarCita(Cita c){
        c.asignaCitaAPaciente(this.idPaciente); //añade el identificador de paciente al objeto Cita
        citas.add(c);
    }
    public int getIdPaciente(){ return idPaciente;}
    public List<Asistencia> historial(){ return historial;}
    
    
    public List<Cita> citas(){ return citas;}

    public String toString(){
        return this.getClass().getSimpleName() + "\n" + 
                super.toString() + 
                " ID: " + idPaciente + "\n" +
                "=======================================";
                
    }
    public void ImprimirCitas(){
        
        for(Cita c: citas){
            System.out.println(c);
        }
    }
    /**
     * Método privado que asigna un identificador único a cada paciente. 
     * Los identificadores de paciente empiezan por 3
     */
    private int obtenerNuevoNumeroHistorial(){
        return contadorPacientes + 3000;
    }
}
