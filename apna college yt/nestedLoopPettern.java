public class nestedLoopPettern {
  public static void main(String[] args) {
    // print solid star like rectangle

    int n=4;
    int m = 5;

    // outterloop
    for (int i = 1; i <= n; i++) {

      // inneloop
      for (int j = 1; j <= m; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }
}
