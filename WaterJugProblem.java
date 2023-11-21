package AIASSIGNMENT;

import java.util.LinkedList;
import java.util.Queue;

public class WaterJugProblem {
    public static void main(String[] args)
            throws java.lang.Exception{
        int jug1 = 4;
        int jug2 = 3;
        int target = 2;
        getPathIfPossible(jug1, jug2, target);
    }

    private static void getPathIfPossible(int jug1, int jug2, int target){
        boolean[][] visited = new boolean[jug1 + 1][jug2 + 1];
        Queue <Pair> queue = new LinkedList<>();

        // Initial State: Both Jugs are empty so initialise j1 j2 as 0 and put it in the path list
        Pair initialState = new Pair(0, 0);
        initialState.path.add(new Pair(0, 0));
        queue.offer(initialState);

        while (!queue.isEmpty()) {
            Pair curr = queue.poll();

            if (curr.j1 > jug1 || curr.j2 > jug2 || visited[curr.j1][curr.j2])
                continue;
            visited[curr.j1][curr.j2] = true;

            if (curr.j1 == target || curr.j2 == target) {
                if (curr.j1 == target) {
                    curr.path.add(new Pair(curr.j1, 0));
                }
                else {
                    curr.path.add(new Pair(0, curr.j2));
                }
                int n = curr.path.size();
                System.out.println("Path of states of jugs followed is :");
                for (int i = 0; i < n; i++)
                    System.out.println(curr.path.get(i).j1 + " , " + curr.path.get(i).j2);

                return;
            }
            queue.offer(new Pair(jug1, 0, curr.path));
            queue.offer(new Pair(0, jug2, curr.path));

            queue.offer(new Pair(jug1, curr.j2, curr.path));
            queue.offer(new Pair(curr.j1, jug2, curr.path));

            queue.offer(new Pair(0, curr.j2, curr.path));
            queue.offer(new Pair(curr.j1, 0, curr.path));

            int emptyJug = jug2 - curr.j2;
            int amountTransferred
                    = Math.min(curr.j1, emptyJug);
            int j2 = curr.j2 + amountTransferred;
            int j1 = curr.j1 - amountTransferred;
            queue.offer(new Pair(j1, j2, curr.path));

            emptyJug = jug1 - curr.j1;
            amountTransferred = Math.min(curr.j2, emptyJug);
            j2 = curr.j2 - amountTransferred;
            j1 = curr.j1 + amountTransferred;
            queue.offer(new Pair(j1, j2, curr.path));
        }

        System.out.println("Not Possible to obtain target");
    }

}
