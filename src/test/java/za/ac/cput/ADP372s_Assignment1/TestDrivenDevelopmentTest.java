package za.ac.cput.ADP372s_Assignment1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class TestDrivenDevelopmentTest {
private TestDrivenDevelopmentTest  tdd1;
private TestDrivenDevelopmentTest  tdd2;
private TestDrivenDevelopmentTest tdd3;

@BeforeEach
    void setupTest(){
    tdd1 = new TestDrivenDevelopmentTest();
    tdd2= tdd3;
    tdd3= tdd3;
}
    @Test
    void testIdentity()
    {
        assertSame(tdd2,tdd3);
    }
    @Test
    void testEquality(){
    assertEquals(tdd3,tdd3);
    }
    @Test
    void testGetId(){
        fail("Not implemented");
        assertEquals(tdd3,tdd3);
    }
    @Test
    @Disabled
    @DisplayName("This method should not run")
    void testDisabled(){
        fail("this test method should be disabled");

    }
    @Test
    @Timeout(5)
    public void timeoutTest() throws InterruptedException{
        Thread.sleep(500);
        System.out.println("Test will passed with in the time");
    }
}

