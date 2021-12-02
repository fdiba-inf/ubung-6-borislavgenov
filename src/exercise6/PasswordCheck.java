package exercise6;
import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String realpass = "belot123";
      String password;
 
    boolean passvalid = false;
    do{
      System.out.println("Password: ");
      password = input.nextLine();

          if(password.length() < 8){
            continue;
          }
          boolean allLettersorDigits = true;
          int digitcount = 0;
          for (int index = 0; index<password.length(); index++){
            char symbol = password.charAt(index);
            boolean letterordigit = Character.isLetterOrDigit(symbol);
            if(!letterordigit){
              allLettersorDigits = false;
              break;
            }
            boolean digit = Character.isDigit(symbol);
            if(digit){
              digitcount++;
            }
          }

        if (allLettersorDigits && digitcount >= 2){
          passvalid = true;
        }


    }while (!passvalid);

System.out.println("Password valid!");
    }
}