package Stack;
public class Stack {

    StackData top;

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return -1;
        }

        return top.data;
    }

    public void push(int data) {
        StackData n = new StackData(data);
        n.next = top;
        top = n;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return -1;
        }

        int data = top.data;
        top = top.next;

        return data;
    }

    public void display() {

        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return;
        }

        StackData temp = top;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack Elements:");
        stack.display();

        System.out.println("Top Element: " + stack.peek());

        System.out.println("Removed Element: " + stack.pop());

        System.out.print("After Popping the element, stack elements are: ");
        stack.display();

        System.out.println("Is Stack Empty? " + stack.isEmpty());
    }
}