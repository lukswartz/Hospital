package interfaz;


/**
 * Write a description of class MenuItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuItem {
    private String etiqueta;
    private Runnable accion;

    public MenuItem(String etiqueta, Runnable accion) {
        this.etiqueta = etiqueta;
        this.accion = accion;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void ejecutarAccion() {
        if (accion != null) {
            accion.run();
        }
    }
}