package chapter1;

import junit.framework.JUnit4TestAdapter;
import org.junit.Test;
import static org.junit.Assert.*;
import refbook.StandardOutputTest;

public class MainTest extends StandardOutputTest{
    /**
     * Test of main method, of class Main.
     */
    @Test public void testMain() {

        String expected = getExpectedOutput(
            "Andrew walks.",
            "Andrew stops.",
            "Andrew jumps.");

        // Actual
        Main.main(new String[0]);
        String actual = getActualOutput();

        // Assert
        assertEquals(expected, actual);
    }

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(MainTest.class);
    }
}
