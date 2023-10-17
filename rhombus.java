import java.util.Scanner;

public class rhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int i,j;
        int n=sc.nextInt();
        for(i=0;i<=n;i++)
        {
            for(j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
