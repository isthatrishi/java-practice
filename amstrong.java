import java.util.Scanner;
public class amstrong { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m,x=0,r;
        n=sc.nextInt();
        m=n;
        while(n>0)
        {
            r=n%10;
            x=x+(r*r*r);
            n=n/10;
        }
        if(x==m)
        {
            System.out.print("Amstrong");
        }
        else
        {
            System.out.print("not");
        }
    }   
}
