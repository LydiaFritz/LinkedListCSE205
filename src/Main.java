// you may use this file to wrote and run code to test your MyArrayList class

public class Main {
   public static void main(String[] args) {
      MyLinkedList lst = new MyLinkedList();
      lst.addToEnd(12);
      lst.addToEnd(11);
      System.out.println("There are " + lst.getSize() + " items in the list.");
   }
}