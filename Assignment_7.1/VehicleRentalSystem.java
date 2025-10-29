interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRatePerDay;

    public Vehicle(String vehicleNumber, String type, double rentalRatePerDay) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRatePerDay = rentalRatePerDay;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRatePerDay() { return rentalRatePerDay; }
    public void setRentalRatePerDay(double rate) { if (rate >= 0) this.rentalRatePerDay = rate; }

    public abstract double calculateRentalCost(int days);

    public void display() {
        System.out.printf("%s (%s) - Rate/day: %.2f%n", vehicleNumber, type, rentalRatePerDay);
    }
}

class Car extends Vehicle implements Insurable {
    private String policyNumber;

    public Car(String vehicleNumber, double ratePerDay, String policyNumber) {
        super(vehicleNumber, "Car", ratePerDay);
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) { return getRentalRatePerDay() * days; }

    @Override
    public double calculateInsurance() { return 500 + 0.01 * getRentalRatePerDay() * 365; }

    @Override
    public String getInsuranceDetails() { return "Policy: " + policyNumber; }
}

class Bike extends Vehicle {
    public Bike(String vehicleNumber, double ratePerDay) { super(vehicleNumber, "Bike", ratePerDay); }
    @Override public double calculateRentalCost(int days) { return getRentalRatePerDay() * days; }
}

class Truck extends Vehicle implements Insurable {
    private String policyNumber;

    public Truck(String vehicleNumber, double ratePerDay, String policyNumber) {
        super(vehicleNumber, "Truck", ratePerDay);
        this.policyNumber = policyNumber;
    }

    @Override public double calculateRentalCost(int days) { return getRentalRatePerDay() * days * 1.2; } // heavier charge
    @Override public double calculateInsurance() { return 1200 + 0.02 * getRentalRatePerDay() * 365; }
    @Override public String getInsuranceDetails() { return "Policy: " + policyNumber; }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle[] fleet = {
                new Car("KA01AB1234", 2500, "CARPOL123"),
                new Bike("KA02XY5678", 500),
                new Truck("KA03TR9999", 8000, "TRUCKPOL999")
        };

        for (Vehicle v : fleet) {
            v.display();
            int days = 3;
            System.out.printf("Rental for %d days: %.2f%n", days, v.calculateRentalCost(days));
            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                System.out.printf("Insurance: %.2f | %s%n", ins.calculateInsurance(), ins.getInsuranceDetails());
            } else {
                System.out.println("Not insurable via this interface.");
            }
            System.out.println("-----");
        }
    }
}
