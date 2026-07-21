package LinkedListExample;


public class LinkedList{
    Node head;

    //Insert at end of 11
public void InsertEnd(int Data){

    Node n=new Node(Data);
    if(head==null){
        head=n;
        return;
    }

    Node temp=head;
    while(temp.Next!=null){
        temp=temp.Next;
    }
    temp.Next=n;
    
    }

    public void InsertBegining(int data){
        Node n=new Node(data);
        n.Next=head;
        head=n;
    }

    public void InsertPosition(int data,int position){
        LinkedList list=new LinkedList();
        int count=0;
        Node prev = null;
        Node temp=head;
        Node n=new Node(data);
        if(position>count){
            System.out.println("Invalid position");
            return;
        }
        if(position==1){
            list.InsertBegining(data);
        }
        if(position==count){
            list.InsertEnd(data);
        }
       while(temp!=null && count<=position){
                prev=temp;
                temp=temp.Next;
                count++;

       }
       n.Next=temp;
       prev.Next=n;

    }

    //Display
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.Data);
            temp=temp.Next;

        }
    }
}