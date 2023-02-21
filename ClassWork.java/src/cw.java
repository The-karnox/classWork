import java.util.*;

public class cw {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water consumed in ml: ");
        int waterConsumed = input.nextInt();
    
        if (waterConsumed >= 5000) {
          System.out.println("“Yes, Alice is following doctor’s advice ");
        
        } else {
          System.out.println("No, Alice is not following doctor’s advice");
        }
      }
    
}
