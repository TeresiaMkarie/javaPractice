
class Node {
     String data;
     Node next;

     public Node(String data){
        this.data = data;
        this.next = null;
     }
}
class PatientLinkedList{
    static Node head;

    public void add(String name){
        Node newNode = new Node(name);
         
        if(head == null){
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next!=null){
            current =current.next;

        }
        current.next = newNode;
    }
    public void display(){
        Node current = head;
        while(current!=null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}

public class hosyLinkedList {
    public static void main(String [] args){
      PatientLinkedList list = new PatientLinkedList();
      list.add("Mkarye Jomo");
      list.add("Kate Njeri");
      list.add("Alice Nyamvula");

      System.out.println("Hospital Patients:");
      list.display();
    }
}
