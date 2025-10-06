public class printOddNum {
  public static void main(String[] args) {
    // Print all odd numbers from 1 to N
    int n = 20;
    int count = 0;
    for (int i = 0; i <= n; i++) {
      if (i % 2 != 0) {
        System.out.println(i);
        count++;
      }
    }
    System.out.println("count "+ count);
  }
}
