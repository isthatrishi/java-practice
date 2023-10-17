import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class sumofnatural {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        int i=1;
        while( i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println("sum is"+sum);

    }
    
}
