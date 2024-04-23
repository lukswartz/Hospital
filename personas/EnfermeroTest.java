package personas;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class EnfermeroTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class EnfermeroTest
{
    Enfermero enf1; 
    Asignacion a1; 
    
    public EnfermeroTest()
    {
       enf1 = new Enfermero("Ana Enfermeria", "22344536", "Enfermeria");
       a1 = new Asignacion("Hospitalizacion", "Tarde", 29,4,2024,5,5,2024);
       enf1.asignarTurno(a1);
       System.out.println(enf1.toString());
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
