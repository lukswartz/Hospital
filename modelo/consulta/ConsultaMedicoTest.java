package modelo.consulta;
import personas.*;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ConsultaMedicoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ConsultaMedicoTest
{
    
    Medico med;
    ConsultaMedico c; 
    Paciente p1; 
    /**
     * Default constructor for test class ConsultaMedicoTest
     */
    public ConsultaMedicoTest()
    {
        med = new Medico("Juan Medico", "234234S", "Consulta", "Mañana", "Traumatologia");
        c = new ConsultaMedico(med, 9, 4, 2024);
        p1 = new Paciente("Francisco Paciente", "4324789A");
        
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
