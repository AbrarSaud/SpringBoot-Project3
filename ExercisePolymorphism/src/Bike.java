public class Bike implements Vehicle {
    private String brand;
    private int hour;
    final int hourlyRate = 10;

    public Bike(String brand, int hour) {
        this.brand = brand;
        this.hour = hour;
    }

    @Override
    public double calculateRentalCost() {
        return hour * hourlyRate;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n---Rental Details--- \n" +
                "Bike Band: " + brand +
                "\nhourly Rental Rate:" + hourlyRate +
                "\nRental Cost: " + calculateRentalCost());
        System.out.println("------------------- \n");

    }
}
