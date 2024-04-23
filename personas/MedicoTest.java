package personas;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate; 

/**
 * The test class MedicoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MedicoTest
{
    
    Medico med1; 
    Asignacion a1; 
    
    /**
     * Default constructor for test class MedicoTest
     */
    public MedicoTest()
    {
       med1 = new Medico("Carmen Medico", "234234", "Digestivo");
       a1 = new Asignacion("Consulta", "Mañana", LocalDate.of(2024, 5,2), LocalDate.of(2024,5,3));
       med1.asignarTurno(a1);
       
       
       System.out.println(med1.toString());
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
