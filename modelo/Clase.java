package modelo;
import personas.*;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;



/**
 * Write a description of class Clase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clase
{
   private String descripcion; 
   private Sanitario profesor; 
   private LocalDate fecha; 
   private List<Estudiante> alumnos; 
   
   
   public Clase(String desc, Sanitario prof, int dia, int mes, int anyo){
       
       this(desc, prof, LocalDate.of(anyo, mes, dia));
       
   }
   
   public Clase(String desc, Sanitario prof, LocalDate fecha){
       
       descripcion = desc;
       profesor = prof; 
       this.fecha = fecha; 
       alumnos = new ArrayList<>();
       
   }
   
   public String descripcion(){
       return descripcion; 
   }
   
   public Sanitario profesor(){
       return profesor; 
   }
   
   public LocalDate fecha(){
       return fecha; 
   }
   public List<Estudiante> alumnos(){
       return alumnos; 
   }
   
   public void matricularAlumno (Estudiante e){
       alumnos.add(e);
   }
   public String toString(){
       
       return "Clase: " + descripcion  + " . Fecha: " + fecha.getDayOfMonth() + "/" + fecha.getMonthValue() + "/" + fecha.getYear() + 
                 "\n Profesor: " + profesor.getNombre() + " Numero de alumnos matriculados: "  + alumnos.size(); 
                 
   }
}
