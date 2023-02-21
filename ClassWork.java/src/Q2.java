import java.util.*;


public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
    
        if (number % 5 == 0 && number % 6 == 0) {
          System.out.println(number + " is divisible by both 5 and 6.");
        } else if (number % 5 == 0 || number % 6 == 0) {
          System.out.println(number + " is divisible by either 5 or 6, not both.");
        } else {
          System.out.println(number + " is not divisible by either 5 or 6.");
        }
      }
    
}
