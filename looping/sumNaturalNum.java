public class sumNaturalNum {
  public static void main(String[] args) {
    // Sum of first N natural numbers
    int n = 5;
    int sum=0;
    for (int i = 1; i <= n; i++) {
      sum = sum + i;
    }
    System.out.println("Sum of natural num  "+ sum);
  }
}
