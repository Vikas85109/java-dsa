import java.util.Scanner;

public class basicString {

  public static void main(String[] args) {
    String name = "Vikas Sharma";

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter Name ");

    // String firstName = sc.nextLine();
    // String lastName = sc.nextLine();

    // String fullName = firstName + lastName;
    // System.out.println("Your nae is "+fullName);

    // print char from name

    for (int i = 0; i < name.length(); i++) {
      System.out.println(name.charAt(i));
    }


  }
}