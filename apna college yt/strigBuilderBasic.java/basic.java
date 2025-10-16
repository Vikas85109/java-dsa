public class basic {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Tony");

    // sb.setCharAt(1, 'n');
    
    sb.insert(2, 'n');
// tonny
    sb.delete(2, 4);

    System.out.println(sb);


  }
}