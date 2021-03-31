package za.ac.cput.ADP372s_Assignment1;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


/**

 * Student Name: MARVIN LAMOHR
 * Student Number: 214273830

 */

class TestDrivenDevelopmentTest {

    private TestDrivenDevelopmentTest car1;
    private TestDrivenDevelopmentTest car2;
    private TestDrivenDevelopmentTest car3;
    private TestDrivenDevelopmentTest car4;

    private TestDrivenDevelopmentTest shop1;
    private TestDrivenDevelopmentTest shop2;
    private TestDrivenDevelopmentTest shop3;


    @BeforeEach
    void setUp(){

        car1 = new TestDrivenDevelopmentTest();
        car2 = new TestDrivenDevelopmentTest();
        car3 = new TestDrivenDevelopmentTest();
        car4 = car2;


        shop1 = new TestDrivenDevelopmentTest();
        shop2 = shop3;

    }


    /* Testing For Object Equality */

    @Test
    void objectEquality(){

        assertEquals(car1,car1);
    }


    /* Testing For Object Identity */

    @Test
    void objectIdentity(){

        assertSame(car2,car4);

    }


    /* Making Sure The Test Fails */

    @Test
    void failingTest(){

        fail("Loadshedding...Shutting Down...");
        assertNotSame(shop1,car1);

    }


    /* Running Timeouts */

    @Test
    @Timeout(3)
    void timeOuts() throws InterruptedException {

    Thread.sleep(300);
    System.out.println("Test will pass soon... Please be patient...");
    }


    /* Initiating A Disabling Test */

    @Test
    @Disabled
    void disablingTest() throws InterruptedException{

        assertEquals(shop2,shop3);
        System.out.println("Exit");
    }



}