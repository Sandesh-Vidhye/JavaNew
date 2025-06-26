public class Divide_Conq {
 
  // Merge sort 
  public static void Printarray(int array[]){

    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i]+ " ");
    }
  }

  public static void mergersort(int array[], int si , int ei){
    if (si >= ei) {
      return;
    }
    // mid
    int mid = si + (ei -si )/2;
    mergersort(array, si, mid); //left part 
    mergersort(array, mid+1, ei); // rigth part
    merge(array, si,mid, ei);

  }
  public static void merge(int array[], int si, int mid, int ei ){

    int temp[]= new int[ei-si+1];
    int i = si; //for left part
    int j = mid+1 ; //for right part
    int k = 0; // for temp arr

    while (i <= mid && j <= ei) {
      if (array[i]<array[j]) {
        temp [k] = array[i];
        i++;
      }else{
        temp [k] = array[j];
        j++ ;
      }
      k++;
    }
    // left part
    while (i <= mid) {
      temp[k++] = array[i++];
    }
    // Right part
    while (j <= ei) {
      temp[k++] = array[j++];
    }
    // copy temp to original
    for ( k = 0, i = si ; k < temp.length; k++ ,i++) {
      array[i] = temp[k];
    }
  }


  // quick sort 
  public static void pritnArr(int arr[]){
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void quickSort(int arr[], int si,  int ei){
    if (si >=ei) {
      return;
    }
    // last element 
    int pindex = partition(arr ,si ,ei);
    quickSort(arr, si , pindex-1);
    quickSort(arr, pindex+1, ei);

  }

  public static int partition(int arr[], int si , int ei){
    int pivot = arr[ei];
    int i = si -1;

    for (int j = si; j < ei; j++) {
      if (arr[j] <= pivot){
        i++;
        // swap
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;

      }
    }
    i++;
        // swap
        int temp = pivot;
        arr[ei] = arr[i]; 
        arr[i] = temp;
        return i;

  }

  public static void main(String[] args) {
    // int array[]={2,5,8,4,9,3,7};
    // mergersort(array, 0, array.length-1);
    // Printarray(array);

    int arr[]={2,5,8,4,9,3,7};
    quickSort(arr,0,arr.length-1);
    pritnArr(arr);
  }
}
