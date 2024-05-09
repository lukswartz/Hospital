package modelo;
import personas.*;


/**
 * Write a description of class GeneradorDatosIniciales here.
 * 
 * @author (your name) 
k
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
        Medico med1 = new Medico("Trauma1", "12345678A","Traumatologia");
        med1.asignarTurno(new Asignacion("Consulta", "Mañana", 17,4,2024));
        med1.asignarTurno(new Asignacion("Consulta", "Tarde", 22,4,2024));
        med1.asignarTurno(new Asignacion("Urgencias", "Noche", 27, 4, 2024));
        Plantilla.getInstancia().agregarEmpleado(med1);
        
        Medico med2= new Medico("Trauma2", "98765432B", "Traumatologia");
        med2.asignarTurno(new Asignacion("Consulta", "Mañana", 17,4,2024));
        med2.asignarTurno(new Asignacion("Consulta", "Tarde", 22,4,2024));
        med2.asignarTurno(new Asignacion("Urgencias", "Noche", 28, 4, 2024));
        Plantilla.getInstancia().agregarEmpleado(med2);
        
        Medico med3 = new Medico("Trauma3","56789123C", "Traumatologia");
        med3.asignarTurno(new Asignacion("Consulta", "Mañana", 17,4,2024));
        med3.asignarTurno(new Asignacion("Consulta", "Tarde", 22,4,2024));
        med3.asignarTurno(new Asignacion("Urgencias", "Noche", 29, 4, 2024));
        Plantilla.getInstancia().agregarEmpleado(med3);
        
        Medico med4 = new Medico("Elisa Medico","87654321D","Cardiologia");
        Plantilla.getInstancia().agregarEmpleado(med4);
        
        Medico med5 = new Medico("Carmen Medico", "23686363F",  "Digestivo");
        Plantilla.getInstancia().agregarEmpleado(med5);
        
        Enfermero enf1 = new Enfermero("Paco Enfermero","23456789E", "Enfermeria");
        Plantilla.getInstancia().agregarEmpleado(enf1);
        
        Fisio fisio1 = new Fisio("Miguel Fisio", "34567890F", "Fisioterapia");
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
        
        //Buscar cita para traumatologia al paciente p
        
        GestionCitasConsultas gc = new GestionCitasConsultas("Traumatologia");
        gc.buscaCita(3001);
        
        
        
        // Agregar estudiantes: 
        Estudiante est1 = new Estudiante("Estudiante1", "423234d", med1);
        ArchivoEstudiantes.getInstancia().agregarEstudiante(est1);
        med1.asignarEstudiante(est1);
        
        Estudiante est2 = new Estudiante ("Estudiante2", "2435345f", med2);
        ArchivoEstudiantes.getInstancia().agregarEstudiante(est2);
        med2.asignarEstudiante(est2);
        
        
        
    }
}
