public class Car implements Vehicle {
    private String model;
    private int days;
    final int dailyRate = 50;

    public Car(String model, int days) {
        this.model = model;
        this.days = days;
    }

    @Override
    public double calculateRentalCost() {
        return days * dailyRate;
    }

    @Override
    public void displayDetails() {
        System.out.print("\n---Rental Details--- \n" +
                "Car Model: " + model +
                "\nDaily Rental Rate: " + dailyRate +
                "\nRental Cost: " + calculateRentalCost());
        System.out.print("\n-------------------\n");


    }
}
