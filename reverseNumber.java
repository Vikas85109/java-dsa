public class reverseNumber {
  public static void main(String[] args) {
    int x = 123456;
    int ans = 0;

    while (x!=0) {
      int lg = x % 10;
      ans = ans * 10 + lg;
      x = x / 10;
    }
    System.out.println(ans);
  }
}
