import java.util.Scanner;

public class checkSortedArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number ");
    int size = sc.nextInt();
    int[] array = new int[size];
    // int[] array = {10,20,30};

    for (int i = 0; i < array.length; i++) {
      array[i] = sc.nextInt();
    }

    boolean isSortted = true;

    for (int i = 0; i < array.length-1; i++) {
      if (array[i] > array[i + 1]) {
        isSortted = false;
        break;
      }
    }

    if (isSortted) {
      System.out.println("Array is Accesending");
    } else {
      System.out.println("Array is not Accesending");
    }

  }
}
