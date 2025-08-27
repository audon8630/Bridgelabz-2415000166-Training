import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks for Physics: ");
        int physics = sc.nextInt();
        System.out.print("Enter marks for Chemistry: ");
        int chemistry = sc.nextInt();
        System.out.print("Enter marks for Maths: ");
        int maths = sc.nextInt();

        double average = (physics + chemistry + maths) / 3.0;

        System.out.println("Average Marks: " + average);

        if (average >= 80) {
            System.out.println("Grade: A (Level 4, above agency-normalized standards)");
        } else if (average >= 70) {
            System.out.println("Grade: B (Level 3, at agency-normalized standards)");
        } else if (average >= 60) {
            System.out.println("Grade: C (Level 2, below, but approaching standards)");
        } else if (average >= 50) {
            System.out.println("Grade: D (Level 1, well below agency-normalized standards)");
        } else if (average >= 40) {
            System.out.println("Grade: E (Level 1-, too below agency-normalized standards)");
        } else {
            System.out.println("Grade: R (Remedial standards)");
        }
    }
}
