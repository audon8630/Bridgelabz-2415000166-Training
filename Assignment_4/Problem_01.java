import java.util.Scanner;

public class Problem_01 {
    static int stringLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Built-in Length: " + str.length());
        System.out.println("Manual Length  : " + stringLength(str));
    }
}
