package Java_Project;

public class Main {
    public static void main(String[] args) {

        PassengerManager pm = new PassengerManager();
        TicketBookingQueue tq = new TicketBookingQueue();
        RecentlyVisitedStations rs = new RecentlyVisitedStations();
        TravelAnalytics ta = new TravelAnalytics();
        CircularPassengerList cl = new CircularPassengerList();
        SortingSearching ss = new SortingSearching();

        pm.addPassenger(new Passenger(1, "Rahul", 22,
                "Rajiv Chowk", "Kashmere Gate", 500));

        pm.addPassenger(new Passenger(2, "Aman", 25,
                "Noida", "Delhi", 700));

        pm.displayAllPassengers();

        tq.addBookingRequest("Rahul");
        tq.addBookingRequest("Aman");
        tq.viewNextBooking();
        tq.displayPendingQueue();
        tq.processBooking();

        rs.addStation("Rajiv Chowk");
        rs.addStation("Kashmere Gate");
        rs.displayStationHistory();
        rs.undoLastVisitedStation();

        ta.countPassengersPerStation("Rajiv Chowk");
        ta.countPassengersPerStation("Rajiv Chowk");
        ta.countPassengersPerStation("Kashmere Gate");
        ta.displayStationCounts();
        ta.searchFrequency("Rajiv Chowk");

        cl.addPassenger("Rahul");
        cl.addPassenger("Aman");
        cl.displayCircularJourney();

        ss.sortByAge(pm.getPassengers());
        pm.displayAllPassengers();

        ss.sortByWallet(pm.getPassengers());
        pm.displayAllPassengers();
    }
}
