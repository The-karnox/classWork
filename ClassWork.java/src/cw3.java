import java.util.*;

public class cw3 {
   public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.print("enter first number:");
  int num1 = input.nextInt();
    System.out.print("Enter second number: ");
    int num2 = input.nextInt();
    System.out.print("Enter third number: ");
    int num3 = input.nextInt();

    if (num1 < num2 && num2 < num3) {
      System.out.println("Increasing");
    } else if (num1 > num2 && num2 > num3) {
      System.out.println("Decreasing");
    } else {
      System.out.println("Neither increasing nor decreasing order");
    }

  }
}
