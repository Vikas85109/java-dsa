import java.util.Scanner;

public class question04 {
  // Write a function that takes in the radius as input and returns the circumference of a circle.

  public static double circumferenceOFCircle(double x) {
    return (2 *Math.PI * x);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number ");
   
    
    double r = sc.nextDouble();

    System.out.println("circumference of a circle is "+circumferenceOFCircle(r));

  }
}
