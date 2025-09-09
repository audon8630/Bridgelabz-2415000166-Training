import java.util.Arrays;
import java.util.Scanner;

public class Problem_02 {
        static int stringLength(String s) {
        int c=0; try { while(true){ s.charAt(c); c++; } } catch(Exception e){} return c;
    }
    static String[] splitManual(String s) {
        int n=stringLength(s), count=1;
        for(int i=0;i<n;i++) if(s.charAt(i)==' ') count++;
        String[] words=new String[count];
        int idx=0,start=0;
        for(int i=0;i<=n;i++){
            if(i==n || s.charAt(i)==' '){
                words[idx++]=s.substring(start,i);
                start=i+1;
            }
        }
        return words;
    }
    static boolean compare(String[] a,String[] b){
        if(a.length!=b.length) return false;
        for(int i=0;i<a.length;i++) if(!a[i].equals(b[i])) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String[] builtIn=text.split(" ");
        String[] manual=splitManual(text);
        System.out.println("Built-in: "+Arrays.toString(builtIn));
        System.out.println("Manual  : "+Arrays.toString(manual));
        System.out.println("Same? "+compare(builtIn,manual));
    }
}