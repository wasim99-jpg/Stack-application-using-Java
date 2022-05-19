

public class MyStack
{
   private Node top;  // point to first node
   private Node newNode;   // point to the new node
  // private Node currNode;   // use to traverse the list
  
    public MyStack() // default constructor
    {
        top= null;
    }
    
    public void push(Object item) // insert item onto stack
    {
       //insertAtFront(item);
       
    }
    
    public Object pop() // remove item from stack
    {
       // return removeAtFront();
       Object removeItem = null;

      if ( isEmpty() )
         System.out.println( "The stack is Empty ");

      removeItem = top.data;  // retrieve the data

      // reset the firstNode and lastNode references
      if ( top.next == null )
         top = null;
      else
         top = top.next;

      return removeItem;  
    }
    
    public Object top() // retrieve the top item
    {
       // return getFirst();
       return top.data;
        
    }
    
    public boolean isEmpty() // check whether the stcak is empty
    {
      // return isEmpty(); 
      return top == null;
    }
    
    // display the contents of list
    public void display()
    {
        System.out.println(" The contents of the stack:");
        Node current = top;
        while(current != null)
        {
            System.out.println(current.data.toString() + " ");
            current = current.next;
        }
    }
}