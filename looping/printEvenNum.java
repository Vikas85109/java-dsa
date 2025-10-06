public class printEvenNum {
  public static void main(String[] args) {
    // Print all even numbers from 1 to N
    int n = 10;
    int count = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
        count++;
      }
    }
    System.out.println("count "+ count);
  }
}
