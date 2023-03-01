// Complete the implementation of your MyLinkedList class in this file


public class MyLinkedList implements MyList {
    // Implement the required fields and methods here
    private Node head = null;
    private int size = 0;
	
	

	@Override
	public void addToEnd(Object o) {
		//find the end
		Node curr = head;
		Node newNode  = new Node();
		newNode.next = null;
		newNode.data = o;
		
		if(curr == null)
			//empty list, this is the first node
			head = newNode;
		else {
			//find the end using MyListIterator
			MyLinkedListIterator itr = new MyLinkedListIterator();
			itr.currentNode = head;
			while(itr.hasNext())
				itr.currentNode = itr.currentNode.next;
			//no next node, so we are at end of list
			//add node here
			itr.currentNode.next = newNode;
		}
		size++;
		
	}

	@Override
	public void insertAt(int index, Object o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAt(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getAt(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}
   
	// Do not alter the code below 
	
	public MyListIterator getIterator() {
		return new MyLinkedListIterator();
	}
	
	private class MyLinkedListIterator implements MyListIterator {
		Node currentNode = null;

		@Override
		public Object next() {
			if (currentNode != null)
				currentNode = currentNode.next;
			else
				currentNode = head;

			return currentNode.data;
		}

		@Override
		public boolean hasNext() {
			if (currentNode != null)
				return currentNode.next != null;
			else
				return head != null;
		}
	}
	
	class Node {
		public Object data = null;
		public Node next = null;
	}

}