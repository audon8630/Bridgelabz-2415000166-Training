import java.util.Scanner;
public class Problem_09 {


    static String toUpperCaseManual(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String builtInUpper = text.toUpperCase();
        String manualUpper = toUpperCaseManual(text);
        boolean isSame = compareStrings(builtInUpper, manualUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Manual Uppercase : " + manualUpper);
        System.out.println("Are both same? " + isSame);
        sc.close();
    }
}
