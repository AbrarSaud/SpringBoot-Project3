public class Subscribers extends Passenger {


    public Subscribers(String name, int id, Car reserved) {
        super(name, id, reserved);
    }

    @Override
    public void reserveCar(Car car) {
        if (car.getMaxCapacity() > 0) {
            setReserved(car);
            tripCost = car.getRoute().getTripPrice() * 0.50; // %50
            car.setMaxCapacity(car.getMaxCapacity() - 1);
            displayInfo();
        } else {
            System.out.println("Sorry "+getName()+" , there is no capacity of the car ..");
        }

    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("- Trip Cost After discount of 50% is  " + tripCost + " SR");

    }
}
