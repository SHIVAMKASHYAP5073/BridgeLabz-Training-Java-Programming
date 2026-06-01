package Java_Project;

class CircularPassengerList {

    class Node {
        String name;
        Node next;

        Node(String name) {
            this.name = name;
            this.next = null;
        }
    }

    private Node last = null;

    public void addPassenger(String name) {
        Node newNode = new Node(name);

        if (last == null) {
            last = newNode;
            last.next = last;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }

        System.out.println("Passenger added to circular route.");
    }

    public void displayCircularJourney() {
        if (last == null) {
            System.out.println("Circular route is empty.");
            return;
        }

        Node temp = last.next;
        do {
            System.out.print(temp.name + " -> ");
            temp = temp.next;
        } while (temp != last.next);

        System.out.println("(Back to Start)");
    }
}

