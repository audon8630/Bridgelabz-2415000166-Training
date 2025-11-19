public class WrapperComparison {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;

        System.out.println("a == b : " + (a == b));
        System.out.println("c == d : " + (c == d));
        System.out.println("a.equals(b) : " + a.equals(b));

        System.out.println("\nExplanation:");
        System.out.println("For values between -128 to 127, Java caches Integer objects.");
        System.out.println("So 'a' and 'b' point to the same object, but 'c' and 'd' do not.");
    }
}
