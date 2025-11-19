import java.util.*;

public class StudentGrades {
    public static void main(String[] args) {

        TreeMap<String, Double> grades = new TreeMap<>();

        grades.put("Krish", 85.0);
        grades.put("Amit", 90.0);
        grades.put("Riya", 78.5);

        grades.put("Krish", 92.0); // update

        grades.remove("Riya"); // remove

        for (String name : grades.keySet()) {
            System.out.println(name + ": " + grades.get(name));
        }
    }
}
