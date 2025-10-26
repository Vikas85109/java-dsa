public class printNumber {

  public static void printNumberRecursive(int n) {
    if (n == 0){
      return;
    }
      
    System.out.print(n + " ");
    printNumberRecursive(n - 1);
  }
  
  public static void main(String[] args) {
    int n = 5;
    
    printNumberRecursive(n);
  }
}
