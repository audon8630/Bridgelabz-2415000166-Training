import java.util.*;

public class ProductRatingsAnalyzer {
    public static void main(String[] args) {
        int[] oldRatings = {4, 5, 3, 4};
        ArrayList<Integer> newRatings = new ArrayList<>(Arrays.asList(5, null, 4, 3));

        ArrayList<Integer> allRatings = new ArrayList<>();
        for (int r : oldRatings) allRatings.add(r);
        allRatings.addAll(newRatings);

        double sum = 0;
        int count = 0;
        for (Integer r : allRatings) {
            if (Objects.nonNull(r)) {
                sum += r;
                count++;
            }
        }

        double average = count > 0 ? sum / count : 0;
        System.out.println("Average Rating: " + average);
    }
}
