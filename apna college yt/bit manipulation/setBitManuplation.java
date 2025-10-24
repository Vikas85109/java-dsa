public class setBitManuplation {
  
  public static void main(String[] args) {
    int n = 5;
    int pos=2;
    int bitMask = 1 << pos;

    int ans = 0;

    if ((bitMask | n) == 0) {
      ans = bitMask | n;
      System.out.println("Bit was zero "+ans);
    } else {
      ans = bitMask | n;
      System.out.println("Bit was non zero "+ans);
      
    }
  }
}
