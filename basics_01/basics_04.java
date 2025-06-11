// '''''''''''''''  Functions  ''''''''''''''''''''''

import java.util.Scanner;

public class basics_04 {
  public static void Functions(){
    System.out.println("aaaaaaaaaaaaaa");
    System.out.println("aaaaaaaaaaaaaa");
  }
  //````used ofr defining --> formal Parameters are num1 and num2 ``````````````````````
  public static void CalSum(int num1, int num2){    
    int sum = num1 + num2 ;
    System.out.println("Sum is: " + sum);
  }
  
  // Swaping two numbers
  public static void swap (int a, int b ){
    int temp = a;
    a = b ;
    b = temp; 
    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }

  // product of a and b 
  public static int product(int a, int b){    
    int mul = a * b ;
    return mul ;
  }

  public static int factorial (int n) {
    int f = 1;
    for(int i= 1; i <=n ; i++){
      f = f*i;
    }
    return f ;
  }
  
  public static void main(String[] args) {
    // Scanner sc = new Scanner (System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // CalSum(a ,b); 
    // used for calling purpose --> Arguments or Actual parameters''''''''''''''''''''

    // Swap
    // int a = 5;
    // int b = 10;
    // swap(a,b );
    // System.out.println("a = " + a);
    // System.out.println("b = " + b);

    // Product of a and b 
    // int a = 3;
    // int b = 4;
    // int prod = product(a, b);
    // System.out.println(" a * b = " + prod);
    // prod = product(10, 2);
    // System.out.println(" a * b = " + prod);

    // Factorial of No.
    // direct pass through print statement or another way also
    // System.out.println(factorial(4));
    // int num = 5;
    // int fact = factorial(num);
    // System.out.println(fact);
  }
}





