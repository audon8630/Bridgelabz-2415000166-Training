import java.util.*;

public class AttendanceTracker {
    public static void main(String[] args) {

        String[] students = {"Krish", "Amit", "Riya", "Samar", "Neha"};
        HashMap<String, Integer> attendance = new HashMap<>();

        for (String s : students) {
            attendance.put(s, 0);
        }

        String[][] presentList = {
                {"Krish", "Amit", "Neha"},
                {"Krish", "Riya"},
                {"Amit", "Samar"},
                {"Krish", "Amit", "Riya"},
                {"Riya", "Neha"},
                {"Krish"},
                {"Amit", "Samar"},
                {"Neha"},
                {"Krish", "Neha"},
                {"Amit"},
                {"Riya", "Neha"},
                {"Samar"},
                {"Amit", "Krish"},
                {"Neha"},
                {"Riya"}
        };

        for (String[] day : presentList) {
            for (String name : day) {
                attendance.put(name, attendance.get(name) + 1);
            }
        }

        System.out.println("Students with less than 10 days attendance:");
        for (String s : attendance.keySet()) {
            if (attendance.get(s) < 10) {
                System.out.println(s + " -> " + attendance.get(s));
            }
        }
    }
}
