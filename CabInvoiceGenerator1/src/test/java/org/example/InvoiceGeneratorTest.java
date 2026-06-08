package org.example;
import org.example.com.cab.InvoiceGenerator;
import org.example.com.cab.InvoiceSummary;
import org.example.com.cab.Ride;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;


public class InvoiceGeneratorTest {
    InvoiceGenerator generator = new InvoiceGenerator();
    @Test
    void normalRideFare() {

        Ride ride = new Ride(2, 5, "NORMAL");
        Assertions.assertEquals(25,generator.calculateFare(ride));
    }
    @Test
    void premiumRideFare() {
    Ride ride =new Ride(2, 5, "PREMIUM");

    Assertions.assertEquals(40,generator.calculateFare(ride));
}
    @Test
    void multipleRides() {

        ArrayList<Ride> rides = new ArrayList<>();

        rides.add(new Ride(2, 5, "NORMAL"));

        rides.add(new Ride(3, 5, "NORMAL"));
        InvoiceSummary summary = generator.calculateFare(rides);

        Assertions.assertEquals(2, summary.totalRides);


    }


}
