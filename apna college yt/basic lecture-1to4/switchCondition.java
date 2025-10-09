import java.util.Scanner;

public class switchCondition {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number ");

    int btn = sc.nextInt();

    switch (btn) {
      case 1:
        System.out.println("Hello");
        break;

        case 2:
        System.out.println("Namastey");
        break;

        case 3:
        System.out.println("Pranaam");
        break;
    
      default:
        System.out.println("Invalid button");
        break;
    }


  }
}
