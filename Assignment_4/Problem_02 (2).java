import java.util.Scanner;
public class Problem_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        

        if(end > str1.length()){
            System.out.println("It will not work Indexbounderror");
            return;
        }
        String substr = "";
        for(int i = start;i < end;i++){
            substr += str1.charAt(i);
        }
        String str2 = str1.substring(start,end);

        if(substr == str2){
            System.out.println("Both strings are equal");
        }else{
            System.out.println("Both substrings Are not equal");
        }
        
    }
}
