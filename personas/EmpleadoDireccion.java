package personas;


/**
 * Clase que representa a un Empleado de dirección
 * Se encargará de asignar unidad y turnos al personal sanitario
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmpleadoDireccion extends Empleado
{
    // instance variables - replace the example below with your own
    
    public EmpleadoDireccion(String nombre)
    {
        super(nombre);
    }

     public void asignarUnidad(Sanitario s, String unidad){
        
        Sanitario san = s;
        s.setUnidad(unidad);
        
        System.out.println("El empleado " + s.getNombre() + " ha sido cambiado a la unidad: " + unidad);
        
    }
    
    public void asignarTurno(Sanitario s, String turno){
        
        Sanitario san = s;
        s.setTurno(turno);
        
        System.out.println("El empleado " + s.getNombre() + " ha sido cambiado al turno: " + turno);
        
    }
   
}
