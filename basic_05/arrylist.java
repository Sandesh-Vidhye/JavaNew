import java.util.ArrayList;


public class arrylist {

  public static void swap(ArrayList<Integer> list, int index1, int index2){

    int temp = list.get(index1);
    list.set(index1, list.get(index2));
    list.set(index2, temp);
  }







  public static void main(String[] args) {
    // ArrayList<Integer> list = new ArrayList<>();
    // ArrayList<String> list2 = new ArrayList<>();
    // ArrayList<Boolean> list3 = new ArrayList<>();

// add operation
    // list.add(1);
    // list.add(2);
    // list.add(3);
    // list.add(4);
    // list.add(5);
    // System.out.println(list);

    // get operation
    // int element = list.get(2);
    // System.out.println(element);

    // remove
    // list.remove(3);
    // System.out.println(list);

    // set
    // list.set(2, 10);
    // System.out.println(list);

    // contain element 
    // System.out.println(list.contains(1));

    // System.out.println(list.size());
    // // print array list 
    // for(int i= 0; i<list.size(); i++){
    //   System.out.println(list.get(i));
    // }

    // Print reverse Number
    ArrayList<Integer> list = new ArrayList<>();
    list.add(8);
    list.add(1);
    list.add(4);
    list.add(9);
    list.add(5);
    System.out.println(list);

    // reverse an arraylist 
    // for(int i = list.size()-1; i>=0 ; i--){
    //   System.out.print(list.get(i) + " ");
    // }

    // find max no. in array
    // int max = Integer.MIN_VALUE;
    // for(int i = 0; i<list.size(); i++){
    //   if (max < list.get(i)) {
    //     max = list.get(i);
    //   }
    // }
    // System.out.println(max);

    // Swap 2 numbers
    int index1= 1 , index2 = 2;
    // System.out.println();
    swap(list, index1, index2);
    System.out.println(list);









































  }
}
