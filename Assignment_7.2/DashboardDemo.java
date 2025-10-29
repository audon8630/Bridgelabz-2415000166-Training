interface VehicleDashboard {
    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery percentage: Feature not supported.");
    }
}

class ElectricCar implements VehicleDashboard {
    public void displaySpeed() {
        System.out.println("Speed: 80 km/h");
    }

    @Override
    public void displayBattery() {
        System.out.println("Battery: 75%");
    }
}

class PetrolCar implements VehicleDashboard {
    public void displaySpeed() {
        System.out.println("Speed: 100 km/h");
    }
}

public class DashboardDemo {
    public static void main(String[] args) {
        VehicleDashboard tesla = new ElectricCar();
        VehicleDashboard honda = new PetrolCar();

        System.out.println("Electric Car");
        tesla.displaySpeed();
        tesla.displayBattery();

        System.out.println("Petrol Car");
        honda.displaySpeed();
        honda.displayBattery();
    }
}
