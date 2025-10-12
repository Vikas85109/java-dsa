import java.util.Scanner;

public class maxAndMin {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number ");
  
    int sizeOfArray = sc.nextInt();
    int[] arrayData = new int[sizeOfArray];

    for (int i = 0; i < sizeOfArray; i++) {
      arrayData[i] = sc.nextInt();
    }

    int max=arrayData[0];
    int min=arrayData[0];
    

    for (int i = 0; i < arrayData.length; i++) {
      System.out.println("Array index => "+i+" "+arrayData[i]);
    }

    for (int i = 0; i < arrayData.length; i++) {
      if (max < arrayData[i]) {
        max = arrayData[i];
      }
      if (min > arrayData[i]) {
        min = arrayData[i];
      }
    }

    System.out.println("Max=> "+max);
    System.out.println("Min=> " + min);
  }
}
