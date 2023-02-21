import java.util.*;
public class cwQ4 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Random random = new Random();
      int computerGuess = random.nextInt(9) + 1;
      System.out.print("Enter your guess (1-9): ");
      int userGuess = input.nextInt();
      System.out.println("computer guess was "+computerGuess);
  
      if (userGuess == computerGuess) {
        System.out.println("You got it right");
      } else if (Math.abs(userGuess - computerGuess) == 1) {
        System.out.println("Almost got it");
      } else {
        System.out.println("You got it wrong");
      }
    }
  }