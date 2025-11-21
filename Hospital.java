class Node {
    int id;
    String name;
    String ward;
    Node next;

    Node(int i, String n, String w) {
        id = i;
        name = n;
        ward = w;
        next = null;
    }
}

public class Hospital {

    static Node add(Node head, int id, String name, String ward) {
        Node p = new Node(id, name, ward);
        p.next = head;
        return p;
    }

    static void printList(Node head) {
        Node t = head;
        while (t != null) {
            System.out.println(t.id + "  " + t.name + "  " + t.ward);
            t = t.next;
        }
    }

    public static void main(String[] args) {
        Node head = null;

        head = add(head, 101, "James", "Ward A");
        head = add(head, 102, "Mary", "Ward B");
        head = add(head, 103, "Peter", "Ward C");
        head = add(head, 104, "Sarah", "Ward A");

        System.out.println("Hospital Patients:");
        printList(head);
    }
}

    

