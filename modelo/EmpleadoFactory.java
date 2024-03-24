package modelo;
import personas.*;



/**
 * Write a description of class EmpleadoFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmpleadoFactory
{
   public static Empleado crearEmpleado(String tipo,String nombre, String unidad, String turno,  String especialidad){
       
       switch(tipo){
           
           case "medico": 
               return new Medico(nombre, unidad, turno, especialidad);
               
           case "enfermero":
                return new Enfermero(nombre, unidad, turno);
                
           default:
               return null; 
                         
               
       }
       
   }
}
