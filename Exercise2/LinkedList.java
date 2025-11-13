class Node {
    int data;
    Node next;
    //Constructor to the class Node
    Node(int newNode){
        this.data = newNode;
        this.next = null;
    }

}

public class LinkedList {
    Node head;

    // insert the specified element at the specified position within the linked list
    void insertAtPosition(int data, int pos) {
        Node newNode = new Node(data);

        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;

        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("out of range");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        



    }

    // insert element into the linkedlist at the first position
    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    // insert element at the last position
    public void insertAtLast(int data) {
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // iterate through all the elements displaying with their positions
    public void displayWithPositions() {
        Node temp = head;
        int pos = 0;

        while(temp != null) {
            System.out.println("Position " + pos + " data: " + temp.data);
            temp = temp.next;
            pos++;
        }
    }
    // iterate elements in their reverse order
    public void displayReverse(Node node) {
        if (node == null) return;
        displayReverse(node.next);
        System.out.println(node.data);
    }

    // remove specified element from a linked list


    public void removeElement(int key) {
        if (head == null) return;

        if (head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;

        }

        if (temp.next == null) {
            System.out.println("element not found");
            return;
        }

        temp.next = temp.next.next;
        
    }
    // remove the first element
    public void removeFirst() {

        if (head != null) {
            head = head.next;
        }
    }

    // remove the last element
    public void removeLast() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // remove all elements from a linked list
    public void clear() {
        head = null;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtPosition(10, 0);
        list.insertAtPosition(20, 1);
        list.insertAtPosition(30, 2);

        list.displayWithPositions();
        list.insertAtFirst(4);
        list.displayWithPositions();

        list.insertAtLast(78);
        list.displayWithPositions();
    }
    

    
}