public class Queue {
    Node rear;
    Node front;

    //empty
    public boolean isEmpty()
    {
        if(rear==null && front==null)
        {
            return true;
        }
        return false;
    }

    //peek
    public int peak(){
        return rear.data;
    }

    //enqueue
    public void enqueue(int data){
        Node n = new Node(data);
        if(front==null && rear == null){
            front=rear=n;
        }
        rear.next=n;
        rear=n;
    }

    //Dequeue
    public int dequeue()
    {
        if(isEmpty())
            return -1;

        int data= front.data;
        front=front.next;

        return data;
    }
public static void main(String[] args) {

    Queue q = new Queue();

    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.enqueue(40);

    System.out.println("Queue Front Element: " + q.peak());

    System.out.println("Deleted Element: " + q.dequeue());

    System.out.println("After Dequeue Front Element: " + q.peak());

    System.out.println("Is Queue Empty? " + q.isEmpty());
}
}