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
    private Menu menuPersonal; 
    private Menu menuPacientes; 
    private Scanner entrada = new Scanner(System.in); 
    private Plantilla p = Plantilla.getInstancia();
    private ArchivoPacientes ap = ArchivoPacientes.getInstancia();

    
   
    
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
    
    public void menuPersonal(){
        
        int opcion; 
        menuPersonal.printMenu();
        opcion = menuPersonal.obtenerOpcionUsuario();
        menuPersonal.getOpciones()[opcion-1].ejecutarAccion();

    }
    
    public void menuPacientes(){
        
        int opcion; 
        menuPacientes.printMenu();
        opcion = menuPacientes.obtenerOpcionUsuario();
        menuPacientes.getOpciones()[opcion-1].ejecutarAccion();

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
                           {new MenuItem("Gestion de Personal",()->menuPersonal()),  
                            new MenuItem("Gestion de Pacientes",()->menuPacientes()), 
                            
                            new MenuItem("Volver al menu anterior", ()->menuPrincipal())
                            }
                        
                              );            
                     
                            
         menuPersonal =  new Menu("Gestion Personal",new MenuItem[] 
                           {new MenuItem("Agregar nuevo empleado",()->agregarEmpleado()),   
                            new MenuItem("Asignar turno a Empleado", ()->asignarTurno()),
                            new MenuItem("Imprimir listado Empleados", ()->{
                                                                            p.imprimirPlantilla();
                                                                            menuAdministracion();
                                                                            }),
                            
                            new MenuItem("Volver al menu anterior", ()->menuPrincipal())
                            }
                        
                     );
                     
          menuPacientes =  new Menu("Gestion Pacientes",new MenuItem[] 
                           {new MenuItem("Agregar nuevo paciente",()->agregarPaciente()),   
                            new MenuItem("Eliminar paciente", ()->eliminarPaciente()),
                            new MenuItem("Asignar cita a paciente", ()->asignarCita()),
                            new MenuItem("Imprimir listado Pacientes", ()->{
                                                                            ap.imprimirArchivo();
                                                                            menuPacientes();
                                                                            }),
                            
                            
                            new MenuItem("Volver al menu anterior", ()->menuAdministracion())
                            }
                        
                     );
                     
                     
    
        
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
                System.out.println("Indique: nombre,DNI,Especialidad del nuevo empleado Medicina (separe por una coma cada dato)"); 
                parametros = parametrosUsuario();
                p.agregarEmpleado(new Medico(parametros[0], parametros[1], parametros[2]));
                break; 
            case 3: 
                System.out.println("Indique: nombre,DNI,Especialidad del nuevo empleado Enfermeria (separe por una coma cada dato)");
                parametros = parametrosUsuario();
                p.agregarEmpleado(new Enfermero(parametros[0], parametros[1], parametros[2]));
                break; 
            case 4: 
                System.out.println("Indique: nombre,DNI,Especialidad del nuevo Fisio (separe por una coma cada dato sin dejar espacios)"); 
                parametros = parametrosUsuario();
                p.agregarEmpleado(new Fisio(parametros[0], parametros[1], parametros[2]));
                break; 
            
            case 0:
                menuAdministracion();
                break;
            default: 
                System.out.println("Opción no válida");
                break;
        
                
        }
        
        menuPersonal();
        
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
            menuPersonal();
        }else{
            menuPersonal();
        }
        
        
               
        
    }
    
    private void asignarTurno(){
        
        String[] parametros;
        
        System.out.println("MENU ASIGNAR TURNO A EMPLEADO");
        System.out.println("Indique el ID del empleado al que desea asignar turno (se muestra el listado de empleados existentes)");
        p.imprimirPlantilla();
        int opcion = entrada.nextInt();
        Empleado e = p.obtenerEmpleadoPorId(opcion);
        
        System.out.println("El empleado con ID: " + e.getIdEmpleado() + " DNI: " + e.getDNI() + " NOMBRE: " + e.getNombre() + "\n" + 
                            "està seleccionado");
        //entrada.nextLine(); 
        
        System.out.println("Indique la Unidad, el turno y la fecha del turno (dd,mm,aaaa).(separe por una coma cada dato sin dejar espacios) ");
        parametros = parametrosUsuario();
        
        Asignacion a = new Asignacion(parametros[0], parametros[1], 
                                      Integer.valueOf(parametros[2]), Integer.valueOf(parametros[3]), Integer.valueOf(parametros[4]) 
                                     );
                    
                
                
        e.asignarTurno(a);
        
        System.out.println("Turno asignado al empleado");
        
        menuPersonal();
        
        
        
        
    }
    
    private void agregarPaciente(){
        
        String[] parametros;
        System.out.println("MENU AGREGAR NUEVO PACIENTE"); 
        
        System.out.println("Indique: nombre y DNI del nuevo Empleado de Administracion (separe por una coma cada dato)"); 
                parametros = parametrosUsuario();
                ap.agregarPaciente(new Paciente(parametros[0], parametros[1]));
        
        
        System.out.println("Se ha agregado el paciente al archivo de pacientes");
        menuPacientes();
       
        
        
    }
    
    private void eliminarPaciente(){
         System.out.println("MENU ELIMINAR PACIENTE");
        System.out.println("Indique el ID del paciente que desea eliminar(se muestra el listado de empleados existentes)");
        ap.imprimirArchivo();
        int opcion = entrada.nextInt();
        
        Paciente  p = ap.buscarPacientePorId(opcion);
        
        System.out.println("El paciente con ID: " + p.getIdPaciente() + " DNI: " + p.getDNI() + " NOMBRE: " + p.getNombre() + "\n" + 
                            "será eliminado del Sistema. ¿ESTÁ SEGURO? (S: Si, N: No)");
        entrada.nextLine(); 
        char seguro = entrada.next().toLowerCase().charAt(0);
        
        if(seguro=='s'){
            ap.eliminarPaciente(opcion);
            System.out.println("Se ha eliminado el paciente");
            menuPacientes();
        }else{
            System.out.println("operación cancelada");
            menuPacientes();
        }
        
    }
    private void asignarCita(){
        
        System.out.println("Indicar especialidad para la cita"); 
        String esp = entrada.nextLine();
        GestionCitasConsultas gc = new GestionCitasConsultas(esp);
        System.out.println("Indicar id del Paciente");
        int opcion = entrada.nextInt();
        
        gc.buscaCita(opcion); 
        
        menuPacientes();
                
        
    }
    private String[] parametrosUsuario(){
        entrada.nextLine();
        
        return entrada.nextLine().split(",");
        
    }
}
