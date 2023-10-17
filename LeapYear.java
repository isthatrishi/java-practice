import java.util.Scanner;

public class LeapYear {


    static void vowelsconsonant(char ch){ 
        if(ch=='A'|| ch=='E'|| ch=='I'||ch=='O' || ch=='U'){
            System.out.println("vowel:");
        }
        else if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("vowel");
        }
        else{
            System.out.println("consonant");
        }


    }
    static void leapYear(int n){
  if(n%4==0){
            System.out.println("it is a leap year");
        }
        else if(n%400==0){
            System.out.println("this is a leap year");
        }else{
            System.out.println("this is not leap year : ");
        }
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
       /*  System.out.println("enter a year");
        int n=in.nextInt();
        leapYear(n);*/
      System.out.println("enter an alphabet");
      char ch =in.next().charAt(0);
      vowelsconsonant(ch);
    }
}
