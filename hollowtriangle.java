import java.util.Scanner;

public class hollowtriangle { class hollow{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        for(i=0;i<=n;i++){
            {
                for(j=n;j>=i
                 ;j--)
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
}
}
}