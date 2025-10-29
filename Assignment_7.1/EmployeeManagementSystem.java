import java.util.*;

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

abstract class Employee implements Department {
    private int employeeId;
    private String name;
    private double baseSalary;
    private String department;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Department: " + getDepartmentDetails());
        System.out.println("Total Salary: " + calculateSalary());
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public void assignDepartment(String dept) {
        this.department = dept;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}

class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double bonus) {
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (hoursWorked * hourlyRate);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for employee " + (i + 1));
            System.out.print("Employee ID: ");
            int id = input.nextInt();
            input.nextLine();

            System.out.print("Name: ");
            String name = input.nextLine();

            System.out.print("Base Salary: ");
            double baseSalary = input.nextDouble();
            input.nextLine();

            System.out.print("Is FullTime? (yes/no): ");
            String type = input.nextLine();

            Employee emp;
            if (type.equalsIgnoreCase("yes")) {
                System.out.print("Enter bonus: ");
                double bonus = input.nextDouble();
                input.nextLine();
                emp = new FullTimeEmployee(id, name, baseSalary, bonus);
            } else {
                System.out.print("Enter hours worked: ");
                int hours = input.nextInt();
                System.out.print("Enter hourly rate: ");
                double rate = input.nextDouble();
                input.nextLine();
                emp = new PartTimeEmployee(id, name, baseSalary, hours, rate);
            }

            System.out.print("Assign Department: ");
            String dept = input.nextLine();
            emp.assignDepartment(dept);

            employees.add(emp);
        }

        System.out.println("Employee Details");
        for (Employee e : employees) {
            e.displayDetails();
        }

        input.close();
    }
}
