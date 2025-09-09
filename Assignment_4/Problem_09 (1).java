import java.util.Scanner;

public class Problem_09 {
    static boolean leap(int y){return (y%4==0&&y%100!=0)||y%400==0;}
    static int daysInMonth(int m,int y){
        int[] d={31,28,31,30,31,30,31,31,30,31,30,31};
        return m==2&&leap(y)?29:d[m-1];
    }
    static int firstDay(int d,int m,int y){
        int y0=y-(14-m)/12;
        int x=y0+y0/4-y0/100+y0/400;
        int m0=m+12*((14-m)/12)-2;
        return (d+x+31*m0/12)%7;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(),y=sc.nextInt();
        String[] mon={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        System.out.println(mon[m-1]+" "+y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int fd=firstDay(1,m,y),days=daysInMonth(m,y);
        for(int i=0;i<fd;i++)System.out.print("    ");
        for(int i=1;i<=days;i++){System.out.printf("%3d ",i);if((i+fd)%7==0)System.out.println();}
    }
}
