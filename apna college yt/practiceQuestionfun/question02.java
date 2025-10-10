// Write a function to print the sum of all odd numbers from 1 to n.

import java.util.Scanner;

public class question02 {

  public static int calculateSumOfOdd(int n) {
    int ans = 0;

    for (int i = 1; i <= n; i++) {
      if (i % 2 != 0) {
        ans = ans + i;
      }
    }

    return ans;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int n = sc.nextInt();

    int ans = calculateSumOfOdd(n);
    System.out.println("Sum of all odd num "+ans);
  }
}
