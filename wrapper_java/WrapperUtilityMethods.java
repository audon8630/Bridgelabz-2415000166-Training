public class WrapperUtilityMethods {
    public static void main(String[] args) {
        int n = Integer.parseInt("123");
        double d = Double.parseDouble("3.14");
        boolean b = Boolean.parseBoolean("true");
        String bin = Integer.toBinaryString(10);
        boolean isDigit = Character.isDigit('5');
        char upper = Character.toUpperCase('a');

        System.out.println("Integer.parseInt(\"123\") = " + n);
        System.out.println("Double.parseDouble(\"3.14\") = " + d);
        System.out.println("Boolean.parseBoolean(\"true\") = " + b);
        System.out.println("Integer.toBinaryString(10) = " + bin);
        System.out.println("Character.isDigit('5') = " + isDigit);
        System.out.println("Character.toUpperCase('a') = " + upper);
    }
}
