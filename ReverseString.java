import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        /*System.out.println("enter any string");
        Scanner sc=new Scanner(System.in);
        String a =sc.nextLine();
        String b= "   ";
        int ptr=a.length()-1;
        while(ptr>=0){
            b=b+a.charAt(ptr);
            ptr--;
        }
        System.out.println(b);*/
        isAnagram();
    }
    class Solution {

        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) return false;
    
            int[] store = new int[26];
    
            for (int i = 0; i < s.length(); i++) {
                store[s.charAt(i) - 'a']++;
                store[t.charAt(i) - 'a']--;
            }
    
            for (int n : store) if (n != 0) return false;
    
            return true;
        }
    }
    
}
