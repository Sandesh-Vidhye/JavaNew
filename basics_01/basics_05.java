// ``````````function overloading ``````````````````
// In which functions are same but parameter are different
public class basics_05 {
  // overloading by using parametres
  // public static int sum(int a , int b ){
  //   return a + b ;
  // }
  // public static int sum (int a, int b, int c){
  //   return a + b +c;
  // }

  // Overloding by using Data types
  // public static int sum(int a , int b ){
  //   return a + b ;
  // }
  // public static float sum(float a, float b){
  //   return a + b ;
  // }

  // // check a No prime or not
  // public static boolean ISprime (int n ){
  //   if (n == 2) {
  //     return true;
  //   }
  //   for (int i = 2; i < n-1; i++) {
  //     if (n % i == 0) {
  //      return false;
  //     }
  //   }
  //   return true;
  // }
  
  // Binary tp decimal
  public static void BintoDec(int binNum){
    int mynum = binNum;
    int pow = 0;
    int decNum = 0;
     while (binNum > 0)  {
      int lastDigit = binNum % 10 ;
      decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
      pow++;
      binNum = binNum/10;
     }
     System.out.println(mynum + " -> " + decNum);
  }


  public static void main(String[] args) {
  // functions overloading 
  // System.out.println(sum(1.5f, 4f));
  // System.out.println(sum(1, 3));
  
  // check prime or not 
  // System.out.println(ISprime(4));

  // binary to decimal
  BintoDec(101);

  }














}
