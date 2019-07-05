package gradeCaculator;
class LinkedList 
{ 
    Node head; // head of list 
  
    /* Linked list Node*/
    class Node 
    { 
        int grade; 
        String name;
        Node next; 
        Node(String n, int g) 
        { 
            name = n;
        	grade = g; 
            next = null; 
        } 
    } 
	public void add(int grade, String name) {
		Node newgrade = new Node(name,grade);
		newgrade.next = head; 
		head = newgrade;
	}
	public void deleteNode(String name) 
    { 
        // Store head node 
        Node temp = head, prev = null; 
  
        // If head node itself holds the grade name to be deleted 
        if (temp != null && temp.name == name) 
        { 
            head = temp.next; // Changed head 
            return; 
        } 
  
        while (temp != null && temp.name != name) 
        { 
            prev = temp; 
            temp = temp.next; 
        }     
  
        // If grade name was not present in linked list 
        if (temp == null) return; 
    } 

	public void replaceNode(int grade, String name) {
		 Node temp = head, prev = null; 
		  
	        // If head node itself holds the grade name to be deleted 
	        if (temp != null && temp.name == name) 
	        { 
	            temp.grade = grade; // Changed head 
	            return; 
	        } 
	  
	        while (temp != null && temp.name != name) 
	        { 
	            prev = temp; 
	            temp = temp.next; 
	        }     
	  
	        // If grade name was not present in linked list 
	        if (temp == null) return; 
	}
}