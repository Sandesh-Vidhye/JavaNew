// ++++++++++++++++ Loops +++++++++++++++++++++++
// ***************** While loops ******************

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
public class basics_03 {

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Value:- ");
    int value = sc.nextInt();

    for (int i=1; i<=10 ; i++) {
      System.out.println(value + " * " + i +  " = " + value * i);
    }
  }
}
