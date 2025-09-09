import java.util.Scanner;

public class Problem_03 {
     static char firstNonRepeat(String s){
        int[] f=new int[256];
        for(int i=0;i<s.length();i++)f[s.charAt(i)]++;
        for(int i=0;i<s.length();i++)if(f[s.charAt(i)]==1)return s.charAt(i);
        return '_';
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(firstNonRepeat(s));
    }
}
