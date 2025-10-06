public class reverseNumber {
  public static void main(String[] args) {
    // Reverse a number (e.g., 123 → 321)
    int n = -123;
    int ans=0;

    while (n!=0) {
    int getLastDigit = n % 10;
      ans = ans * 10 + getLastDigit;
      n = n / 10;
    }
    System.out.println(ans);
  }
}
