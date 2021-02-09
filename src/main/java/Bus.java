import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination){
        this.destination = destination;
        this.capacity = 5;
        this.passengers = new ArrayList<Person>();
    }

    public String getDestination() {
        return this.destination;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int numberOfPassengers() {
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        if (this.passengers.size() < capacity) {
            this.passengers.add(person);
        }
    }

    public void removePassenger(Person person) {
        this.passengers.remove(person);
    }

    public void pickUp(Person person, BusStop busStop) {
        this.addPassenger(person);
        busStop.removePersonFromQueue(person);

    }
}
