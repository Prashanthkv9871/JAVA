import java.util.*;

public class QueueDemo{
    public static void main(String[] args){
        Queue<String> queue = new PriorityQueue<>();

        queue.add("India");
        queue.add("Germany");
        queue.add("America");

        System.out.println("Original queue : "+ queue);

        queue.remove();
        System.out.println("queue after removing the head element : " + queue);

        String head = queue.peek();
        System.out.println("Head of the Queue : " + head);

        head = queue.poll();
        System.out.println("removed head : "+ head);

        System.out.println("Queue now looks like this : "+ queue);
    }
}