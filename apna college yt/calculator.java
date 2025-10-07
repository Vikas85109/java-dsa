import java.util.Scanner;

public class calculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter two Number");

    int a=sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
   switch(c){
     case 1:
       System.out.println(a + b);
       break;

       case 2:
       System.out.println(a - b);
       break;

       case 3:
       System.out.println("mul of two num " + a * b);
       break;

       case 4:
       System.out.println("Divide of two num " + a / b);
       break;

     default:
      System.out.println("Invalid number");
       break;



   }

  }
}
