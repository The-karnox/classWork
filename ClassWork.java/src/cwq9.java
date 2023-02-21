import java.util.*;

public class cwq9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter value of c: ");
        int c = sc.nextInt();
        int largest = a;
        int secondLargest = a;
        if (b > largest) {
            secondLargest = largest;
            largest = b;
        } else if (b > secondLargest) {
            secondLargest = b;
        }
        if (c > largest) {
            secondLargest = largest;
            largest = c;
        } else if (c > secondLargest) {
            secondLargest = c;
        }
        System.out.println("Largest: " + largest);
        System.out.println("Second largest: " + secondLargest);
    }
}
