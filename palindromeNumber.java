public class palindromeNumber {
  public static void main(String[] args) {
    int x = 1210;
    int ans = 0;
    int org=x;
    while (x != 0) {
      int lg = x % 10;
      ans = ans * 10 + lg;
      x = x / 10;
    }
    if (org == ans) {
      System.out.println("Yes this is a palindrome number "+ ans);
    } else {
      System.out.println("No this is not a palindrome number "+ ans);
    }
  }
}
