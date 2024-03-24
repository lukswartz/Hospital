package personas;
import modelo.*;

/**
 * Write a description of class Poblador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Poblador
{
    
    public void poblar(){
        //AGREGAR EMPLEADOS DE PERSONAL
        EmpleadoPersonal emp1 = new EmpleadoPersonal("Antonio Personal", "Gestion de Personal");
        Plantilla.getInstancia().agregarEmpleado(emp1);
        
        //AGREGAR MEDICOS 
        Medico med1 = new Medico("Federico Medico", "Consulta", "Mañana", "Traumatologia");
        Plantilla.getInstancia().agregarEmpleado(med1);
        
        Medico med2= new Medico("Maria Medico", "Consulta", "Tarde", "Cardiologia");
        Plantilla.getInstancia().agregarEmpleado(med2);
        
        Medico med3 = new Medico("Francisco Medico", "Sala", "Mañana", "Cirugia");
        Plantilla.getInstancia().agregarEmpleado(med3);
        
        Medico med4 = new Medico("Elisa Medico", "Quirofano", "Mañana", "Traumatologia");
        Plantilla.getInstancia().agregarEmpleado(med4);
        
        Enfermero enf1 = new Enfermero("Paco Enfermero", "Consultas", "Tarde");
        Plantilla.getInstancia().agregarEmpleado(enf1);
        
        //AGREGAR PACIENTES DE PRUEBA
        Paciente pac1 = new Paciente("John Paciente");
        Archivo.getInstancia().agregarPaciente(pac1);
        
        Paciente pac2 = new Paciente("Mary Paciente");
        Archivo.getInstancia().agregarPaciente(pac2);
        
        Paciente pac3 = new Paciente("Elon Musk");
        Archivo.getInstancia().agregarPaciente(pac3);
        
        Paciente pac4 = new Paciente("Jessica Paciente");
        Archivo.getInstancia().agregarPaciente(pac4);
        
        Cita c1 = new Cita("02/05/2024", "09:00", 3001, 1001, "Consulta");
        med1.agregarCita(c1);
    }
}
