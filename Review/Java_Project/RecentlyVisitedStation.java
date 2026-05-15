package Java_Project;
import java.util.*;
class RecentlyVisitedStations {
    private Stack<String> stationStack = new Stack<>();

    public void addStation(String station) {
        stationStack.push(station);
        System.out.println("Visited station added: " + station);
    }

    public void undoLastVisitedStation() {
        if (stationStack.isEmpty()) {
            System.out.println("No station history found.");
            return;
        }

        System.out.println("Undo station: " + stationStack.pop());
    }

    public void displayStationHistory() {
        System.out.println("Station History: " + stationStack);
    }
}
