package Oops;
public class Oops {
  public static void main(String[] args) {
    Pen p1 = new Pen(); // we created pen obj p1
    p1.setColor("blue");
    System.out.println(p1.getColor());
    p1.steTip(5);
    System.out.println(p1.getTip());
    p1.setColor("yellow");
    System.out.println(p1.getColor());

    
    // bankAccount myAcc = new bankAccount();
    // myAcc.username = "sandehs vidhye";
    // myAcc.setpassword("abcdefg"); 
  }
}
// Access Modifiers
// class bankAccount {
//   public String username;
//   private String password ;
//   public void setpassword (String pwd) {
//     password = pwd ;
//     System.out.println(username + password);
//   }
// }

// class Student {
//   String name ;
//   int age ;
//   float percentage;
//   void CalPercentage(int phy, int math){
//   }
// }

class Pen {
  private String color; // Prop
  private int tip ;
  String getColor(){
    return this.color;
  }
  int getTip(){
    return this.tip;
  }

  void setColor(String newcolor){
    color = newcolor;
  }
  void steTip(int newTip){
    tip = newTip;
  }
}