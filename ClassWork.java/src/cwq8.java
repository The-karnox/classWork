import java.util.*;

public class cwq8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the x coordinate: ");
    double x = sc.nextDouble();
    System.out.print("Enter the y coordinate: ");
    double y = sc.nextDouble();
    

    if (x == 0 && y == 0) {
      System.out.println("The point lies on the origin.");
    } else if (x == 0) {
      System.out.println("The point lies on the y-axis.");
    } else if (y == 0) {
      System.out.println("The point lies on the x-axis.");
    } else if (x > 0 && y > 0) {
      System.out.println("The point lies in the first quadrant.");
    } else if (x < 0 && y > 0) {
      System.out.println("The point lies in the second quadrant.");
    } else if (x < 0 && y < 0) {
      System.out.println("The point lies in the third quadrant.");
    } else {
      System.out.println("The point lies in the fourth quadrant.");
    }
  }
}
