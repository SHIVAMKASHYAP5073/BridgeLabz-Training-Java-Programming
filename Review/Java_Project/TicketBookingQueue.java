package Java_Project;
import java.util.*;
class TicketBookingQueue {
    private Queue<String> bookingQueue = new LinkedList<>();

    public void addBookingRequest(String passengerName) {
        bookingQueue.offer(passengerName);
        System.out.println("Booking request added for: " + passengerName);
    }

    public void processBooking() {
        if (bookingQueue.isEmpty()) {
            System.out.println("No pending bookings.");
            return;
        }

        System.out.println("Processed booking for: " + bookingQueue.poll());
    }

    public void viewNextBooking() {
        if (bookingQueue.isEmpty()) {
            System.out.println("No next booking.");
            return;
        }

        System.out.println("Next booking: " + bookingQueue.peek());
    }

    public void displayPendingQueue() {
        System.out.println("Pending Queue: " + bookingQueue);
    }
}

