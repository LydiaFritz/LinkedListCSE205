// you may use this file to wrote and run code to test your MyArrayList class

public class Main {
   public static void main(String[] args) {
      MyLinkedList lst = new MyLinkedList();
      
      lst.insertAt(0, 100);
      System.out.println(lst.getAt(0));
      lst.insertAt(0, 200);
      System.out.println(lst.getAt(0));
      lst.insertAt(2, 300);
      System.out.println(lst.getAt(2));
      lst.insertAt(0, 400);
      System.out.println(lst.getAt(0));
      lst.insertAt(0, 500);
      System.out.println(lst.getAt(0));
      for(int i = 0; i < lst.getSize(); i++) {
    	  System.out.printf("%4d", lst.getAt(i));
      }
   }
}