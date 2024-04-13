package modelo.consulta;
import personas.*;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ConsultasProgramadasTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ConsultasProgramadasTest
{
    Medico med;
    ConsultaMedico c;
    Paciente p1;
    ConsultasProgramadas cp;

    /**
     * Default constructor for test class ConsultasProgramadasTest
     */
    public ConsultasProgramadasTest()
    {
        med = new Medico("Juan Medico", "234234S","Traumatologia",  "Consulta", "Mañana");
        c = new ConsultaMedico(med, 9, 4, 2024);
        p1 = new Paciente("Francisco Paciente", "4324789A");
        cp = new ConsultasProgramadas();
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
