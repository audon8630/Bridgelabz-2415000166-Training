import java.util.ArrayList;

public class AutoBoxingUnboxing {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list.add(i * 5); // auto-boxing
        }

        int sum = 0;
        for (int n : list) { // auto-unboxing
            sum += n;
        }

        System.out.println("Sum of numbers = " + sum);
    }
}
