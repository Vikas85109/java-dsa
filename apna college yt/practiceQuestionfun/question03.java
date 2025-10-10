import java.util.Scanner;

public class question03 {
  // Write a function which takes in 2 numbers and returns the greater of those two.

  public static void isCheckGreater(int x, int z) {
    if (x > z) {
      System.out.println("Greater num "+x );
    } else {
      System.out.println("Greater num " + z);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two num ");
    int a = sc.nextInt();
    int b = sc.nextInt();

    isCheckGreater(a, b);
  }
}
