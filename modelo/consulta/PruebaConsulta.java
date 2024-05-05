package modelo.consulta;
import personas.*;

/**
 * Write a description of class PruebaConsulta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PruebaConsulta
{
    
    Medico med, med2; 
    ConsultaMedico c, c2;  
    Paciente p1,p2,p3,p4, p5, p6, p7, p8,p9,p10;
    
    
   
    public PruebaConsulta()
    {
       
    }

    
   public void crearConsulta(){
       
        med = new Medico("Juan Medico", "234234S","Traumatologia");
        c = new ConsultaMedico(med, 9, 4, 2024, true);
        p1 = new Paciente("Francisco Paciente", "4324789A");
        p2 = new Paciente("Lucas Paciente", "4324789A");
        p3 = new Paciente("Maria Paciente", "2342349A");
        p4 = new Paciente("Elena Paciente", "43434289A");
        p5 = new Paciente("paciente5", "4324789A");
        p6 = new Paciente("paciente6", "2342349A");
        p7 = new Paciente("paciente7", "43434289A");
        
        c.asignarHora(p1.getIdPaciente());
        c.asignarHora(p2.getIdPaciente());
        c.asignarHora(p2.getIdPaciente());
        c.asignarHora(p4.getIdPaciente());
        c.asignarHora(p5.getIdPaciente());
        c.asignarHora(p6.getIdPaciente());
        c.asignarHora(p7.getIdPaciente());
   }
   
   public void imprimirConsulta(){
       
       c.imprimirListaPacientes();
   }
   
   public void comprobarHorasLibres(){
       
        med = new Medico("Juan Medico", "234234S","Traumatologia");
        c = new ConsultaMedico(med, 9, 4, 2024, false);
        p1 = new Paciente("Francisco Paciente", "4324789A");
        p2 = new Paciente("Lucas Paciente", "4324789A");
        p3 = new Paciente("Maria Paciente", "2342349A");
        
        
        c.asignarHora(p1.getIdPaciente());
        c.asignarHora(p2.getIdPaciente());
        c.asignarHora(p3.getIdPaciente());
       
        c.muestraHorasLibres();
   }
   
   public void buscaPrimerCita(){
        med = new Medico("Juan Medico", "234234S","Traumatologia");
        c = new ConsultaMedico(med, 9, 4, 2024, true);
        p1 = new Paciente("Francisco Paciente", "4324789A");
        p2 = new Paciente("Lucas Paciente", "4324789A");
        p3 = new Paciente("Maria Paciente", "2342349A");
        p4 = new Paciente("Elena Paciente", "43434289A");
        p5 = new Paciente("paciente5", "4324789A");
        p6 = new Paciente("paciente6", "2342349A");
        p7 = new Paciente("paciente7", "43434289A");
        
        c.asignarHora(p1.getIdPaciente());
        c.asignarHora(p2.getIdPaciente());
        c.asignarHora(p3.getIdPaciente());
        c.asignarHora(p4.getIdPaciente());
        c.asignarHora(p5.getIdPaciente());
        c.asignarHora(p6.getIdPaciente());
        c.asignarHora(p7.getIdPaciente());
        
         med2 = new Medico("Lucas Medico", "234234S","Traumatologia");
        c2 = new ConsultaMedico(med2, 9, 4, 2024, true);
        p8 = new Paciente("Francisco Paciente", "4324789A");
        p9 = new Paciente("Lucas Paciente", "4324789A");
        p10 = new Paciente("Maria Paciente", "2342349A");
        
        
        c2.asignarHora(p7.getIdPaciente());
        c2.asignarHora(p8.getIdPaciente());
        
        ConsultasProgramadas cp = new ConsultasProgramadas();
        cp.agregarConsultaExistente(c);
        cp.agregarConsultaExistente(c2);
        
        
        Cita cita = cp.buscaPrimeraCitaDisponible(p10.getIdPaciente());
        System.out.println(cita);
        
       
       
   }
}
