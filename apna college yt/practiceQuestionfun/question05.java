import java.util.Scanner;

public class question05 {
  // Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
  public static void isAgeGreater(int age) {
    if (age > 18) {
      System.out.println("eligible to vote");
    } else {
      System.out.println("not eligible to vote");
    }
  }
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter age ");
    int age = sc.nextInt();

    isAgeGreater(age);

    
  }
}
