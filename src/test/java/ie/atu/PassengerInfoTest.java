package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerInfoTest {

    PassengerInfo myAge;
    PassengerInfo myTitle;
    PassengerInfo myName;
    PassengerInfo myID;
    PassengerInfo myPhone;
    @BeforeEach
    void setUp() {

        myTitle = new PassengerInfo();
        myName = new PassengerInfo();
        myID = new PassengerInfo();
        myPhone = new PassengerInfo();
        myAge = new PassengerInfo();
    }


    @Test
    void testTitle()
    {
        assertEquals(1, myTitle.title());
    }
    @Test
    void testName()
    {
        assertEquals(1,myName.name());
    }
    @Test
    void testID()
    {
        assertEquals(1,myID.id());
    }
    @Test
    void testPhone()
    {
        assertEquals(1,myPhone.phone());
    }
    @Test
    void testAge()
    {
        assertEquals(1,myAge.age());
    }











    @AfterEach
    void tearDown() {
    }
}