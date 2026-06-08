package org.example.com.cab;




import java.util.ArrayList;
import java.util.HashMap;

public class InvoiceService {

    HashMap<String, ArrayList<Ride>> rideMap =
            new HashMap<>();

    HashMap<String, Customer> customerMap =
            new HashMap<>();

    public void addCustomer(Customer customer) {

        customerMap.put(
                customer.userId,
                customer);
    }

    public void addRide(String userId,
                        Ride ride) {

        rideMap
                .computeIfAbsent(
                        userId,
                        k -> new ArrayList<>())
                .add(ride);
    }

    public InvoiceSummary getInvoice(
            String userId) {

        InvoiceGenerator generator =
                new InvoiceGenerator();

        ArrayList<Ride> rides =
                rideMap.get(userId);

        double totalFare = 0;

        for (Ride ride : rides) {

            totalFare +=
                    generator.calculateFare(ride);
        }

        Customer customer =
                customerMap.get(userId);

        return new InvoiceSummary(rides.size(),
                totalFare);
    }
}