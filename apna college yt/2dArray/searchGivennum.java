import java.util.Scanner;

public class searchGivennum {
  public static void main(String[] args) {
    // search given number return indices

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array size or 2d Array");
    int row = sc.nextInt();
    int col = sc.nextInt();

    int number[][] = new int[row][col];

    

    // take input
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        number[i][j] = sc.nextInt();
      }
    }



    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print(number[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println("Search number ");

    int x = sc.nextInt();

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (x == number[i][j]) {
        System.out.println(number[i][j]+" is index is => "+i+" "+j);
       }
      }
     
    }


  }
}
