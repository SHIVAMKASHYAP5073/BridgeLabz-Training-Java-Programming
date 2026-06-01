package Java_Project;
import java.util.*;
class PassengerManager {
    private ArrayList<Passenger> passengers = new ArrayList<>();

    public void addPassenger(Passenger p) {
        for (Passenger passenger : passengers) {
            if (passenger.getPassengerId() == p.getPassengerId()) {
                System.out.println("Passenger ID must be unique.");
                return;
            }
        }
        passengers.add(p);
        System.out.println("Passenger added successfully.");
    }

    public void removePassenger(int id) {
        Passenger p = searchPassenger(id);
        if (p != null) {
            passengers.remove(p);
            System.out.println("Passenger removed successfully.");
        } else {
            System.out.println("Passenger not found.");
        }
    }

    public void updatePassenger(int id, String newName) {
        Passenger p = searchPassenger(id);
        if (p != null) {
            p.setName(newName);
            System.out.println("Passenger updated successfully.");
        } else {
            System.out.println("Passenger not found.");
        }
    }
    public Passenger searchPassenger(int id) {
        for (Passenger p : passengers) {
            if (p.getPassengerId() == id) {
                return p;
            }
        }
        return null;
    }

    public void displayAllPassengers() {
        if (passengers.isEmpty()) {
            System.out.println("No passengers available.");
            return;
        }

        for (Passenger p : passengers) {
            System.out.println(p);
        }
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }
}


