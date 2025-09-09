import java.util.Arrays;
import java.util.Scanner;

public class Problem_07 {
        static boolean isPal(String s){int i=0,j=s.length()-1;while(i<j)if(s.charAt(i++)!=s.charAt(j--))return false;return true;}
    static boolean isPalRec(String s,int i,int j){if(i>=j)return true;if(s.charAt(i)!=s.charAt(j))return false;return isPalRec(s,i+1,j-1);}
    static boolean isPalArr(String s){char[] a=s.toCharArray(),r=new StringBuilder(s).reverse().toString().toCharArray();return Arrays.equals(a,r);}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(isPal(s));
        System.out.println(isPalRec(s,0,s.length()-1));
        System.out.println(isPalArr(s));
    }
}
