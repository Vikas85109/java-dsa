import java.util.Scanner;

public class searchArray {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Number ");
      
    int size = sc.nextInt();
    int[] arraySize = new int[size];
    
    for (int i = 0; i < arraySize.length; i++) {
      arraySize[i] = sc.nextInt();
    }

    System.out.print("Enter Search number ");

    int searchNum = sc.nextInt();
    

    for (int i = 0; i < arraySize.length; i++) {
      System.out.println("Array index " + i + " " + arraySize[i]);
    }
    
    for (int i = 0; i < arraySize.length; i++) {
      if (searchNum == arraySize[i]) {
        System.out.println("Index "+i);
      }
    }


  }
}