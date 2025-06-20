import java.util.Scanner;

public class TwoD_Array {
  
  // 2D Array
  public static boolean search(int matrix[][],int key){
     for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == key) {
          System.out.println("["+ i + "," + j + "]");
          return true;
        }
      }
    }
    System.out.println("key not found");
    return false ;
  }

  // Spiral matrix
  public static void Spiral(int matrix[][]){
    int startRow =0;
    int startCol =0;
    int endRow = matrix.length-1;
    int endCol = matrix[0].length-1;

    while (startRow <= endRow && startCol <= endCol) {
      // Top
      for (int j = startCol; j <=endCol; j++) {
        System.out.print(matrix[startRow][j]+ " " );
      }
      // right
      for (int i = startRow+1; i <= endRow; i++) {
        System.out.print(matrix[i][endCol] + " ");
      }
        // bottom
      for (int j = endCol-1; j >= startCol; j--) {
        System.out.print(matrix[endRow][j]+" ");
        if (startRow == endRow) {
          break;
        }
      }
      // left
      for (int i = endRow-1; i >= startRow+1; i--) {
        if (startCol == endCol) {
          break;
        }
        System.out.print(matrix[i][startCol] + " ");
      }
  
      startCol++;
      startRow++;
      endRow--;
      endCol--;
    System.out.println();
      
    }
  }


  public static void main(String[] args) {
  //   // int matrix[][]= new int [3][3];
  //   Scanner sc= new Scanner (System.in);
  //   // int n = 3 , m = 3;
  //   int n = matrix.length , m = matrix[0].length;
  //   for (int i = 0; i < matrix.length; i++) {
  //     for (int j = 0; j < matrix.length; j++) {
  //       matrix[i][j]= sc.nextInt();
  //     }
  //   } // Oupput
  //  for (int i = 0; i < matrix.length; i++) {
  //     for (int j = 0; j < matrix.length; j++) {
  //       System.out.print(matrix[i][j] + " ");
  //      }
  //      System.out.println();
  //   }
  //   // Search Function
  //   search(matrix, 5);
  
    // Spiral Matrix
    // int matrix [][] ={{1,2,3,4},
    //                   {5,6,7,8},
    //                   {9,10,11,12},
    //                   {13,14,15,16}};
    // Spiral(matrix);
  }
}
