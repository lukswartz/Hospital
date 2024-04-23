package personas;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class AsignacionTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AsignacionTest
{
    
    Asignacion a; 
    /**
     * Default constructor for test class AsignacionTest
     */
    public AsignacionTest()
    {
        a = new Asignacion("Consulta", "Mañana", 27,4,2024,5,5,2024);
        a.printAsignacion();

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
}
