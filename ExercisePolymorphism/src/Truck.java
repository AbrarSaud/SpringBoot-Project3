public class Truck implements Vehicle {

    private String type;
    private int week;
    final int weeklyRate = 500;

    public Truck(String type, int week) {
        this.type = type;
        this.week = week;
    }

    @Override
    public double calculateRentalCost() {
        return week * weeklyRate;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n---Rental Details--- \n" +
                "Truck Type: " +    type +
                "\nweekly Rental Rate: " + weeklyRate +
                "\nRental Cost: " + calculateRentalCost());
        System.out.println("------------------- \n");

    }
}
