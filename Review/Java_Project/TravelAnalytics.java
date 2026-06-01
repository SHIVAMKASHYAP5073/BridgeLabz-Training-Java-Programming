package Java_Project;
import java.util.*;
class TravelAnalytics {
    private HashMap<String, Integer> stationFrequency = new HashMap<>();

    public void countPassengersPerStation(String station) {
        stationFrequency.put(station,
                stationFrequency.getOrDefault(station, 0) + 1);
    }

    public void displayStationCounts() {
        System.out.println("Station-wise Passenger Count:");
        for (String station : stationFrequency.keySet()) {
            System.out.println(station + " -> " + stationFrequency.get(station));
        }
    }

    public void searchFrequency(String station) {
        System.out.println(station + " frequency: " +
                stationFrequency.getOrDefault(station, 0));
    }
}