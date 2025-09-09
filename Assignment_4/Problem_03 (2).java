import java.util.Scanner;

public class Problem_03 {
    static int strLen(String s){int c=0;try{while(true){s.charAt(c);c++;}}catch(Exception e){}return c;}
    static String[] split(String s){
        int n=strLen(s),c=1;for(int i=0;i<n;i++)if(s.charAt(i)==' ')c++;
        String[] w=new String[c];int k=0,st=0;
        for(int i=0;i<=n;i++){if(i==n||s.charAt(i)==' '){w[k++]=s.substring(st,i);st=i+1;}}
        return w;
    }
    static String[][] withLen(String[] w){
        String[][] r=new String[w.length][2];
        for(int i=0;i<w.length;i++){r[i][0]=w[i];r[i][1]=String.valueOf(strLen(w[i]));}
        return r;
    }
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        String[] words=split(sc.nextLine());
        String[][] res=withLen(words);
        for(String[] x:res)System.out.println(x[0]+" "+Integer.parseInt(x[1]));
    }
}
