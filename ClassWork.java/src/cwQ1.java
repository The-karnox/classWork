import java .util.*;
public class cwQ1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
    
        if (age >= 18) {
          System.out.println("You are eligible to cast your vote");
        } else {
          System.out.println("You are not eligible to cast your vote");
        }
      }
}
