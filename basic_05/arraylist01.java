// import java.util.ArrayList;
// import java.util.Collections;
import java.util.*;

public class arraylist01 {


  public static void main(String[] args) {
    // ArrayList<Integer> list = new ArrayList<>();
    // list.add(2);
    // list.add(4);
    // list.add(5);
    // list.add(8);
    // list.add(3);
    // list.add(1);

    // // Used for sorting collectios.sort 
    // Collections.sort(list , Collections.reverseOrder());
    // System.out.println(list);
    // Collections.sort(list);
    // System.out.println(list);


    // 
    ArrayList<ArrayList<Integer>>mainList = new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1); list.add(2);
    mainList.add(list);

    ArrayList<Integer> list2 = new ArrayList<>();
    list2.add(3); list2.add(4);
    mainList.add(list2);

    for(int i=0; i <mainList.size(); i++){
      ArrayList<Integer> currList = mainList.get(i);
      for(int j = 0; j<currList.size(); j++){
        System.out.println(currList.get(j)+ " ");
      }
      System.out.println();
    }
    System.out.println(mainList);
  }
}
