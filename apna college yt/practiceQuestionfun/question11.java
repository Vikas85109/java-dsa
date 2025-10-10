import java.util.Scanner;

public class question11 {
  public static void printFibonacci(int n) {
    int a = 0;
    int b = 1;
    for (int i = 1; i <= n; i++) {
      System.out.println(a+" "+i);
      int c = a + b;
      a = b;
      b = c;
    }
  }

  public static void main(String[] args) {
    // Write a program to print Fibonacci series of n terms where n is input by user
    // :
    // 0 1 1 2 3 5 8 13 21 .....

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number ");
    int n = sc.nextInt();

    printFibonacci(n);

  }
}
