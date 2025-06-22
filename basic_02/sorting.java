package basic_02;
public class sorting {

  // Bubble Sort 
  public static void bubbleSort(int numbers[]){
    for(int turn = 0; turn <numbers.length-1; turn++){
      // System.out.print(turn + " ");
      for (int j = 0; j < numbers.length-1-turn; j++) {
        if (numbers[j] > numbers[j+1]) {
          // swap
          int temp = numbers[j];
          numbers[j] = numbers[j+1];
          numbers[j+1] = temp;
        }
      }
    }
  
  }
  public static void printArr(int numbers[]){
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
    System.out.println();
  }

  // Selection Sort
  public static void SelectionSort(int numbers[]){
    for (int i = 0; i < numbers.length-1; i++) {
      int minPos = i;
      for (int j = i+1; j < numbers.length; j++) {
        if (numbers[minPos] > numbers[j]) {
          minPos = j;
        }
      }
      // swap
      int temp = numbers[minPos];
      numbers[minPos]=numbers[i];
      numbers[i]=temp;
    }
  }

  // Insertion Sort
  public static void InsertionSort(int numbers[]){
    for (int i = 0; i < numbers.length-1; i++) {
      int curr = numbers[i];
      int prev = i-1;
      while(prev>= 0 && numbers[prev] >curr) {
        numbers[prev+1] = numbers[prev];
        prev--;
      }
      // insertion
      numbers[prev+1] = curr;
    }
  }



  public static void main(String[] args) {
    int numbers[] = {4, 5, 2, 1, 3};

    // Bubble Sort 
    // bubbleSort(numbers);
    // printArr(numbers);

    // Selection Sort
    // SelectionSort(numbers);
    // printArr(numbers);

    // Insertion sort
    InsertionSort(numbers);
    printArr(numbers);








  }
}
