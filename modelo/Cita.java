package modelo;


/**
 * Write a description of class Cita here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cita
{
    private static int contadorCitas;
    
    private int idCita;
    private String fecha;
    private String hora;
    private int idPaciente;
    private int idEmpleado;
    private String lugarCita;
    
    
    /**
     * Constructor for objects of class Cita
     */
    public Cita(String fecha, String hora, int idPaciente, int idEmpleado, String lugarCita)
    {
        contadorCitas++;
        idCita = getNuevoIdCita();
        this.fecha = fecha; 
        this.hora = hora; 
        this.idPaciente = idPaciente;
        this.idEmpleado = idEmpleado; 
        this.lugarCita = lugarCita;
        
    }

    public int getIdCita(){return idCita;}
    public String getFecha(){return fecha;}
    public String getHora(){return hora;}
    public int getIdPaciente(){return idPaciente;}
    public int getIdEmpleado(){return idEmpleado;}
    
    
    public String toString(){
        return "IdPaciente: " + idPaciente + ". IdEmpleado: " + idEmpleado;
    }
    private int getNuevoIdCita(){
        
        return 20000 + contadorCitas;
    }
}
