package lab2;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void appHasAGreeting() {
        App classUnderTest = new App();
        assertEquals("App must have a greeting which is: Hello World!", "Hello World!", classUnderTest.getGreeting());
    }
}
