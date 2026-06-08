package org.example.com.cab;
import java.util.ArrayList;

public class InvoiceGenerator {
    public double calculateFare(Ride ride){
        double fare;
        if (ride.rideType.equals("PREMIUM")) {

            fare = ride.distance * 15
                    + ride.time * 2;

            return Math.max(fare, 20);
        }else{
            fare = ride.distance * 10
                    + ride.time;

            return Math.max(fare, 5);
        }

    }
    public InvoiceSummary calculateFare(ArrayList<Ride> rides){
        double totalFare=0;
        for(Ride ride: rides){
            totalFare+=calculateFare(ride);

        }
        return new InvoiceSummary(rides.size(),totalFare);
    }

}
