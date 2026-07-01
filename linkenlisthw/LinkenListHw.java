
package linkenlisthw;


public class LinkenListHw 
{

   
    public static void main(String[] args) 
    {
        LinkenListHw ll=new LinkenListHw();
        Node head=null;
       head= ll.InsertBegin(head, 30);
        head=ll.InsertBegin(head, 20);
        head=ll.InsertBegin(head, 10);
        head=ll.InsertEnd(head, 40);
        head=ll.InsertMiddle(head, 25, 3);
        ll.PrintNode(head);
      
       
        
        
    }
    Node InsertBegin(Node head,int data)
    {
        Node n=new Node(data);
        n.next=head;
        head=n;
        return head;
        
        
    }
    Node InsertMiddle(Node head,int data,int position)
    {
        Node n=new Node(data);
        if(position==1)
        {
            n.next=head;
            return n;
        }
        Node temp=head;
        for(int i=1;i<position-1&&temp!=null;i++)
        {
            temp=temp.next;
            
        }
        if(temp==null)
        {
            System.out.println("invalid position ");
            return head;
        }
        n.next=temp.next;
        temp.next=n;
        return head;
        
           
        
    }
    Node InsertEnd(Node head,int data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            return n;
        }
        Node temp=head;
        
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=n;
        return head;
        
    }
    void PrintNode(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data+" ->");
            temp=temp.next;
        }
    }
    
    
}
