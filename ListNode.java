
public class ListNode
{
   //package access data so class List can access it directly
   Student data;
   ListNode next;
   
   //Constructor: create a ListNode that refer to Number o
   ListNode(Student o)
   {
       this(o, null);
   }
   
   //Constructor: create a ListNode that refers to Number o and to the next ListNode in the List
   ListNode(Student o, ListNode nextNode)
   {
       data = o;
       next = nextNode;
    }
    
    //return a reference to the Number in this node
    Student getData()
    {
        return data;
    }
    
    //return the next node
    ListNode getNext()
    {
        return next;
    }
}

