// Java program to demonstrate queue operations
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;

public class Queues {
    static Queue<Integer> fillQ(List<Integer> v) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < v.size(); i++) {
            q.add(v.get(i));
        }
        return q;
    }

    static void emptyQ(Queue<Integer> q) {
        while (!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 2, 3, 4, 5);
        Queue<Integer> q = fillQ(arr);
        emptyQ(q);
    }
}
    

