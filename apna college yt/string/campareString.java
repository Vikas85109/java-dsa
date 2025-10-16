public class campareString {
  public static void main(String[] args) {
    String name1 = "Vikas";
    String name2 = "Vikas";

    // if (name1.compareTo(name2) == 0) {
    //   System.out.println("String are equal");
    // } else {
    //   System.out.println("String are not equal");
    // }
    if (name1==name2) {
      System.out.println("String are equal");
    } else {
      System.out.println("String are not equal");
    }
    if (new String("Vikas")==new String("Vikas")) {
      System.out.println("String are equal");
    } else {
      System.out.println("String are not equal");
    }
  }
}
