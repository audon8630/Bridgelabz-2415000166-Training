public class Vehicles {
    public static void main(String[] args) {

        Vehicle car = (rent) -> {
            if (rent) System.out.println("Car rented");
            else System.out.println("Car returned");
        };

        Vehicle bike = (rent) -> {
            if (rent) System.out.println("Bike rented");
            else System.out.println("Bike returned");
        };

        Vehicle bus = (rent) -> {
            if (rent) System.out.println("Bus rented");
            else System.out.println("Bus returned");
        };

        car.action(true);
        bus.action(false);
        bike.action(true);
    }

    public interface Vehicle {
        void action(boolean rent);
    }
}
