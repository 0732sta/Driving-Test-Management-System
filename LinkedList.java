
public class LinkedList
{
    private ListNode firstNode;
    private ListNode lastNode;
    private ListNode currNode;
    
    public LinkedList()
    {
        firstNode = lastNode = currNode = null;

    }
    
    public void insertAtFront(Student insertItem)
    {
        if(isEmpty())
        {
            firstNode = lastNode = new ListNode(insertItem);
        }
        else
        {
            firstNode = new ListNode(insertItem, firstNode);
        }
    }
    
        public void insertAtBack(Student insertItem)
    {
        if(isEmpty())
            firstNode = lastNode = new ListNode(insertItem);
        else
            lastNode = lastNode.next = new ListNode(insertItem);
    }
    
    public Student removeFromFront()throws EmptyListException
    {
        Student removeItem = null;
        if(isEmpty())
        {
            throw new EmptyListException();
        }
        
        removeItem = firstNode.data; //retrieve the data
   
        //reset the firstNode and lastNode references
        if(firstNode.equals(lastNode))
        {
            firstNode = lastNode = null;
        }
        else
        {
            firstNode = firstNode.next;
        }
        return removeItem;
    }
    
    public boolean isEmpty()
    {
        return firstNode == null;
    }
    
    //return first element
    public Student getFirst()
    {
        if(isEmpty())
            return null;
        else
        {
            currNode = firstNode;
            return currNode.data;
        }
    }
    
   //return the next element
    public Student getNext()
    {
        if(currNode != lastNode)
        {
            currNode = currNode.next;
            return currNode.data;
        }
        else
            return null;
    }
}
