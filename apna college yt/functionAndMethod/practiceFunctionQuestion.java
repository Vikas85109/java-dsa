import java.util.Scanner;

public class practiceFunctionQuestion {
  public static int calculateAverage(int a, int b, int c) {
    return (a + b + c) / 3;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 3 number ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int ans = calculateAverage(a, b, c);
    System.out.println(ans);
  }
}
