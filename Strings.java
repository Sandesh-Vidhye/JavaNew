import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.print.attribute.standard.MediaSize.NA;

public class Strings {

  // Strings are IMMUTABLE

  public static void PrintLetter(String str){
    for (int i = 0; i < str.length(); i++) {
      System.out.print(str.charAt(i) + " ");
    }
    // System.out.print(str);
    System.out.println();
  }

  // Palindorme
  public static boolean CheckPalindorme(String str){
    for (int i = 0; i < str.length()/2; i++) {
      int n = str.length();
      if (str.charAt(i) != str.charAt(n-i-1)) {
        return false;
      }
    }
    return true;
  }

  // SubString of Functions
  public static String substring(String str, int s,  int e){
    String substr = "";
    for (int i = s; i < e; i++) {
        // System.out.println(i);
        substr += str.charAt(i);
    }
    return substr ;
  }
   

  public static void main(String[] args) {
    // char arr[] = {'a','b','c','d'};
    // String str = "abcd";
    // String str2 = new String("xyz");

    // Scanner sc= new Scanner (System.in);
    // String name ;
    // name = sc.nextLine();
    // System.out.println(name);

    String FullName = "Tony";
    // System.out.println(FullName.length());
    // System.out.println(FullName.charAt(5));
    // System.out.println(FullName.trim());

    // Concatenation 
    String LastName = "Stark";
    // String Name = FullName + "_" + LastName;
    // System.out.println(Name);

    // Print letter
    // PrintLetter(Name);

    // Palindrome
    // String str = "racecar";
    // System.out.println(CheckPalindorme(str)); 

    // Comparing of Srings 
    String s1 = "Tony";
    String s2 = "Tony";
    String s3 = new String("Tony");
    // if (s1 == s2) {
    //   System.out.println("Strings are equal");
    // }else{
    //   System.out.println("Strings are not equal");
    // }
    // if (s2 == s3) {
    //   System.out.println("Strings are equal");
    // }else{
    //   System.out.println("Strings are not equal");
    // }
    // if (s1.equals(s3)) {
    //   System.out.println("Equal");
    // }else{
    //   System.out.println("Not Equal");
    // }


    // Sub String Functions
    String str = "Sandesh Vidhye";
    // System.out.println(substring(str, 2, 9));
    // System.out.println(str.substring(0,5));

    // String in Uppercase 
    String Name = "hi, I'm a sandesh";
    String newname =Name.toUpperCase();
    System.out.println(newname);

  }
}
