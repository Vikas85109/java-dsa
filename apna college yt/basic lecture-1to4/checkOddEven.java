import java.util.Scanner;

public class checkOddEven {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number ");

    int b = sc.nextInt();

    if (b % 2 == 0) {
      System.out.println(b +" is a Even Number");
    } else {
      System.out.println(b + " is a Odd Number");
    }

  }
}
