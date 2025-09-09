import java.util.Scanner;

public class Problem_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int vowel_count = 0;
        int Consonant_vcount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                ch = Character.toLowerCase(ch);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println("it' a vowel:"+ch);
                    vowel_count += 1;

                } else if(ch >= 'a' && ch <= 'z') {
                    System.out.println("It's a Consonant:"+ch);
                    Consonant_vcount += 1;
                }else{
                    System.out.println("Not a Letter");
                }
            }
        }
        System.out.println("The count of vowels is:"+vowel_count);
        System.out.println("The count of Consonants is:"+Consonant_vcount);
    }
}
