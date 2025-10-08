public class plusoneLeetcode {
  public static void main(String[] args) {
    int[] digits = { 1, 2, 5, };

    int[] result = plusOne(digits);

    for (int num : result) {
      System.out.print(num + " ");
    }

  }
  
  public static int[] plusOne(int[] digits) {
    for (int i = digits.length - 1; i >= 0; i++) {
      if (digits[i] == 9) {
        digits[i]=0;
        
      } else {
        digits[i]++;
        return digits;
      }
      
    }
    digits=new int[digits.length+1];
  }
}

