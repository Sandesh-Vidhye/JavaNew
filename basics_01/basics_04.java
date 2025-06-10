// '''''''''''''''  Functions  ''''''''''''''''''''''

import java.util.Scanner;

public class basics_04 {
  public static void Functions(){
    System.out.println("aaaaaaaaaaaaaa");
    System.out.println("aaaaaaaaaaaaaa");
  }
  public static void CalSum(){    
    Scanner sc = new Scanner (System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = a + b ;
    System.out.println("Sum is: " + sum);
  }
  
  public static void main(String[] args) {
   CalSum();
  }
}
