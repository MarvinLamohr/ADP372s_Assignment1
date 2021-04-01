package za.ac.cput.ADP372s_Assignment1;

/**
 * @author Ian Louw - 216250773
 *
 * This is a simple identity application
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class identityTest {

    private identity identity1;
    private identity identity2;
    private identity identity3;
    private identity identity4;

    @BeforeEach
    void setUp() {
        identity1 = new identity();
        identity2 = new identity();
        identity3 = new identity();
        identity4 = identity3;
    }

    @Test
    @DisplayName("This should demonstrate Object Equality")
    void testEquality() {

        assertSame(identity1, identity1);
        System.out.println("This is equal");
    }

    @Test
    @DisplayName("This should demonstrate Object Identity")
    void testIdentity()  {
        assertEquals(identity3, identity4);
        System.out.println("This is identical");
    }

    @Test
    @DisplayName("This should demonstrate a failed test")
    void failTest() {
        assertEquals(identity3, identity4);
        fail("this test failed");
    }

    @Test
    @DisplayName("This should demonstrate a test Time Out")
    void testTimeOut(){
        assertTimeout(Duration.ofMillis(100), () -> {
            Thread.sleep(2000);

            System.out.println("Test Timed out");
        });
    }

    @Test
    @Disabled("This should display a disabled test")
    void disableTest() {
        assertEquals(identity3, identity4);
    }

}