public class sumFirstEvenAndOddNum {
  public static void main(String[] args) {
    // Sum of first N even/odd numbers
    int n = 5;
    int sumEvenNum = 0;
    int sumOddNum = 0;

    for (int i = 1; i <= n; i++) {
      int evenNum = i * 2;
      sumEvenNum = sumEvenNum + evenNum;
      int oddNum = 2 * i - 1;
      sumOddNum = sumOddNum + oddNum;
    }

    System.out.println("Sum of Even: " + sumEvenNum + ", Sum of Odd: " + sumOddNum);
    
    
  }
}
