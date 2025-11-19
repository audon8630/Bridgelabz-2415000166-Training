package org.example;

import org.example.db.DatabaseManager;
import org.example.model.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DatabaseManager db = new DatabaseManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Student Result Management ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Marks");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> {
                    System.out.print("Name: ");
                    String n = sc.next();
                    System.out.print("Course: ");
                    String c = sc.next();
                    System.out.print("Marks: ");
                    int m = sc.nextInt();
                    db.addStudent(new Student(n, c, m));
                }

                case 2 -> db.getAllStudents().forEach(s ->
                        System.out.println(s.getId() + " | " + s.getName() + " | " + s.getCourse() + " | " + s.getMarks()));

                case 3 -> {
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    System.out.print("New Marks: ");
                    int marks = sc.nextInt();
                    db.updateMarks(id, marks);
                }

                case 4 -> {
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    db.deleteStudent(id);
                }

                case 5 -> System.exit(0);

                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
