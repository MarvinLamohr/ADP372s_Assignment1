package za.ac.cput.ADP372s_Assignment1;
/**
 * 218147856
 * Lefu Kumeke
 *
 * ADP3 ASSIGNMENT 2021
 *
 *
 *
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;

class TestDrivenDevelopmentTest {

    private TestDrivenDevelopment person1;
    private TestDrivenDevelopment person2;
    private int Monday;
    private int Friday;

    @BeforeEach
    void setUp() {

        person1 = new TestDrivenDevelopment();
        person2 = new TestDrivenDevelopment();
        Monday = 10;
        Friday = 10;
    }

    @Test
    void testObjectIdentity() {
        assertSame(person1, person2);
    }

    @Test
    void testObjectEquality() {
        assertEquals(person1, person2);
    }

    @Test
    void failingTest() {
        fail("This test will fail");
        assertEquals(Monday, Friday);
    }

    @Test
    @Timeout(6)
    public void timeoutTest() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        System.out.println("Test passed within the given time");
    }

    @Disabled("This option is disabled")
    @Test
    void disablingTest() {
        assertTrue(2 > 0);
    }
}

