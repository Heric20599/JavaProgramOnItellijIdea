package QUEUE.Implementation;

import java.util.LinkedList;
import java.util.Queue;

public class DisplayQueuewithhelpOfAnotherQueue {

    public static void main(String[] args) {
        Queue<Integer> Q=new LinkedList<>();
        Queue<Integer> L=new LinkedList<>();
        Q.add(12);
        Q.add(72);
        Q.add(92);
        Q.add(122);
        Q.add(102);
        Q.add(13332);
        Q.add(1002);
        while(Q.size()>0){
           // System.out.print(Q.peek()+",");
           //L.add(Q.poll());
           Q.add(L.poll());

        }
        System.out.print(Q);
    }

}
