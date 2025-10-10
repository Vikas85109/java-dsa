import java.util.Scanner;

public class question08 {

  public static int calculatePow(int z, int y) {
    int ans = 1;

    for (int i = 1; i <= y; i++) {
      ans = ans * z;
    }
    return ans;
  }

  public static void main(String[] args) {
    // Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two num ");
    int x = sc.nextInt();
    int y = sc.nextInt();

    System.out.println("Power of "+x +" and "+y+" is equal to "+calculatePow(x,y));

  }
}