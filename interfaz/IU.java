package interfaz;
import modelo.*;
import personas.*;
import java.util.Scanner;


/**
 * Write a description of class IU here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IU
{
    private Menu menuPrincipal; 
    private Menu menuAdmin;
    private Scanner entrada = new Scanner(System.in); 
    private Plantilla p = Plantilla.getInstancia();

    
   
    
    public IU(){
        
        construirMenus();
    }
    
    public void menuPrincipal(){
      
        int opcion; 
        
        menuPrincipal.printMenu();
        opcion = menuPrincipal.obtenerOpcionUsuario();
        menuPrincipal.getOpciones()[opcion-1].ejecutarAccion();   
        
    }
    
    public void menuAdministracion(){
        
        int opcion; 
        menuAdmin.printMenu();
        opcion = menuAdmin.obtenerOpcionUsuario();
        menuAdmin.getOpciones()[opcion-1].ejecutarAccion();

    }
    private void construirMenus(){
        
         menuPrincipal = new Menu("Principal",new MenuItem[] 
                           {new MenuItem("ADMINISTRACION",()->menuAdministracion()), 
                            new MenuItem("MEDICINA",()->System.out.println("Medicina")), 
                            new MenuItem("ENFERMERIA",()->System.out.println("Enfermeria")), 
                            new MenuItem("SERVICIOS",()->System.out.println("Servicios")),
                            new MenuItem("SALIR", ()-> System.exit(0))
                            }
                        
                     );
                     
         menuAdmin =  new Menu("Administracion",new MenuItem[] 
                           {new MenuItem("Agregar nuevo empleado",()->agregarEmpleado()), 
                            new MenuItem("Eliminar empleado",()->eliminarEmpleado()), 
                            new MenuItem("Editar empleado",()->System.out.println("editarEmpleado")), 
                            new MenuItem("Asignar Unidad a Empleado",()->System.out.println("asignarUnidad()")),
                            new MenuItem("Asignar turno a Empleado", ()->System.out.println("asignarTurno()")),
                            new MenuItem("Imprimir listado Empleados", ()->{
                                                                            p.imprimirPlantilla();
                                                                            menuAdministracion();
                                                                            }),
                            new MenuItem("Volver al menu anterior", ()->menuPrincipal())
                            }
                        
                     );
                            
        // mapaMenus.put("administracion",
                     // new Menu("Menu Administración",new String[] 
                     // {"Gestion Personal", 
                      // "Asignacion Personal", 
                      // "Volver"
                     // }));
                     
        // mapaMenus.put("gestion personal",
                      // new Menu("Menu Empleado Personal", new String[] 
                      // {"Agregar empleado", 
                       // "Eliminar empleado", 
                       // "Volver"}));
                       
        // mapaMenus.put("medicina",
                      // new Menu("Menu Medicina", new String[] 
                      // {"Realizar asistencia", 
                       // "Ver listado de pacientes", 
                       // "Volver"}));
    
        
    }
    
    
    
    //METODOS PRIVADOS: 
    private void agregarEmpleado(){
        
        String[] parametros;
        System.out.println("MENU AGREGAR NUEVO EMPLEADO"); 
        
        System.out.println("¿Tipo de empleado que desea agregar? (1-EmpleadoAdministracion, 2-Medico, 3-Enfermero, 4-Fisio) Pulse 0 para volver"); 
        
        switch(entrada.nextInt()){
            
            case 1:
                System.out.println("Indique: nombre y DNI del nuevo Empleado de Administracion (separe por una coma cada dato)"); 
                parametros = parametrosUsuario();
                p.agregarEmpleado(new EmpleadoAdministracion(parametros[0], parametros[1]));
                break; 
            
            case 2: 
                System.out.println("Indique: nombre,DNI,Unidad,Turno,Especialidad del nuevo empleado Medicina (separe por una coma cada dato)"); 
                parametros = parametrosUsuario();
                p.agregarEmpleado(new Medico(parametros[0], parametros[1], parametros[2], parametros[3], parametros[4]));
                break; 
            case 3: 
                System.out.println("Indique: nombre,DNI,Unidad,Turno del nuevo empleado Enfermeria (separe por una coma cada dato)");
                parametros = parametrosUsuario();
                p.agregarEmpleado(new Enfermero(parametros[0], parametros[1], parametros[2], parametros[3]));
                break; 
            case 4: 
                System.out.println("Indique: nombre,DNI,Unidad,Turno del nuevo Fisio (separe por una coma cada dato sin dejar espacios)"); 
                parametros = parametrosUsuario();
                p.agregarEmpleado(new Fisio(parametros[0], parametros[1], parametros[2], parametros[3]));
                break; 
            
            case 0:
                menuAdministracion();
                break;
            default: 
                System.out.println("Opción no válida");
                break;
        
                
        }
        
        menuAdministracion();
        
    }
    private void eliminarEmpleado(){
        System.out.println("MENU ELIMINAR EMPLEADO");
        System.out.println("Indique el ID del empleado que desea eliminar(se muestra el listado de empleados existentes)");
        p.imprimirPlantilla();
        int opcion = entrada.nextInt();
        Empleado e = p.obtenerEmpleadoPorId(opcion);
        
        System.out.println("El empleado con ID: " + e.getIdEmpleado() + " DNI: " + e.getDNI() + " NOMBRE: " + e.getNombre() + "\n" + 
                            "será eliminado del Sistema. ¿ESTÁ SEGURO? (S: Si, N: No)");
        entrada.nextLine(); 
        char seguro = entrada.next().toLowerCase().charAt(0);
        
        if(seguro=='s'){
            p.eliminarEmpleado(opcion);
            System.out.println("Se ha eliminado el empleado");
            menuAdministracion();
        }else{
            menuAdministracion();
        }
        
        
               
        
    }
    private String[] parametrosUsuario(){
        entrada.nextLine();
        
        return entrada.nextLine().split(",");
        
    }
}
