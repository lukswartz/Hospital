package modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Clase Asistencia, representa el acto de asistir a un paciente por parte de un 
 * sanitario del hospital (Medico, Enfermero o Fisio)
 * 
 * El constructor pide: numero de id de paciente, nombre del profesional y una marca temporal. 
 * 
 */
public class Asistencia {

	private int idPaciente; 
	private String profesional; 
	private LocalDateTime timeStampAsistencia; 
	private String informacionMedica, diagnostico, tratamiento;
	
	public Asistencia(int idPaciente, String profesional, LocalDateTime timeStamp) {
		timeStampAsistencia = timeStamp; 
		
		this.idPaciente = idPaciente;
		this.profesional = profesional;
	} 
	
	public Asistencia(int idPaciente, String profesional) {
		this(idPaciente, profesional, LocalDateTime.now());
	} 

	void registrarInformacionAsistencia(String informacionMedica, String diagnostico, String tratamiento){
		this.informacionMedica = informacionMedica; 
		this.diagnostico = diagnostico; 
		this.tratamiento = tratamiento;
		
	}

	@Override
	public String toString() {
		
		String fecha = timeStampAsistencia.format(DateTimeFormatter.ofPattern("dd MMM uuuu"));
		String hora = timeStampAsistencia.format(DateTimeFormatter.ofPattern("HH:MM"));
		return "Asistencia [idPaciente=" + idPaciente + " Profesional=" + profesional + 
				" Fecha: "	+ fecha + "Hora: " + hora + "\n" +
		        "Información Médica= " + informacionMedica + 
				" Diagnostico=" + diagnostico + ", tratamiento=" + tratamiento + "]";
	}
	
	
}
