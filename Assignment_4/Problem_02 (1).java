import java.util.Scanner;

public class Problem_02 {
    static double bmi(double w,double h){h/=100;return w/(h*h);}
    static String status(double b){return b<18.5?"Underweight":b<25?"Normal":b<30?"Overweight":"Obese";}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[][] arr=new double[10][2];
        for(int i=0;i<10;i++){arr[i][0]=sc.nextDouble();arr[i][1]=sc.nextDouble();}
        System.out.println("Weight  Height  BMI     Status");
        for(int i=0;i<10;i++){
            double b=bmi(arr[i][0],arr[i][1]);
            System.out.printf("%.1f   %.1f   %.2f   %s\n",arr[i][0],arr[i][1],b,status(b));
        }
    }
}
