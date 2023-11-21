package AIASSIGNMENT;

import java.util.Scanner;

public class TOH {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            toh(n, 'A', 'B', 'C');

        }
        static void toh(int n, char from, char to, char mid){
            if(n==0)
                return;
            toh(n-1, from, mid, to);
            System.out.println("Moe disk "+ n + " from rod "+ from + " to rod" + to);
            toh(n-1, mid, to, from);
        }
    }

