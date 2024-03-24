
/**
 * Write a description of class Horario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PruebaConsulta
{
    private static final int HORA_INICIO = 9;
    private static final int HORA_FIN = 15;
    private static final int MINUTOS_HUECO= 30;
    private static final int NUMERO_HORAS_TURNO = HORA_FIN - HORA_INICIO;
    private static final int NUMERO_HUECOS =  (NUMERO_HORAS_TURNO*60)/MINUTOS_HUECO;
    
    public PruebaConsulta(){
        
        System.out.println("Hora de Inicio: " + HORA_INICIO);
        System.out.println("Numero de Huecos: " + NUMERO_HUECOS);
        
        for (int i=0; i<NUMERO_HUECOS; i++){
            int numeroCita = i+1;
            int minutos = i*MINUTOS_HUECO;
            int hora = HORA_INICIO + (minutos/60);
            String hor= "" + hora + ":" + minutos%60;
            
            System.out.println("Cita número: " + numeroCita + " Hora: " +  hor);
        }
        
    }
    
    
    
}
