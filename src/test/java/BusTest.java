import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private Person person2;

    @Before
    public void before(){
        bus = new Bus("Ocean Terminal");
        person = new Person("Alfred");
        person2 = new Person("Batman");
    }

    @Test
    public void hasDestination(){
        assertEquals("Ocean Terminal", bus.getDestination());
    }
    @Test
    public void capacityIsSetTo5(){
        assertEquals(5, bus.getCapacity());
    }
    @Test
    public void passengersStartsEmpty(){
        assertEquals(0, bus.numberOfPassengers());
    }
    @Test
    public void canAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.numberOfPassengers());
    }
    @Test
    public void cantAddPassengerIfCapacityFull(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(5, bus.numberOfPassengers());
    }
    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.removePassenger(person);
        assertEquals(0, bus.numberOfPassengers());
    }
    @Test
    public void canRemoveSpecificPerson(){
        bus.addPassenger(person);
        bus.addPassenger(person2);
        bus.removePassenger(person);
        assertEquals(1, bus.numberOfPassengers());

    }

}
