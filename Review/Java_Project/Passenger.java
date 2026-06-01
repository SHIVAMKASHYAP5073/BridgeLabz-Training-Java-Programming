package Java_Project;

class Passenger {
    private int passengerId;
    private String name;
    private int age;
    private String sourceStation;
    private String destinationStation;
    private double walletBalance;

    public Passenger(int passengerId, String name, int age,
                     String sourceStation, String destinationStation,
                     double walletBalance) {

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        if (walletBalance < 0) {
            throw new IllegalArgumentException("Wallet balance cannot be negative");
        }

        this.passengerId = passengerId;
        this.name = name;
        this.age = age;
        this.sourceStation = sourceStation;
        this.destinationStation = destinationStation;
        this.walletBalance = walletBalance;
    }

    public int getPassengerId() { return passengerId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getSourceStation() { return sourceStation; }
    public String getDestinationStation() { return destinationStation; }
    public double getWalletBalance() { return walletBalance; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setSourceStation(String sourceStation) { this.sourceStation = sourceStation; }
    public void setDestinationStation(String destinationStation) { this.destinationStation = destinationStation; }
    public void setWalletBalance(double walletBalance) { this.walletBalance = walletBalance; }

    @Override
    public String toString() {
        return "ID: " + passengerId +
                " | Name: " + name +
                " | Age: " + age +
                " | Source: " + sourceStation +
                " | Destination: " + destinationStation +
                " | Wallet: " + walletBalance;
    }
}