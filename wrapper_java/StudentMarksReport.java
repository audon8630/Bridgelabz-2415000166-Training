import java.util.*;

public class StudentMarksReport {
    public static void main(String[] args) {
        Object[] marks = {"85", 95, Integer.valueOf(88), "null", "abc", 76};

        ArrayList<Integer> validMarks = new ArrayList<>();

        for (Object m : marks) {
            try {
                if (m instanceof String) {
                    String str = (String) m;
                    if (!str.equalsIgnoreCase("null"))
                        validMarks.add(Integer.parseInt(str));
                } else if (m instanceof Integer) {
                    validMarks.add((Integer) m);
                }
            } catch (Exception e) {
            }
        }

        double sum = 0;
        for (int mark : validMarks) sum += mark;

        double avg = validMarks.isEmpty() ? 0 : sum / validMarks.size();
        System.out.println("Average Marks: " + avg);
    }
}
