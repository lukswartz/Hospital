package personas;


/**
 * Write a description of class PruebaPersonas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PruebaPersonas
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class PruebaPersonas
     */
    public PruebaPersonas()
    {
       EmpleadoAdministracion ep = new EmpleadoAdministracion ("Pepe Admin", "45234234S");
       System.out.println(ep.toString());
       
       
       
       Medico med = new Medico("Carmen Medico", "234234", "Hospitalizacion", "Tarde", "Digestivo");
       System.out.println(med.toString());
       
       Enfermero enf = new Enfermero("Ana Enfermeria", "22344536", "Consultas", "Mañana");
       System.out.println(enf.toString());
       
       Estudiante est = new Estudiante("Nico Estudiante", "14234234", med);
       System.out.println(est);
       
       Paciente pac = new Paciente ("Alfonso Paciente", "2343423");
       System.out.println(pac);
       
    }

    
    
}
