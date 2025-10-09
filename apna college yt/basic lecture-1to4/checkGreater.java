import java.util.Scanner;

public class checkGreater {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two number");
    int a = sc.nextInt();
    int b = sc.nextInt();

    if (a > b) {
      System.out.println(a+" is greater than");
    } else if (a < b) {
      System.out.println(b + " is greater than");
    } else {
      System.out.println("a and b are equal");
    }

  }
}
