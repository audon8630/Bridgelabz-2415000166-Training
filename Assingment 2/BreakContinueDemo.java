public class BreakContinueDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking at i = " + i);
                break;
            }
            if (i == 3) {
                System.out.println("Skipping i = " + i);
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
