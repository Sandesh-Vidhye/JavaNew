package Oops;

import java.nio.channels.Pipe.SourceChannel;

import javax.xml.stream.events.StartDocument;

import basic_02.sorting;

public class Interface {
  // public static void main(String[] args) {
    
  //   Queen q = new Queen();
  //   q.moves();
  // }

  // Static Keyword
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.schoolName = "Pce";

    Student s2 = new Student();
    System.out.println(s2.schoolName);

    Student s3 = new Student();
    s3.schoolName= "Coep";
  }

}

// Static kvariblae 
class Student {
  String name ;
  int roll ;

  static String schoolName;
   void setName (String name){
    this.name = name;
   }
   String getName (String name){
    return this.name;
   }
}

// interface Cheesplayer {
// void moves();
// }
// class Queen implements Cheesplayer{
//   public void moves(){
//     System.out.println("Up , down , left , right");
//   }
// }
// class Rook implements Cheesplayer{
//   public void moves(){
//     System.out.println("Up , down , left , right");
//   }
// }





