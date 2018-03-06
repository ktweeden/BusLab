import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Person person;
    Bus bus;

    @Before
    public void before() {
        bus = new Bus("CodeClan", 5);
        person = new Person();
    }

    @Test
    public void getNumberOfPassengersIsEmpty() {
        assertEquals(0, bus.numberOfPassengers());
    }

    @Test
    public void addPassengerWhenNotFull() {
        bus.addPassenger(person);
        assertEquals(1, bus.numberOfPassengers());
    }
}
