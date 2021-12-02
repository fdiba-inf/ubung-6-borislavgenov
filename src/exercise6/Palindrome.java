package exercise6;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, d, r=0;
        boolean palindrome = false;
        int n = input.nextInt();
        m = n;
        
        while (m != 0){
          d = m % 10;
          r = r * 10 + d;
          m = m / 10;
        }

      if(r == n){
        palindrome = true;
        System.out.println("Palindrome: " + palindrome);
      }else
      System.out.println("Palindrome: " + palindrome);

    }
}
