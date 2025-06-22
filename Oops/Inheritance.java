package Oops;

public class Inheritance {
  public static void main(String[] args) {

    //single level
    // Fish shark = new Fish();
    // shark.eat();

    // multilevel
    // cat mini = new cat();
    // mini.eat();

    // hierarchical 
    Fish mini = new Fish();
    mini.eat();
    mini.wings = 2;
    System.out.println(mini.wings);
  }
}

// Single level Inh
// base clsss
// class Animal {
//   String color ;
//   void eat(){
//     System.out.println("eats");
//   }
//   void breath(){
//     System.out.println("breath");
//   }
// }
 
// // derived class , child , subclass
// class Fish extends Animal {
//   int fins;
//   void swim(){
//     System.out.println("swim");
//   }
// }

// Multilevel 
class Animal {
  String color ;
  void eat(){
    System.out.println("eats");
  }
  void breath(){
    System.out.println("breath");
  }
}
 
class dog extends Animal{
  void bark (){
    System.out.println("barking");
  }
}
class cat extends dog{
  void run(){
    System.out.println("runnig..");
  }
}

//hierarchical 
class Mammal extends Animal{
  void walk(){
    System.out.println("walking.....");
  }
}

class Fish extends Animal{
  int wings;
  void swim (){
    System.out.println("swim......");
  }
}

