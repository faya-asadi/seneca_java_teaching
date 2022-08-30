package Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

    public void createQueue(){
        Queue<String> pq = new PriorityQueue<>();

        pq.add("First");
        pq.add("second");
        pq.add("Third");
        pq.add("Forth");

        System.out.println("Initial Queue " + pq);

        while(!pq.isEmpty()){
           String removed =  pq.remove();
            System.out.println("Removed Item: "+ removed);
            System.out.println("After Remove " + pq);

            System.out.println("peek Method " + pq.peek());

            System.out.println("***********\n");
        }

    }
}
