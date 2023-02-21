import java.util.*;
public class cwq5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
    
        boolean isLeap = false;
        if (year % 4 == 0) {
          
              isLeap = true;
            }
          
          
        
    
        System.out.println(year+" is a leap year : "+isLeap);
      }
}
