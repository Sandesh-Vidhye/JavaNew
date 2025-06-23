package Oops;

public class PolyMor {
  public static void main(String[] args) {
    // Calculator cal = new Calculator();
    // System.out.println(cal.sum(1, 2));
    // System.out.println(cal.sum(1.5f, 2.5f));
    // System.out.println(cal.sum(1, 2, 3));

  //   Deer d = new Deer();
  //   d.eat();

  // Abstract classses ``````````````````````````
    Horse h = new Horse();
    h.eat();
    h.walk();
    // h.changecolor();
    System.out.println(h.color);

    Chicken c = new Chicken();
    // c.eat();
    // c.walk();

  }

  
  // class overrinding
  // static class Animal {
  //   void eat(){
  //     System.out.println("eating........");
  //   }
  // }

  // static class Deer extends Animal{
  //   void eat(){
  //     System.out.println("eat grass");
  //   }
  // }

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



// Abstraction classes
static abstract class Animal {
  String color ;
  Animal (){
    color = "brown";
  }

  void eat(){
    System.out.println("eating....");
  }
  abstract void walk();
}

static class Horse extends Animal{
  void changecolor(){
    color = " dark " ;
  }
  void walk(){
    System.out.println("Walk on four legs");
  }
}

static class Chicken extends Animal{
  void changecolor(){
    color = " white " ;
  }
  void walk(){
    System.out.println("Walk on two legs");
  }
}





















}
