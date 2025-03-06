public class Main {
    public static void main(String[] args) {

        Route route1 = new Route("Address 1", "Address 2", 200);
        Route route2 = new Route("Address A", "Address B", 400);
        Car car1 = new Car("101", route1, 4);
        Car car2 = new Car("102", route2, 0);
        System.out.println("--- Information Route--- ");
        System.out.println(route1.toString());
        System.out.println(route2.toString());

        Passenger[] passengers = new Passenger[3];
        passengers[0] = new Subscribers("Abrar", 101, car1);
        passengers[1] = new NonSubscribers("Reem", 102, car2, true);
        passengers[2] = new NonSubscribers("Ali", 103, car1, false);
        for (Passenger passenger : passengers) {
            passenger.reserveCar(passenger.getReserved());
            System.out.print("\n");
//            passenger.displayInfo();
        }

    }
}