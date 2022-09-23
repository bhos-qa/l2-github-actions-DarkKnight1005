package lab2;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("App must have a greeting", classUnderTest.getGreeting());
    }
}
