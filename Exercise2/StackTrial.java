import java.util.Stack;
import java.util.Scanner;
class Node {
    int data;
    Node next;
    //Constructor to the class Node
    Node(int newNode){
        this.data = newNode;
        this.next = null;
    }

}

class LinkedList {
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


    
}


public class StackTrial {
    // stack of integers [2, 9, 15, 8, 1, 3]
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


            Stack<Integer> stack= new Stack<>();

            stack.push(2);
            stack.push(9);
            stack.push(15);
            stack.push(8);
            stack.push(1);
            stack.push(3);

            // popping twice and returning the value of the second pop
            int firstPop = stack.pop();
            int secondPop = stack.pop();

            System.out.println("first pop " + firstPop);
            System.out.println("second pop " + secondPop);
            System.out.println("stack after the popping " + stack);

            // resetting the stack for Question 3
            Stack<Integer> stack2 = new Stack<>();
            stack2.push(8);
            stack2.push(1);
            stack2.push(3);
            System.out.println("initial stack " + stack2);

            // performing operations
            stack2.pop();
            stack2.push(2);
            stack2.push(15);
            stack2.pop();

            System.out.println("final stack after operation " + stack2);

            Scanner sc =  new Scanner(System.in);
            Stack<String> stack3 = new Stack<>();

            System.out.println("ENTER words and type 'END' to finish");
            while(true) {
                String input = sc.next();
                if (input.equalsIgnoreCase("END")) break;
                stack3.push(input);
            }

            System.out.println("reversed order ");

            while(!stack.isEmpty()) {
                System.out.println(stack.pop() + " ");
            }
            sc.close();

        }

}
