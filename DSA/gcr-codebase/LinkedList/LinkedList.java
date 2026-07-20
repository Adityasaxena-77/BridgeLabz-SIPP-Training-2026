import java.util.*;

public class LinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head;
    int count;

    LinkedList() {
        head = null;
        count = 0;
    }

    public Node insertBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        count++;
        return head;
    }

    // Insert at End
    public Node insertEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            count++;
            return head;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        count++;

        return head;
    }

    // Insert at Position
    public Node insertAtPosition(int data, int pos) {

        if (pos < 1 || pos > count + 1) {
            System.out.println("Invalid Position");
            return head;
        }

        if (pos == 1) {
            return insertBeginning(data);
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        count++;
        return head;
    }

    public Node deleteBeginning() {

        if (head == null) {
            System.out.println("List is Empty");
            return null;
        }

        head = head.next;
        count--;

        return head;
    }

    public Node deleteEnd() {

        if (head == null) {
            System.out.println("List is Empty");
            return null;
        }

        if (head.next == null) {
            head = null;
            count--;
            return head;
        }

        Node prev = null;
        Node curr = head;

        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }

        prev.next = null;
        count--;

        return head;
    }

    public Node deleteAtPosition(int pos) {

        if (head == null) {
            System.out.println("List is Empty");
            return null;
        }

        if (pos < 1 || pos > count) {
            System.out.println("Invalid Position");
            return head;
        }

        Node prev = null;
        Node curr = head;
        Node next = null;

        for (int i = 1; i < pos; i++) {
            prev = curr;
            curr = curr.next;
        }

        next = curr.next;

        if (prev == null) {
            head = next;
        } else {
            prev.next = next;
        }

        count--;
        return head;
    }

    public Node deleteValue(int data) {

        if (head == null) {
            System.out.println("List is Empty");
            return null;
        }

        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null && curr.data != data) {
            prev = curr;
            curr = curr.next;
        }

        if (curr == null) {
            System.out.println("Value Not Found");
            return head;
        }

        next = curr.next;

        if (prev == null) {
            head = next;
        } else {
            prev.next = next;
        }

        count--;

        return head;
    }

    public boolean search(int data) {

        Node temp = head;

        while (temp != null) {
            if (temp.data == data)
                return true;

            temp = temp.next;
        }

        return false;
    }

    public int countNodes() {
        return count;
    }

    public Node reverse() {
        
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
        return head;
    }

    public void display() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        int choice, subChoice, data, pos;

        do {

            System.out.println("\n====================================");
            System.out.println("   WELCOME TO LINKED LIST PROGRAM");
            System.out.println("====================================");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Count Nodes");
            System.out.println("6. Reverse");
            System.out.println("7. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("\n------ INSERT MENU ------");
                    System.out.println("1. Insert at Beginning");
                    System.out.println("2. Insert at End");
                    System.out.println("3. Insert at Position");
                    System.out.print("Enter Choice: ");

                    subChoice = sc.nextInt();

                    switch (subChoice) {

                        case 1:
                            System.out.print("Enter Data: ");
                            data = sc.nextInt();
                            list.insertBeginning(data);
                            break;

                        case 2:
                            System.out.print("Enter Data: ");
                            data = sc.nextInt();
                            list.insertEnd(data);
                            break;

                        case 3:
                            System.out.print("Enter Data: ");
                            data = sc.nextInt();
                            System.out.print("Enter Position: ");
                            pos = sc.nextInt();
                            list.insertAtPosition(data, pos);
                            break;

                        default:
                            System.out.println("Invalid Choice");
                    }

                    break;

                case 2:

                    System.out.println("\n------ DELETE MENU ------");
                    System.out.println("1. Delete Beginning");
                    System.out.println("2. Delete End");
                    System.out.println("3. Delete at Position");
                    System.out.println("4. Delete by Value");
                    System.out.print("Enter Choice: ");

                    subChoice = sc.nextInt();

                    switch (subChoice) {

                        case 1:
                            list.deleteBeginning();
                            break;

                        case 2:
                            list.deleteEnd();
                            break;

                        case 3:
                            System.out.print("Enter Position: ");
                            pos = sc.nextInt();
                            list.deleteAtPosition(pos);
                            break;

                        case 4:
                            System.out.print("Enter Value: ");
                            data = sc.nextInt();
                            list.deleteValue(data);
                            break;

                        default:
                            System.out.println("Invalid Choice");
                    }

                    break;

                case 3:

                    System.out.print("Enter Value to Search: ");
                    data = sc.nextInt();

                    if (list.search(data))
                        System.out.println("Value Found.");
                    else
                        System.out.println("Value Not Found.");

                    break;

                case 4:

                    System.out.println("\nCurrent Linked List:");
                    list.display();
                    break;

                case 5:

                    System.out.println("Total Nodes = " + list.countNodes());
                    break;

                case 6:

                    list.reverse();
                    System.out.println("Linked List Reversed Successfully.");
                    list.display();
                    break;

                case 7:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 7);

        sc.close();
    }
}