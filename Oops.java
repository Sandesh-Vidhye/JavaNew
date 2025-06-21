public class Oops {
  public static void main(String[] args) {
    Pen p1 = new Pen(); // we created pen obj p1
    p1.setColor("blue");
    System.out.println(p1.color);
    System.out.println(p1);
    p1.steTip(5);
    System.out.println(p1.tip);
  }
}

class Pen {
  // Prop 
  String color;
  int tip ;
  void setColor(String newcolor){
    color = newcolor;
  }

  void steTip(int newTip){
    tip = newTip;
  }
}

class Student {
  String name ;
  int age ;
  float percentage;
 
  void CalPercentage(int phy, int math){

  }
}