// ********** OPERATORS *********************

/* import java.nio.channels.Pipe.SourceChannel;

public class basics_02 {
  public static void main(String[] args) {
     Arithmetic (+ - * / ++ -- %)
     Rational (== != > < >= <=)
     Logical  (&&-AND, ||-OR, !-NOT)
     Bitwise  
     Assignment (= += -= *= /=) 

    // Rational 
    int a = 5 ;
    int b = 9;
    System.out.println(a == b);
    System.out.println(a != b);
    System.out.println(a > b);
    System.out.println(a < b);
    System.out.println(a <= b);
    System.out.println(a >= b); 

    // logical 
    int c = 9;
    // AND -> Means both condition are true , then result is true 
    System.out.println(a==b && c==b);
    // OR -> Means both condition false , then result is false 
    System.out.println(a==b ||  b==c);
    // NOT -> True become false and vice versa
    System.out.println(!(a==b));
    
    // Assignmet O
    a *= 10;
    System.out.println(a);
  }
} */

//************** Coditional Statements ******************

import java.util.Scanner;

public class basics_02 {
  public static void main(String[] args) {
    int a = 0;
    int b = 5;
    // if (a==b) {
    //   System.out.println("1");
    // }else if (a > b) {
    //   System.out.println("2");
    // }else if (a <b) {
    //   System.out.println("3");
    // }else{
    //   System.out.println("false");
    // }

    // Scanner Io = new Scanner(System.in);
    // System.out.println("NUm:- ");
    // int NUm = Io.nextInt();
    // if (NUm % 2 == 0) {
    //   System.out.println("Even");
    // }else{
    //   System.out.println("Odd");
    // }

    // if (a % 2 == 0) {
    //   System.out.println("Even");
    // }else{
    //   System.out.println("Odd");
    // }

    // Swith Statement
    Scanner sc = new Scanner(System.in);
    System.out.println("Enters Two No:- ");
    int Num1 = sc.nextInt();
    int Num2 = sc.nextInt();
    System.out.println("Enter Opertor to perfrom operation:- ");
    char opertor = sc.next().charAt(0);
    switch (opertor) {
      case '+':
        System.out.println(Num1+Num2);
        break;
      case '-' :
        System.out.println(Num1-Num2);
        break;
      case '*' :        
        System.out.println(Num1*Num2);
        break;
      case '/' :
        System.out.println(Num1/Num2);
        break;
      default:
        System.out.println("Error 404 Not Found");
        break;
    }
  }
}




