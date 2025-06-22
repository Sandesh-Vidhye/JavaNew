package basic_02;


import java.util.Scanner;

public class array_01 {

  public static void update(int marks[]){
    for (int i = 0; i < marks.length; i++) {
      marks[i] = marks[i] + 1;

    }
  }
  public static void main(String[] args) {

    // Basic Array decalration 
    // int num [] = {1 , 2 , 3};
    // String Fruits [] = {};
    // int marks [] = new int[50];
    // Scanner sc = new Scanner(System.in);
    // marks[0] = sc.nextInt();
    // marks[1] = sc.nextInt();
    // marks[2] = sc.nextInt();
    // System.out.println("Phy:- " + marks[0]);
    // System.out.println("Chem:- " + marks[1]);
    // System.out.println("Maths:- " + marks[2]);

    int marks[] = { 97, 89 , 98};
    update(marks);
    // Print nour marks 
    for (int i = 0; i < marks.length; i++) {
      System.out.print(marks[i] + " ");
    }
    System.out.println();
  }
}
