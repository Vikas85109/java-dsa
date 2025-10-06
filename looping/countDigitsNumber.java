public class countDigitsNumber {
  public static void main(String[] args) {
    // Count digits in a number
    int n = 74589887;
    int count = 0;
    while (n != 0) {
      n=n/10;
      count++;
    }
    System.out.println("Count digit is "+count);
  }
}
