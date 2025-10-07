import java.util.Scanner;

public class printNaturalNum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number");

    int a = sc.nextInt();

    int n = 1;
    int sum = 0;

    while (n <= a) {
    sum += n;
    n++;
    }

    for (int i = 1; i <= a; i++) {
      sum = sum + i;
      
    }

    System.out.println(sum);

  }
}
