public class prodsumdiff {
  public static void main(String[] args) {
    int n = 234;
    int sum = 0;
    int prod = 1;

    while (n != 0) {
      int lg = n % 10;
      sum = sum + lg;
      prod = prod * lg;
      n = n / 10;

    }
    System.out.println(prod-sum);
  }
}
