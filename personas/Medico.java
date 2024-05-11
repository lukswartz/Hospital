package personas;
import modelo.consulta.*;
import java.util.List;

/**
 * Representa a un médico del sistema. 
 * Comparte los atributos y métodos de sus superclases: Persona, Empleado y Sanitario
 * Dispone de un atributo propio de tipo ConsultasProgramadas donde se almacenarán
 * todas las consultas programadas para este médico. 
 * @author Juan Ortiz
 * 
 */
public class Medico extends Sanitario
{
        

    private ConsultasProgramadas cp;
    
    /**
     * Constructor for objects of class Medico
     */
    public Medico(String nombre, String dni,String especialidad)
    {
        super(nombre, dni, especialidad);
        cp = new ConsultasProgramadas();
    }

    public String especialidad(){return super.especialidad();}
    
    public ConsultasProgramadas consultasProgramadas(){
        actualizaAsignaciones();
        return cp;
    }
    public void actualizaAsignaciones(){
        
        for(Asignacion a: turnos()){
            
            boolean tarde = a.turno().toLowerCase().equals("tarde");
            
            if(a.unidad().equals("Consulta")){
                cp.crearNuevaConsultaMedica(this, a.getFecha().getDayOfMonth(), a.getFecha().getMonthValue(), a.getFecha().getYear(),tarde );
                
            }
        }
    }
    
    public void verConsultasProgramadas() {
        cp.mostrarConsultasProgramadas();
    }
    public String toString(){
        return this.getClass().getSimpleName() + "\n" + super.toString() + 
                " Especialidad: " + especialidad() + "\n" +
                "=======================================";
        
    }
}
