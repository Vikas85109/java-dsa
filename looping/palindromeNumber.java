public class palindromeNumber {
  public static void main(String[] args) {
    // Check if a number is a palindrome
    int n = 121;
    int reverseNum = 0;
    int org = n;

    while (n != 0) {
      int rem = n % 10;
      reverseNum = reverseNum * 10 + rem;
      n = n / 10;
    }
    if (org == reverseNum) {
      System.out.println(true);
    } else {
      System.out.println(false);
    }
  }
}
