package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerInfoTest {
    PassengerInfo myCount;

    @BeforeEach
    void setUp() {
        myCount = new PassengerInfo();
    }
    @Test
    void testIncrement()
    {
    assertEquals(1,myCount.increment());
    }

    @Test
    void testConstructor()
    {
       Exception exMessage =  assertThrows(IllegalArgumentException.class, ()-> { new PassengerInfo(4);});
       assertEquals("This is not a valid number", exMessage.getMessage());
    }

    @AfterEach
    void tearDown() {
    }
}