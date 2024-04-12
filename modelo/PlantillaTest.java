package modelo;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class PlantillaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PlantillaTest
{
    /**
     * Default constructor for test class PlantillaTest
     */
    
    Plantilla p; 
    
    public PlantillaTest()
    {
        p = Plantilla.getInstancia();
        
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void probarPlantillaVacia()
    {
        assertEquals(null, p.buscarSanitarioPorID(1003));
    }

    @Test
    public void agregarUnEmpleado()
    {
        assertEquals(true, p.agregarEmpleado(new personas.Medico("Juan Medico", "45234890S", "Consulta", "Mañana", "Traumatologia")));
    }
}

