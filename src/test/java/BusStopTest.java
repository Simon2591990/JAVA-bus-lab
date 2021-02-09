import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;

    @Before
    public void before(){
        busStop = new BusStop("Gyle Center");
        person = new Person("Alfred");
    }
    @Test
    public void hasName(){
        assertEquals("Gyle Center", busStop.getName());
    }
    @Test
    public void queueStartsEmpty(){
        assertEquals(0, busStop.queueLength());
    }
    @Test
    public void canAddPersonToQueue(){
        busStop.addPersonToQueue(person);
        assertEquals(1, busStop.queueLength());
    }
    @Test
    public void  canRemovePersonFromQueue(){
        busStop.addPersonToQueue(person);
        busStop.removePersonFromQueue(person);
        assertEquals(0, busStop.queueLength());
    }



}
