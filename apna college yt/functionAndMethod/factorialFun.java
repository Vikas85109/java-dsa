import java.util.Scanner;

public class factorialFun {

  public static int calculateFact(int fact) {
    if (fact <   0) {
      return -1;
    }
    int ans = 1;
    for (int i = fact; i >= 1; i--) {
      ans = ans * i;
    }
    return ans;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number ");

    int a = sc.nextInt();

    int ans = calculateFact(a);
    System.out.println("Factorial "+ans);

  }
}
