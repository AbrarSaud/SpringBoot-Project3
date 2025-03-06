public class NonSubscribers extends Passenger {
    private boolean IsHaveCoupon;

    public NonSubscribers(String name, int id, Car reserved, boolean IsHaveCoupon) {
        super(name, id, reserved);
        this.IsHaveCoupon = IsHaveCoupon;
    }


    @Override
    public void reserveCar(Car car) {
        if (car.getMaxCapacity() > 0) {
            setReserved(car);
            if (IsHaveCoupon) {
                tripCost = car.getRoute().getTripPrice() * 0.9; // %10
            } else {
                tripCost = car.getRoute().getTripPrice();
            }
            car.setMaxCapacity(car.getMaxCapacity() - 1);
            displayInfo();
        } else {
            System.out.println("Sorry "+getName()+" , there is no capacity of the car ..");
        }

    }

    @Override
    public void displayInfo() {

        super.displayInfo();
        if (IsHaveCoupon) {
            System.out.println("- Trip Cost After discount of 10% is  " + tripCost + " SR");

        } else {
            System.out.println("-Trip Cost :" + tripCost + " SR ..");

        }


    }
}
