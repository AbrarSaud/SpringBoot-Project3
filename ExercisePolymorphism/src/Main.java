import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Vehicle> rentedVehicles = new ArrayList<>();
        int choice;
        do {
            System.out.println("Vehicle Rental System : \n" +
                    "1. Rent a Car\n" +
                    "2. Rent a Bike\n" +
                    "3. Rent a Truck\n" +
                    "4. View Rented Vehicles\n" +
                    "5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();
            // Do-while loop to display the menu until the user chooses Exit (5)
            switch (choice) {
                case 1:
                    System.out.print("Enter Car Model:  ");
                    String carModel = input.next();
                    System.out.print("Enter Rental Days:  ");
                    input.nextLine();
                    int day = input.nextInt();
                    // Create Car object and add it to the list
                    Car car = new Car(carModel, day);
                    rentedVehicles.add(car);// Add the to the list of rented vehicles
                    car.displayDetails();// Display car details
                    break;
                case 2:
                    System.out.print("Enter Bike brand:  ");
                    String bikeBrand = input.next();
                    System.out.print("Enter Rental Hour:  ");
                    int hour = input.nextInt();
                    // Create Bike object and add it to the list
                    Bike bike = new Bike(bikeBrand, hour);
                    rentedVehicles.add(bike);//Add the to the list of rented vehicles
                    bike.displayDetails(); // Display bike details
                    break;
                case 3:
                    System.out.print("Enter Truck Type:  ");
                    String truckType = input.next();
                    System.out.print("Enter Rental Week:  ");
                    int week = input.nextInt();
                    // Create Truck object and add it to the list
                    Truck truck = new Truck(truckType, week);
                    rentedVehicles.add(truck);// Add the to the list of rented vehicles
                    truck.displayDetails();// Display truck details
                    break;
                case 4:
                    // View all rented vehicles
                    System.out.println("---View Rented Vehicles---");
                    for (Vehicle v : rentedVehicles) {
                        System.out.print("***************************\n");
                        v.displayDetails();// Display each vehicle details
                        System.out.print("\n***************************\n");
                    }
                    break;
                case 5:
                    System.out.println("Thank you for using the Vehicle Rental System!");
                    break;

                default:
                    System.out.println("Please enter from 1 to 5.");
            }
        } while (choice != 5);
    }
}