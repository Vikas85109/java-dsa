public class printNumber1to5 {

  public static void printNumRec(int n) {
    if (n == 6) {
      return;
    }
    System.out.print(n + " ");
    printNumRec(n + 1);
  }

  public static void main(String[] args) {
    int n = 1;
    printNumRec(n);
  }
}
