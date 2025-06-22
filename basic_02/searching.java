import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;


  public class searching {

  //   // Linear Search
  // public static int linearSearch(int numbers[], int key){
  //   for (int i = 0; i < numbers.length; i++) {
  //     if (numbers[i] == key) {
  //       return i;
  //     }
  //   }
  //   return -1;
  // }

  // Largest Eelement 
  // public static int LargestNum(int numbers[]){
  //   int largest = Integer.MIN_VALUE; // -infinity
  //   int smallest = Integer.MAX_VALUE; // + Infinity

  //   for (int i = 0; i < numbers.length; i++) {
  //     if (largest < numbers[i]) {
  //       largest = numbers[i];
  //     }
  //     if (smallest > numbers[i]) {
  //       smallest = numbers[i];
  //     }
  //   }  
  //   System.out.println(smallest);
  //   return largest;
  // }

  // Binary Search 
  // public static int binarySeach(int numbers[] , int key){
  //   int start = 0;
  //   int end = numbers.length - 1 ;

  //   while (start <= end) {
  //     int mid = (start + end )/2;
  //     if (numbers[mid] == key) {
  //       return mid;
  //     }else if (numbers[mid] < key ) {
  //       start = mid+1 ;
  //     }else{
  //       end = mid-1;
  //     }
  //   }
  //   return -1 ;
  // }

  // Reverse an Array 
  // public static void reverse(int numbers[]){
  //   int start = 0 , end = numbers.length-1;

  //   while (start < end ) {
  //     // swap
  //     int temp = numbers[end];
  //     numbers[end] = numbers[start];
  //     numbers[start] = temp;
  //     start++ ; end --;
  // } }

  // Pairs in an array 
  // public static void pairs(int numbers[]){
  //   int tp = 0;
  //   for (int i = 0; i < numbers.length; i++) {
  //     int current = numbers[i]; // 2, 4, 6, 8, 20
  //     for (int j = i + 1; j < numbers.length; j++) {
  //       System.out.print("(" + current + " , "+ numbers[j] + " ) ");
  //       tp ++;
  //     }
  //     System.out.println();
  //   }
  //   System.out.println(tp);
  // }

  // Print Subarrays 
  public static void Subarray(int numbers[]){
    int ts = 0;
    for (int i = 0; i < numbers.length; i++) {
      int start = i;
      for(int j= i; j<numbers.length; j++){
        int end = j;
        for (int k = start; k <= end; k++) {    
          System.out.print(numbers[k] + " ");
        }
        ts++;
        System.out.println();
      }
        System.out.println();
        System.out.println(ts);
    }
  }


  public static void main(String[] args) {

    // Linear Search ````````````````````````````````````
    // int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Key:- ");
    // int key = sc.nextInt();
    // // int key = 100;
    // int index = linearSearch(numbers, key);
    // if (index == -1) {
    //   System.out.println("Not Found");
    // }else{
    //   System.out.println("Index is:- "+index);
    // }

    // Largest Element ```````````````````````````````````````
    // int numbers[] = {1, 3, 5, 8, 4, 2, 7};
    // System.out.println(LargestNum(numbers));

    // Binary Search 
    // int numbers []={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13, 14, 15, 16};
    // int key = 15;  
    // System.out.println(binarySeach(numbers, key));

    // Rever an array 
    // int numbers [] = {1,2, 3, 4, 5, 6,7};
    // reverse(numbers);
    // for (int i = 0; i < numbers.length; i++) {
    //   System.out.print(numbers[i] + " ");
    // }
    // System.out.println();

    // Pairs in an array
    // int numbers[]= {2, 4, 6, 8, 10};
    // pairs(numbers);

    // Print Subarray
    int numbers[] = {2, 4, 6, 8, 10};
    Subarray(numbers);
  }
}
