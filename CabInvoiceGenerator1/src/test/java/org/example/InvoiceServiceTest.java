package org.example;



import org.example.com.cab.InvoiceService;
import org.example.com.cab.InvoiceSummary;
import org.example.com.cab.Ride;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InvoiceServiceTest {

    @Test
    void userInvoiceTest() {

        InvoiceService service = new InvoiceService();

        service.addRide("101", new Ride(2, 5, "NORMAL"));

        InvoiceSummary summary = service.getInvoice("101");

        assertEquals(25, summary.totalFare);
    }
}
