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
    Paciente p1,p2,p3,p4; 
    /**
     * Default constructor for test class ConsultaMedicoTest
     */
    public ConsultaMedicoTest()
    {
        med = new Medico("Juan Medico", "234234S","Traumatologia",  "Consulta", "Mañana");
        c = new ConsultaMedico(med, 9, 4, 2024);
        p1 = new Paciente("Francisco Paciente", "4324789A");
        p2 = new Paciente("Lucas Paciente", "4324789A");
        p3 = new Paciente("Maria Paciente", "2342349A");
        p4 = new Paciente("Elena Paciente", "43434289A");
        
        c.asignarHora(p1);
        c.asignarHora(p2);
        c.asignarHora(p3);
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
