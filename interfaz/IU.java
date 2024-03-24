package interfaz;


/**
 * Write a description of class IU here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IU
{
    
    
     public void mostrarMenuPrincipal(){
        
        String[] opciones = {"ADMINISTRACION", "MEDICINA", "ENFERMERIA/FISIOTERAPIA", "SERVICIOS", "SALIR"};
        new Menu ("MENU PRINCIPAL", 5, opciones).printMenu();
       
        
    }
    
    public void irSubmenu(char opcion){
        
        switch(opcion){
            
            case '1':
                //mostrarMenuAdministracion();
                System.out.println("MenuAdministracion");
                break;
            case '2':
                //mostrarMenuMedicina();
                System.out.println("MenuMedicina");
                break;
            case '3':
                //mostrarMenuEnfermeria();
                System.out.println("MenuEnfermeria");
                break;
            case '4':
                //mostrarMenuServicios();
                System.out.println("MenuServicios");
                break;
            
            
            
        }
    }
}
