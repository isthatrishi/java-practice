 import java.util.Scanner;
 public class Plus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,n,mid;
        n=sc.nextInt();
        mid=n/2+1 ;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)  
            {
                if(i==mid||j==mid)
                {
                    System.out.print("+");
                }
                else
                {
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
    
}
