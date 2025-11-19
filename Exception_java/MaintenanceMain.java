class ServiceOverdueException extends Exception {
    public ServiceOverdueException(String message) {
        super(message);
    }
}

class InvalidMileageException extends Exception {
    public InvalidMileageException(String message) {
        super(message);
    }
}

class Vehicle {
    private int mileage;
    private boolean serviceOverdue;

    public Vehicle(int mileage, boolean serviceOverdue) {
        this.mileage = mileage;
        this.serviceOverdue = serviceOverdue;
    }

    public void checkMaintenance() throws ServiceOverdueException, InvalidMileageException {
        if (mileage < 0) {
            throw new InvalidMileageException("Invalid mileage: mileage cannot be negative.");
        }
        if (serviceOverdue) {
            throw new ServiceOverdueException("Service overdue! Please schedule maintenance.");
        }
        System.out.println("Vehicle is in good condition. No maintenance needed.");
    }
}

public class MaintenanceMain {
    public static void main(String[] args) {
        Vehicle car = new Vehicle(-500, true);

        try {
            car.checkMaintenance();
        } catch (InvalidMileageException e) {
            System.out.println(e.getMessage());
        } catch (ServiceOverdueException e) {
            System.out.println(e.getMessage());
        }
    }
}
