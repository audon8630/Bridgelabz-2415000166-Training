import java.util.Arrays;
import java.util.Scanner;

public class Problem_08 {
    static boolean isAnagram(String a,String b){
        if(a.length()!=b.length())return false;
        int[] f1=new int[256],f2=new int[256];
        for(char c:a.toCharArray())f1[c]++;
        for(char c:b.toCharArray())f2[c]++;
        return Arrays.equals(f1,f2);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(isAnagram(sc.nextLine(),sc.nextLine()));
    }
}
