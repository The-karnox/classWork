import java.util.Scanner;

public class Q4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter today's day: ");
    int today = input.nextInt();

    System.out.print("Enter the number of days elapsed since today: ");
    int daysElapsed = input.nextInt();

    int futureDay = (today + daysElapsed) % 7;

    switch (today) {
      case 0:
        System.out.print("Today is Sunday");
        break;
      case 1:
        System.out.print("Today is Monday");
        break;
      case 2:
        System.out.print("Today is Tuesday");
        break;
      case 3:
        System.out.print("Today is Wednesday");
        break;
      case 4:
        System.out.print("Today is Thursday");
        break;
      case 5:
        System.out.print("Today is Friday");
        break;
      case 6:
        System.out.print("Today is Saturday");
        break;
    }

    switch (futureDay) {
      case 0:
        System.out.println(" and the future day is Sunday");
        break;
      case 1:
        System.out.println(" and the future day is Monday");
        break;
      case 2:
        System.out.println(" and the future day is Tuesday");
        break;
      case 3:
        System.out.println(" and the future day is Wednesday");
        break;
      case 4:
        System.out.println(" and the future day is Thursday");
        break;
      case 5:
        System.out.println(" and the future day is Friday");
        break;
      case 6:
        System.out.println(" and the future day is Saturday");
        break;
    }
  }
}

