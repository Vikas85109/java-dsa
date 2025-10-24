public class basicNumber {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("vikas");

    int a = 10;
    int b = 0;

    b = a++;

    for (int i = 0; i < sb.length() / 2; i++) {
      int firstIndex = i;
      int lastIndex = sb.length() - 1 - i;

      char firstChar = sb.charAt(firstIndex);
      char lastChar = sb.charAt(lastIndex);

      sb.setCharAt(lastIndex, firstChar);
      sb.setCharAt(firstIndex, lastChar);

    }
    
    System.out.println(sb);
    
  }
}
