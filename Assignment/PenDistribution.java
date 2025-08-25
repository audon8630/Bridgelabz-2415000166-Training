public class PenDistribution {
    public static void main(String[] args) {
        int totalPens = 14;
        int students = 3;

        int pensPerStudent = totalPens / students;  // division
        int remainingPens = totalPens % students;   // modulus

        System.out.println("The Pen Per Student is " + pensPerStudent +
                           " and the remaining pen not distributed is " + remainingPens);
    }
}
