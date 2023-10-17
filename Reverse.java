import java.util.Scanner;

public class Reverse {
    public static void main (String[]args){
        System.out.println("enter any number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
           int reverse=n%10;
           System.out.print(reverse);
           n=n/10;

        }
        System.out.println();
    }
    
}
