import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BusStopTest {
    Person person;
    BusStop busStop;

    @Before
    public void before() {
        person = new Person();
        busStop = new BusStop("Lady Lawson Street");
    }

    @Test
    public void checkQueueInitiallyEmpty() {
        assertEquals(0, busStop.queueLength());
    }

    @Test
    public void personAddedToQueue() {
        busStop.addPersonToQueue(person);
        assertEquals(1, busStop.queueLength());
    }

    @Test
    public void personRemovedFromQueue() {
        busStop.addPersonToQueue(person);
        assertEquals(1, busStop.queueLength());
        assertEquals(person, busStop.removePersonFromQueue());
        assertEquals(0, busStop.queueLength());
    }

}
