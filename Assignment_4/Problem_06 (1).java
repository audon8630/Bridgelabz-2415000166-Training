import java.util.Scanner;

public class Problem_06 {
    static String type(char c){
        if(c>='A'&&c<='Z')c=(char)(c+32);
        if(c>='a'&&c<='z')return "aeiou".indexOf(c)>=0?"Vowel":"Consonant";
        return "Not a Letter";
    }
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
            System.out.println(s.charAt(i)+" -> "+type(s.charAt(i)));
    }
}
