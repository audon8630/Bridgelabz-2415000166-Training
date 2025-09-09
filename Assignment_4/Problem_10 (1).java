import java.util.Arrays;
import java.util.Random;

public class Problem_10 {
      static int[][] scores(int n){
        Random r=new Random();int[][] m=new int[n][3];
        for(int i=0;i<n;i++)for(int j=0;j<3;j++)m[i][j]=r.nextInt(41)+60;
        return m;
    }
    static String grade(double p){
        if(p>=90)return "A";
        if(p>=75)return "B";
        if(p>=60)return "C";
        if(p>=40)return "D";
        return "F";
    }
    public static void main(String[] a){
        int[][] s=scores(5);
        for(int i=0;i<s.length;i++){
            int t=s[i][0]+s[i][1]+s[i][2];
            double p=Math.round((t/3.0)*100.0/100.0);
            System.out.println(Arrays.toString(s[i])+" Total="+t+" %="+p+" Grade="+grade(p));
        }
    }
}
