import java.util.Scanner;

public class Prime {
    static void even_odd(int n){
        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0){
                System.out.println("Even number :  " + i);
            }else{
                System.out.println("odd number : " + i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a range number : ");
        int n = sc.nextInt();
        even_odd(n);

    }
    
}
