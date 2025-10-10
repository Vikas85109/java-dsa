import java.util.Scanner;

public class question10 {
  public static int calculateGCD(int x, int z) {
    int gcd = 1;

    int smaller = (x < z) ? x : z;

    for (int i = 1; i <= smaller; i++) {
      if(x % i==0 && z % i==0){
        gcd = i;
      }
    }

    return gcd;
  }
  public static void main(String[] args) {
    // Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two num for GCD");

    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    System.out.println("GCD is "+calculateGCD(num1,num2));
  }
}
