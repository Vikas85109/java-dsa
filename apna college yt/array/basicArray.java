import java.util.Scanner;

public class basicArray {

  public static void main(String[] args) {
    // int[] subject = new int[4];
    // subject[0] = 1;
    // subject[2] = 4;
    // subject[3] = 15;

    // System.out.println(1+" "+subject[0]);
    // System.out.println(2 + " " +subject[1]);
    // System.out.println(3 + " " +subject[2]);
    // System.out.println(4 + " " + subject[3]);

    //defination 2 array define

    // int arryNum[] = { 87, 26, 65, 564, 106 };

    // for (int i = 0; i < arryNum.length; i++) {
    //   System.out.println(i+" => "+arryNum[i]);
    // }

    // input from user

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number ");
    int size = sc.nextInt();

    int[] arryData = new int[size];
    
    for (int i = 0; i < size; i++) {
      arryData[i] = sc.nextInt();
    }
    for (int i = 0; i < arryData.length; i++) {
      System.out.println("Result "+arryData[i]);
    }


  }
}