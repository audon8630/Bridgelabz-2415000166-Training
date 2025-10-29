import java.util.*;

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient implements MedicalRecord {
    private String patientId;
    private String name;
    private int age;
    private List<String> records = new ArrayList<>();

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records: " + records);
    }
}

class InPatient extends Patient {
    private int days;
    private double roomCharge;

    public InPatient(String id, String name, int age, int days, double roomCharge) {
        super(id, name, age);
        this.days = days;
        this.roomCharge = roomCharge;
    }

    @Override
    public double calculateBill() {
        return days * roomCharge;
    }
}

class OutPatient extends Patient {
    private double consultationFee;

    public OutPatient(String id, String name, int age, double fee) {
        super(id, name, age);
        this.consultationFee = fee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        patients.add(new InPatient("P001", "Alice", 30, 5, 2000));
        patients.add(new OutPatient("P002", "Bob", 40, 500));

        for (Patient p : patients) {
            p.getPatientDetails();
            p.addRecord("General check-up");
            p.viewRecords();
            System.out.println("Total Bill: " + p.calculateBill());
            System.out.println();
        }
    }
}
