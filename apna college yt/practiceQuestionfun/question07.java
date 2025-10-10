import java.util.Scanner;

public class question07 {
  public static void main(String[] args) {
    // Write a program to enter the numbers till the user wants
    // and at the end it should display the count of positive, negative and zeros
    // entered.

    Scanner sc = new Scanner(System.in);

    int positiveCount = 0;
    int negativeCount = 0;
    int zeroCount = 0;
    char choice;

    do {
      System.out.print("Enter a number: ");
      int num = sc.nextInt();

      if (num > 0) {
        positiveCount++;
      } else if (num < 0) {
        negativeCount++;
      } else {
        zeroCount++;
      }

      System.out.print("Do you want to enter another number? (y/n): ");
      choice = sc.next().charAt(0);

    } while (choice == 'y' || choice == 'Y');

    System.out.println("\n--- Result ---");
    System.out.println("Count of Positive numbers: " + positiveCount);
    System.out.println("Count of Negative numbers: " + negativeCount);
    System.out.println("Count of Zeros: " + zeroCount);

    sc.close();
  }
}
