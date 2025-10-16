import java.util.Scanner;

public class basic2dArray {
  public static void main(String[] args) {
    //print 2d array
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Row and col ");

    int rowSize = sc.nextInt(); 
    int colSize = sc.nextInt();
    
    int[][] number = new int[rowSize][colSize];

    //input 3 * 4 size off array

    

    for (int i = 0; i <rowSize; i++) {
      for (int j = 0; j <colSize; j++) {
        number[i][j] = sc.nextInt();
      }
    }
   

    // output print
    for (int i = 0; i < rowSize; i++) {
      for (int j = 0; j < colSize; j++) {
        System.out.print(number[i][j]+" ");
      }
      System.out.println();
    }
    
  }
}
