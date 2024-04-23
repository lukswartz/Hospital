package modelo.asistencia;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HistorialPaciente {
    
    private List<Asistencia> asistencias;
    
    public HistorialPaciente() {
        asistencias = new ArrayList<>();
    }
    
    public boolean agregarAsistencia(Asistencia a) {
        
        return asistencias.add(a);
        
    }
    
    public String toString() {
        
        if(asistencias.size()==0) {
            
            return "El paciente no tiene asistencias registradas";
        }
        
        String resultado=""; 
        for(Asistencia a: asistencias) {
            resultado+=a.toString();
            resultado+="\n";
        }
        
        return resultado;
    }
    
    

}