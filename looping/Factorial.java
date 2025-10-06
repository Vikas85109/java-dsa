public class Factorial {
  public static void main(String[] args) {
    // Factorial of a number
    int n = 5;
    int factnum = 1;

    for (int i = 1; i <= n; i++) {
      factnum = factnum * i;
    }
    System.out.println(factnum);

  }
}
