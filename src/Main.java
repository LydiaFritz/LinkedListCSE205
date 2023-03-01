// you may use this file to wrote and run code to test your MyArrayList class

public class Main {
   public static void main(String[] args) {
      MyLinkedList lst = new MyLinkedList();
      lst.addToEnd(12);
      lst.addToEnd(11);
      lst.insertAt(1, 100);
      lst.insertAt(1, 200);
      lst.insertAt(1, 300);
      lst.insertAt(1, 400);
      lst.insertAt(1, 500);
      for(int i = 0; i < lst.getSize(); i++) {
    	  System.out.printf("%4d", lst.getAt(i));
      }
   }
}