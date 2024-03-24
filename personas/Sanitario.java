package personas;
import java.util.List;
import modelo.Cita;
import java.util.ArrayList;


/**
 * Un empleado de tipo Sanitario tiene una lista de Citas para cada dia de trabajo. 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Sanitario extends Empleado
{
    private String unidad;//lugar donde hace su actividad cada dia
    private String turno;
    private List<Cita> agenda; 
    
    public Sanitario(String nombre, String unidad, String turno)
    {
        super(nombre);
        this.unidad = unidad;
        this.turno = turno;
        agenda = new ArrayList<>();
    }
    
    public String getUnidad() {return unidad;}
    public String getTurno() {return turno;}
    
    public void setUnidad (String unidad){ this.unidad = unidad;};
    public void setTurno (String turno){ this.turno = turno;}
    
    public List<Cita> getAgenda(){
        return agenda;
    }
    
    public boolean agregarCita(Cita c){
        
        return agenda.add(c);
    }
    
    public String toString(){
       return super.toString() + " Unidad: " + getUnidad() + "." + " Turno: " + getTurno() ;
       
    }
}
