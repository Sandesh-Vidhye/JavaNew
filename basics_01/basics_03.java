// ++++++++++++++++ Loops +++++++++++++++++++++++
// ++++++++++++++++ While loops ******************

import java.util.Scanner;
/*public class basics_03 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Range:- ");
    int range = sc.nextInt();
    int value = 1;
    int sum = 0;
    
    while (value <=range) {
      sum += value;
      value ++;
    }
    System.out.println(sum);
  }
}  */


// *********** For Loop ************************
// public class basics_03 {

  // public static void main(String[] args) {
  //   Scanner sc= new Scanner(System.in);
  //   System.out.print("Value:- ");
  //   int value = sc.nextInt();

  //   for (int i=1; i<=10 ; i++) {
  //     System.out.println(value + " * " + i +  " = " + value * i);
  //   }
  // }
// }

// public class basics_03 {
//   // print reverse of number 
//   public static void main(String[] args) {
//     int num = 10899;

//     while (num > 0) {
//       int lastDigit = num % 10;
//       System.out.print(lastDigit );
//       num = num /10;
//     }
//     System.out.println();
//  }
// }


// ++++++++++++++++++++++++ DO while loop ++++++++++++++++++++++
public class basics_03 {
  public static void main(String[] args) {
    int num = 1;
    do {
      System.out.println("hello");
    break;

    } while (num < 5);
  }
}
