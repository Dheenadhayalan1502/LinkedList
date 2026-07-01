
package SingleListString;


public class Main1 
{
    public static void main(String[] args) 
    {
        
    
        Main1 m=new Main1();
        Node head=null;
        head= m.InsertBegin(head, "ravi");
        head=m.InsertBegin(head, "kumar");
        head=m.InsertBegin(head, "arun");
        head=m.InsertMiddle(head, "vijay", 3);
        head=m.InsertEnd(head, "ajay");
        m.printNode(head);
        
        
    }
    Node InsertBegin(Node head,String name)
    {
        Node n=new Node(name);
        n.next=head;
        return n;
        
    }
    Node InsertMiddle(Node head,String name,int position)
    {
        Node n=new Node(name);
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
            System.out.println("inavlid position");
            return head;
        }
        n.next=temp.next;
        temp.next=n;
        return head;
        
    }
    Node InsertEnd(Node head,String name)
    {
        Node n=new Node(name);
        
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
    void printNode(Node head)
    {
       Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.Name+" ->");
            temp=temp.next;
        }
    }
        
    
    
}
