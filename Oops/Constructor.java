package Oops;

public class Constructor {
  public static void main(String[] args) {
    Student s1 = new Student();
    // Student s3 = new Student(123);

    // Copy Const
    s1.name = "sandesh";
    s1.roll = 1234;
    s1.password = "Sdkfskd;f";
    s1.marks[0] =100;
    s1.marks[1] =110;
    s1.marks[2] =150;

    Student s2 = new Student(s1);
    s2.password ="xyz";
    s1.marks[2] = 99;
    for (int i = 0; i <3; i++) {
      System.out.println(s2.marks[i]);
    }
  }
}

class Student {
  String name;
  int roll;
  String password;
  int marks[];

  // Copy
  Student(Student s1){
    marks = new int[3];
    this.name = s1.name;
    this.roll =s1.roll;
    this.marks = s1.marks;
  }


  // Non- parameterized Constructor
  Student(){
    System.out.println("Constructor are......");
  }

  // Parameterized Constructor
  // Student(String name){
  //   this.name = name;
  //   // System.out.println(name + " "+  roll);
  // }
  // Student(int roll){
  //   this.roll = roll;
  //   // System.out.println(name + " "+  roll);
  // }
  
}


