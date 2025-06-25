public class Recursion {

  // Print decreasing number
  public static void printdec(int n ){
    if (n == 1) {
      System.out.println(n);
      return;
    }
    System.out.print(n + " ");
    printdec(n-1);
  }

  // Print Increasing number
  public static void printInc(int n){
    if (n == 1) {
      System.out.print(n);
      return;   
    }
    printInc(n-1);
    System.out.print( " " + n );
    
  }

  // Print factorial of number n
  public static int factorial(int n){
    if (n == 0) {
      return 1;      
    }
    int factN = n * factorial(n-1);
    return factN ;
  }

  // Print sum of N natural Numbers
  public static int SumOfNatural (int n){
    if (n == 1) {
      return 1;
    }
    int Sum = n + SumOfNatural(n-1);
    return Sum ;
  }

  // Fibonacci Number 
  public static int fibonacciNum (int n){
    if (n == 0 || n == 1) {
      return n;
    }
    int fibo = fibonacciNum(n-1) + fibonacciNum(n-2);
    return fibo;
  }

  // Check is a given array is sorted or not 
  public static boolean sort(int array[], int i){
    // System.out.println(i);
    if (i == array.length-1 ) {
      return true;
    }
    if (array[i] > array[i+1]) {
      return false;
    }
    return sort(array, i+1);
  }


  public static void main(String[] args) {
    /* return save all the calculation 
    and when condition false 
    they execute all the 
    calculation one at a time
    */
    int n = 5;
    // printdec(n);
    // printInc(n);
    // System.out.println(factorial(n));
    // System.out.println(SumOfNatural(n));
    // System.out.println(fibonacciNum(n));

    int array[] = {1, 2, 3, 4,  5};
    int i = 0;
    System.out.println(sort(array,i));  


  }
}
