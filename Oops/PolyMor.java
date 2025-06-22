package Oops;

public class PolyMor {
  public static void main(String[] args) {
    // Calculator cal = new Calculator();
    // System.out.println(cal.sum(1, 2));
    // System.out.println(cal.sum(1.5f, 2.5f));
    // System.out.println(cal.sum(1, 2, 3));

    Deer d = new Deer();
    d.eat();
  }
  
  // class overrinding
  static class Animal {
    void eat(){
      System.out.println("eating........");
    }
  }

  static class Deer extends Animal{
    void eat(){
      System.out.println("eat grass");
    }
  }

//   // class overloading
//   static class Calculator {
//     int sum(int a, int b){
//       return a+b;
//     }
//     float sum (float a,float b){
//       return a + b;
//     }
//     int sum(int a, int b, int c){
//       return a + b +c;
//     }
//   }
}
