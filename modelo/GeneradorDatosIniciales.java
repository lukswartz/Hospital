package modelo;
import personas.*;


/**
 * Write a description of class GeneradorDatosIniciales here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GeneradorDatosIniciales
{
    // instance variables - replace the example below with your own
   
    public GeneradorDatosIniciales()
    {
      
    }

    public void generar()
    {
        EmpleadoAdministracion emp = new EmpleadoAdministracion("Abel Administracion", "12678987A");
        Plantilla.getInstancia().agregarEmpleado(emp);
       
        
        EmpleadoAdministracion emp1 = new EmpleadoAdministracion("Antonio Personal", "14974297N");
        Plantilla.getInstancia().agregarEmpleado(emp1);
        
        //AGREGAR MEDICOS 
        Medico med1 = new Medico("Federico Medico", "12345678A", "Consulta", "Mañana", "Traumatologia");
        Plantilla.getInstancia().agregarEmpleado(med1);
        
        Medico med2= new Medico("Maria Medico", "98765432B", "Consulta", "Tarde", "Cardiologia");
        Plantilla.getInstancia().agregarEmpleado(med2);
        
        Medico med3 = new Medico("Francisco Medico","56789123C", "Sala", "Mañana", "Cirugia" );
        Plantilla.getInstancia().agregarEmpleado(med3);
        
        Medico med4 = new Medico("Elisa Medico","87654321D", "Quirofano", "Mañana", "Traumatologia" );
        Plantilla.getInstancia().agregarEmpleado(med4);
        
        Medico med5 = new Medico("Carmen Medico", "23686363F", "Consulta", "Mañana", "Digestivo");
        Plantilla.getInstancia().agregarEmpleado(med5);
        
        Enfermero enf1 = new Enfermero("Paco Enfermero","23456789E", "Consulta", "Tarde");
        Plantilla.getInstancia().agregarEmpleado(enf1);
        
        Fisio fisio1 = new Fisio("Miguel Fisio", "34567890F",  "Consulta", "Mañana");
        Plantilla.getInstancia().agregarEmpleado(fisio1);
        
        //AGREGAR PACIENTES DE PRUEBA
        Paciente p = new Paciente("Borja Paciente", "13789643B"); 
        ArchivoPacientes.getInstancia().agregarPaciente(p);
        
        Paciente pac1 = new Paciente("John Paciente", "45678901G");
        ArchivoPacientes.getInstancia().agregarPaciente(pac1);
        
        Paciente pac2 = new Paciente("Mary Paciente", "76543210H");
        ArchivoPacientes.getInstancia().agregarPaciente(pac2);
        
        Paciente pac3 = new Paciente("Lucas Paciente", "89012345I");
        ArchivoPacientes.getInstancia().agregarPaciente(pac3);
        
        Paciente pac4 = new Paciente("Jessica Paciente", "21098765J");
        ArchivoPacientes.getInstancia().agregarPaciente(pac4);
        

    }
}
