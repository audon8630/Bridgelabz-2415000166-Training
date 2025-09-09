import java.util.Scanner;

public class Problem_10 {
    static String toLowerCaseManual(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32);
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
        String builtInLower = text.toLowerCase();
        String manualLower = toLowerCaseManual(text);
        boolean isSame = compareStrings(builtInLower, manualLower);
        System.out.println("Built-in Lowercase: " + builtInLower);
        System.out.println("Manual Lowercase : " + manualLower);
        System.out.println("Are both same? " + isSame);
        sc.close();
    }
}


