// Enter 3 numbers from the user & make a function to print their average.

import java.util.Scanner;

public class question01 {

  public static int calculateAvg(int x, int y, int z) {
    int sum = (x+y+z) / 3;
    return sum;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter three number ");

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    System.out.println("Average of 3 number is "+calculateAvg(a,b,c));
  }
}