abstract class Passenger {
    double tripCost;
    private String name;
    private int id;
    private Car reserved;

    public Passenger(String name, int id, Car reserved) {
        this.name = name;
        this.id = id;
        this.reserved = reserved;

    }

    public Passenger(String name, int id, Car reserved, double tripCost) {
        this.name = name;
        this.id = id;
        this.reserved = reserved;
        this.tripCost = tripCost;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Car getReserved() {
        return reserved;
    }

    public void setReserved(Car reserved) {
        this.reserved = reserved;
    }

    // Methods
    public abstract void reserveCar(Car car);

    public void displayInfo() {
        System.out.println("\n--- Information--- ");
        System.out.println("-Name:" + name + "      -ID:" + id + "\n-Car Code :" + reserved.getCode());
        if (reserved != null) {
            System.out.println("-Start Address: " + reserved.getRoute().getStartAddress()+ "      -Destination Address: "+reserved.getRoute().getDestinationAddress());
            System.out.println("-Route Price: " + reserved.getRoute().getTripPrice() + " SR");
        } else {
            System.out.println("No car reserved for this passenger.");
        }


    }
}
