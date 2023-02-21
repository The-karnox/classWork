import java.util.*;

public class cwq6and7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");
        int units = sc.nextInt();
        double billAmount = 0;

        if (units <= 50) {
            billAmount = units * 3;
        } else if (units > 50 && units <= 200) {
            billAmount = 50 * 3 + (units - 50) * 4.80;
        } else if (units > 200 && units <= 400) {
            billAmount = 50 * 3 + 150 * 4.80 + (units - 200) * 5.80;
        } else {
            billAmount = 50 * 3 + 150 * 4.80 + 200 * 5.80 + (units - 400) * 6.20;
        }

        System.out.println("Your electricity bill amount is: Rs." + billAmount);
        System.out.print("Do you want to pay the bill online (y/n)? ");
        String paymentMethod = sc.next();

        if (paymentMethod.equalsIgnoreCase("y")) {
            billAmount = billAmount - (billAmount * 3) / 100;
            System.out.println("Your electricity bill amount after discount (3%) is: Rs." + billAmount);
        } else {
            System.out.println("You have chosen to pay the bill offline.");
        }
    }
}
