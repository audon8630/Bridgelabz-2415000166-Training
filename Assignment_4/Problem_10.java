import java.util.Scanner;

public class Problem_10 {
    static String[] initDeck(){
        String[] s={"Hearts","Diamonds","Clubs","Spades"};
        String[] r={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] d=new String[s.length*r.length];int k=0;
        for(String x:r)for(String y:s)d[k++]=x+" of "+y;
        return d;
    }
    static void shuffle(String[] d){
        for(int i=0;i<d.length;i++){
            int j=i+(int)(Math.random()*(d.length-i));
            String t=d[i];d[i]=d[j];d[j]=t;
        }
    }
    static void distribute(String[] d,int n,int p){
        if(n<p){System.out.println("Not enough cards");return;}
        int idx=0;
        for(int i=0;i<p;i++){
            System.out.print("Player"+(i+1)+": ");
            for(int j=0;j<n/p;j++)System.out.print(d[idx++]+" | ");
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),p=sc.nextInt();
        String[] deck=initDeck();shuffle(deck);distribute(deck,n,p);
    }
}
