package QUEUE.Implementation;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BasicSTL {
    public static void main(String[] args) {
        Queue<Integer> Q=new LinkedList<>();
        Q.add(12);
        Q.add(72);
        Q.add(92);
        Q.add(122);
        Q.add(102);
        Q.add(13332);
        Q.add(1002);
        System.out.println(Q);
        Q.poll();
        System.out.println(Q);



    }
}
