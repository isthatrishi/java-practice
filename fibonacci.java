import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int c ; 
        int n = in.nextInt();
        System.out.println(a);
        System.out.println(b);
        
        for(int i = 2 ; i < n; i++){
              
              c = a + b;
              System.out.println(c);
              a=b;
              a=c;
        }
        
    }
    
}
