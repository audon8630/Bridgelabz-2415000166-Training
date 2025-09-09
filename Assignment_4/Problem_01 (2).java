import java.util.Scanner;

public class Problem_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first String");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string");
        String str2 = sc.nextLine();

        boolean same = (str1.length() == str2.length());
        if(same){
            for(int i=0;i< str1.length();i++){
                if(str1.charAt(i) != str2.charAt(i)){
                    same = false;
                    break;
                }
            }
        }
        System.out.println("Using charAt(): "+same);
        System.out.println("Using equals(): "+ str1.equals(str2));
        

    }
}