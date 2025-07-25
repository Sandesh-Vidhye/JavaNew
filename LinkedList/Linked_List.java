package LinkedList;

public class Linked_List{

  public static class Node {
    int data;
    Node next;

    public Node(int data){
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;
  
  // methods
  public void addFirst(int data){
      // Step1 = create a new node 
    Node newNode = new Node (data);

  if (head == null) { 
    head = tail = newNode;
    return;
   }
    // step2 - newNode next = head
    newNode.next = head;

    // Step3- head = newNode 
    head = newNode;
  }

  public void addLast(int data){
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
    }
    tail.next = newNode;
    tail = newNode;
  }

  public void print (){
    if (head == null) {
      System.out.println("list is empyt");
      return ; 
    }
    Node temp = head;
    while (temp!=null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
      
    }System.out.println();
  } 



  public static void main(String[] args) {
    Linked_List ll = new Linked_List();
    // ll.head = new Node(1);
    // ll.head.next = new Node(2);
    ll.print();
    ll.addFirst(2);
    ll.print();
    ll.addFirst(1);
    ll.print();
    ll.addLast(3);
    ll.print();
    ll.addLast(4);
    ll.print();

    System.out.println("hello");
  }
}

