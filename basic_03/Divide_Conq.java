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

  public static void main(String[] args) {
    int array[]={2,5,8,4,9,3,7};
    mergersort(array, 0, array.length-1);
    Printarray(array);
  }
}
