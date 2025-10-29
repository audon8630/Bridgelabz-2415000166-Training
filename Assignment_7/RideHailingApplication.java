import java.util.*;

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

abstract class Vehicle implements GPS {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String location;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver: " + driverName);
        System.out.println("Rate/Km: " + ratePerKm);
        System.out.println("Current Location: " + location);
    }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String location) { this.location = location; }

    public double getRatePerKm() { return ratePerKm; }
}

class Car extends Vehicle {
    public Car(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
}

class Bike extends Vehicle {
    public Bike(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.8; // cheaper
    }
}

class Auto extends Vehicle {
    public Auto(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 20; // base fare
    }
}

public class RideHailingApplication {
    public static void main(String[] args) {
        List<Vehicle> rides = new ArrayList<>();
        rides.add(new Car("V001", "Rahul", 15));
        rides.add(new Bike("V002", "Amit", 10));
        rides.add(new Auto("V003", "Raj", 12));

        for (Vehicle v : rides) {
            v.updateLocation("Downtown");
            v.getVehicleDetails();
            System.out.println("Fare for 10km: " + v.calculateFare(10));
            System.out.println();
        }
    }
}
