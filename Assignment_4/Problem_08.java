import java.util.Random;

public class Problem_08 {
    static int[] randomAges(int n){
        Random r=new Random();int[] a=new int[n];
        for(int i=0;i<n;i++)a[i]=r.nextInt(90)+10;
        return a;
    }
    static String[][] canVote(int[] a){
        String[][] res=new String[a.length][2];
        for(int i=0;i<a.length;i++){
            res[i][0]=String.valueOf(a[i]);
            res[i][1]=a[i]>=18?"true":"false";
        }
        return res;
    }
    public static void main(String[] x){
        int[] ages=randomAges(10);
        String[][] r=canVote(ages);
        for(String[] s:r)System.out.println(s[0]+" "+s[1]);
    }
}
