import java.util.Arrays;
import java.util.Scanner;

public class Problem_05 {
     static char[] unique(String s){
        char[] r=new char[s.length()];int k=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);boolean f=false;
            for(int j=0;j<i;j++)if(s.charAt(j)==c){f=true;break;}
            if(!f)r[k++]=c;
        }
        return Arrays.copyOf(r,k);
    }
    static void freq(String s){
        int[] f=new int[256];
        for(int i=0;i<s.length();i++)f[s.charAt(i)]++;
        for(char c:unique(s))System.out.println(c+" : "+f[c]);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        freq(sc.nextLine());
    }
}
