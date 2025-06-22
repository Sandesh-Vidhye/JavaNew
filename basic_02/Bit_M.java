package basic_02;
public class Bit_M {

  public static void oddorEven(int n){
    int bitmask = 1 ;
    if ((n & bitmask) == 0) {
      System.out.println("Even");
    }else{
      System.out.println("Odd");
    }
  }

  public static void main(String[] args) {
    // System.out.println(5 | 6 ^ 8);
    // System.out.println(7 ^ 8);
    // System.out.println((~ (-6)));
    // System.out.println(5 << 2);
    // System.out.println(5 >> 2);

    // check no. even or odd 
    oddorEven(5);
    oddorEven(6);

  }
}
