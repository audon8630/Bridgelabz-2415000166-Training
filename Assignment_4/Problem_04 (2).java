import java.util.Scanner;

public class Problem_04 {
       static int strLen(String s){int c=0;try{while(true){s.charAt(c);c++;}}catch(Exception e){}return c;}
    static String[] split(String s){
        int n=strLen(s),c=1;for(int i=0;i<n;i++)if(s.charAt(i)==' ')c++;
        String[] w=new String[c];int k=0,st=0;
        for(int i=0;i<=n;i++){if(i==n||s.charAt(i)==' '){w[k++]=s.substring(st,i);st=i+1;}}
        return w;
    }
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        String[] w=split(sc.nextLine());
        String min=w[0],max=w[0];
        for(String s:w){if(strLen(s)<strLen(min))min=s;if(strLen(s)>strLen(max))max=s;}
        System.out.println("Shortest: "+min+" Longest: "+max);
    }
}
