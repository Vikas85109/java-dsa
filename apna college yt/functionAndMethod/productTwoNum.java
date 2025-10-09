import java.util.Scanner;

public class productTwoNum {
  public static int calculateMultiply(int m, int n) {
    int mul = m * n;
    return mul;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Two number ");
    int a = sc.nextInt();
    int b = sc.nextInt();

    int mul = calculateMultiply(a, b);
    System.out.println("Product two num "+ mul);
  }
}
