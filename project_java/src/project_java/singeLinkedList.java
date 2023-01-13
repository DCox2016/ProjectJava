package project_java;

public class singeLinkedList {
	 //Create node
	 class Node {
	        int val;
	        Node next; 
	        
	        Node(int x) { val = x;}
	    }
	    
	    private int size;
	    private Node head;
		    
	    public int get(int index) {
	      if(index >= size)
	          return -1;
	      Node curr = head;
	      for (int i = 0; i < index; i++)
	          curr = curr.next;
	        return curr.val;
	    }
	    
	    public void addAtHead(int val) {
	        Node prev = head;
	        head = new Node(val);
	        head.next = prev;
	        size++;
	    }
	    
	    public void addAtTail(int val) {
	        if(head == null){
	            addAtHead(val);
	            return;
	        } 
	        Node curr = head;
	        while(curr.next != null)
	            curr = curr.next;
	        curr.next = new Node(val);
	        size++;
	    }
	    
	    public void addAtIndex(int index, int val) {
	        if(index > size)
	            return;
	        if(index == 0)
	            addAtHead(val);
	        else if (index == size)
	            addAtTail(val);
	        else {
	            Node newNode = new Node(val), curr = head;
	            for(int i = 0; i < index -1; i++)
	                curr = curr.next;
	            newNode.next = curr.next;
	            curr.next = newNode;
	            size++;
	        }
	    }
	    
	    public void deleteAtIndex(int index) {
	      if(index > size)
	            return;
	        if(index == 0)
	            head  = head.next;
	        else {
	            Node curr = head;
	            for(int i = 0; i < index -1; i++)
	                curr = curr.next;
	            if(curr.next != null)
	            curr.next = curr.next.next;
	        }
	        size--;
	    }
}
