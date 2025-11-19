public class SafeParseInt {
    public static int safeParseInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static void main(String[] args) {
        String[] inputs = {"123", "abc", "45.6", "0"};
        for (String s : inputs) {
            System.out.println("Input: " + s + " → Output: " + safeParseInt(s));
        }
    }
}
