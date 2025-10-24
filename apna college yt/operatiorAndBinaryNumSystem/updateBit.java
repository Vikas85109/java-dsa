import java.util.Scanner;

public class updateBit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int posP = sc.nextInt();
    
    int n = 5;
    int pos = 1;

    int bitMask = 1 << pos;
    if (posP == 1) {
      int number = bitMask | n;
      System.out.println(number);
    } else {
      int newNumber = ~(bitMask);
      int ans = newNumber & n;
      System.out.println(ans);
    }
  }
}
