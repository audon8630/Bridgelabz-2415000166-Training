import java.util.ArrayList;
import java.util.List;

class Vehicle {
    protected String model;
    protected int year;
    
    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }
    
    @Override
    public String toString() {
        return getClass().getSimpleName() + " - Model: " + model + ", Year: " + year;
    }
}

class Truck extends Vehicle {
    private double cargoCapacity;
    
    public Truck(String model, int year, double cargoCapacity) {
        super(model, year);
        this.cargoCapacity = cargoCapacity;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Cargo Capacity: " + cargoCapacity + " tons";
    }
}

class Car extends Vehicle {
    private int passengerCapacity;
    
    public Car(String model, int year, int passengerCapacity) {
        super(model, year);
        this.passengerCapacity = passengerCapacity;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Passenger Capacity: " + passengerCapacity;
    }
}

class Bike extends Vehicle {
    private String bikeType;
    
    public Bike(String model, int year, String bikeType) {
        super(model, year);
        this.bikeType = bikeType;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Type: " + bikeType;
    }
}

class FleetManager<T extends Vehicle> {
    private List<T> vehicles;
    
    public FleetManager() {
        this.vehicles = new ArrayList<>();
    }
    
    public void addVehicle(T vehicle) {
        vehicles.add(vehicle);
    }
    
    public void showFleet() {
        System.out.println("Fleet Contents:");
        for (T vehicle : vehicles) {
            System.out.println("  - " + vehicle);
        }
        System.out.println("Total vehicles: " + vehicles.size());
    }
}

public class FleetDemo {
    public static void main(String[] args) {
        FleetManager<Truck> truckFleet = new FleetManager<>();
        truckFleet.addVehicle(new Truck("Volvo FH16", 2023, 25.0));
        truckFleet.addVehicle(new Truck("Mercedes Actros", 2022, 20.0));
        
        FleetManager<Bike> bikeFleet = new FleetManager<>();
        bikeFleet.addVehicle(new Bike("Yamaha MT-07", 2023, "Naked"));
        bikeFleet.addVehicle(new Bike("Honda CBR600RR", 2022, "Sport"));
        
        FleetManager<Car> carFleet = new FleetManager<>();
        carFleet.addVehicle(new Car("Toyota Camry", 2023, 5));
        carFleet.addVehicle(new Car("Honda Civic", 2022, 5));
        
        System.out.println("=== Truck Fleet ===");
        truckFleet.showFleet();
        
        System.out.println("\n=== Bike Fleet ===");
        bikeFleet.showFleet();
        
        System.out.println("\n=== Car Fleet ===");
        carFleet.showFleet();
    }
}