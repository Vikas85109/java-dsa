public class factorial {

  public static void calfactorial(int n) {
    int ans = 1;

    for (int i = 1; i <= n; i++) {
      ans *= i;
    }

    System.out.println(ans);

  }

  public static void main(String[] args) {
    int n = 5;
    calfactorial(n);
  }
}