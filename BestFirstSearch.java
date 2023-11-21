package AIASSIGNMENT;

import java.util.Comparator;
import java.util.PriorityQueue;

public class BestFirstSearch {
    public static class Node {
        Node prev;
        int[][] mat = new int[3][3];
        int row;
        int col;
        int h;
        int g;
    }

    public static int[] Row = { -1,0,1,0};
    public static int[] Col = { 0,1,0,-1};

    //Calculating h which is the deviation of initialState from goalState.
    public static int heuristic(int[][] initialState, int[][] goalState) {
        int h = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (initialState[i][j] != 0 && initialState[i][j] != goalState[i][j]) {
                    h++;
                }
            }
        }
        return h;
    }
    //check if the given Problem is Solvable or not.
    public static int countInversions(int[][] state) {
        int[] arr = new int[9];
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[k++] = state[i][j];
            }
        }

        int inversions = 0;
        for (int i = 0; i < 9 - 1; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (arr[i] != 0 && arr[j] != 0 && arr[i] > arr[j]) {
                    inversions++;
                }
            }
        }

        return inversions;
    }

    public static boolean isSolvable(int[][] initialState, int[][] goalState) {
        int inversionsInitial = countInversions(initialState);
        int inversionsGoal = countInversions(goalState);

        return (inversionsInitial % 2 == inversionsGoal % 2);
    }

    public static void swap(int[][]mat,int rOld,int cOld,int rNew,int cNew){
        int temp=mat[rOld][cOld];
        mat[rOld][cOld]=mat[rNew][cNew];
        mat[rNew][cNew]=temp;
    }

    // Creating a node for each new Matrix
    public static Node createNode(Node prev, int[][] matrix, int row, int col, int rowNew, int colNew, int g) {
        Node myNode = new Node();
        myNode.prev = prev;
        myNode.mat = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                myNode.mat[i][j] = matrix[i][j];
            }
        }
        swap(myNode.mat,row,col,rowNew,colNew);

        myNode.row= rowNew;
        myNode.col = colNew;
        myNode.h = Integer.MAX_VALUE;
        myNode.g = g;
        return myNode;
    }

    //print the Path from root to the end Using Recursion.
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printPath(Node node) {
        if (node == null) {
            return;
        }
        printPath(node.prev);
        printMatrix(node.mat);
        System.out.println();
    }

    //creation of PriorityQueue.

    public static class comp implements Comparator<Node> {
        @Override
        public int compare(Node nd1, Node nd2) {
            return (nd1.h + nd1.g) > (nd2.h + nd2.g) ? 1 : -1;
        }
    }

    // eight puzzle problem solver.
    public static void solve(int[][] initialState, int[][] goalState, int row, int col) {
        PriorityQueue<Node> pq = new PriorityQueue<>(new comp());
        Node rootNode = createNode(null, initialState, row, col, row, col, 0);
        rootNode.h = heuristic(initialState, goalState);

        pq.add(rootNode);

        while (!pq.isEmpty()) {
            Node node = pq.remove();
            if (node.h == 0) {
                printPath(node);
                return;
            }
            for (int i = 0; i < 4; i++) {

                int newRow=node.row + Row[i];
                int newCol=node.col + Col[i];
                if (newRow >= 0 && newRow < 3 && newCol >= 0 && newCol < 3) {
                    Node newNode = createNode(node, node.mat, node.row, node.col, newRow, newCol, node.g + 1);
                    newNode.h = heuristic(newNode.mat, goalState);
                    pq.add(newNode);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Given initialState Matrix and goalState Matrix .Blank cell is denoted by 0.


        int[][] initialState = { { 1, 2, 3 }, { 8, 0, 4 }, { 7, 6, 5 } };
        int[][] goalState = { { 2,8,1 }, { 0, 4, 3 }, { 7, 6, 5 } };

        // Initial position of Blank Cell.
        int row = 1, col = 1;

        // Check if The puzzle is Solvable.
        if(!isSolvable(initialState, goalState)){
            System.out.print("Puzzle is not Solvable!!!!");
            return;
        }
        // Solving 8 Puzzle Problem using A* Algorithm.
        solve(initialState, goalState, row, col);
    }
}
