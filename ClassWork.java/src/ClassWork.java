import java.util.*;


public class ClassWork {
  
    public static void main (String []args)
 {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter gender (M/F): ");
      char gender = input.next().charAt(0);
      System.out.print("Enter first name: ");
      String firstName = input.next();
      System.out.print("Enter last name: ");
      String lastName = input.next();
      System.out.print("Enter age: ");
      int age = input.nextInt();

      if (gender == 'F') {
        if (age >= 20) {
          System.out.print("Are you married, " + firstName + " (yes or no)? ");
          String married = input.next();
          if (married.equals("yes")) {
            System.out.println("Mrs. " + lastName); 
          } else {
            System.out.println("Ms. " + lastName);
          }
        } else {
          System.out.println(firstName + " " + lastName);
        }
      } else {
        if (age >= 20) {
          System.out.println("Mr. " + lastName);
        } else {
          System.out.println(firstName + " " + lastName);
        }
      }
    }
   
}
}
    
    