package QUEUE.Implementation;

public class ThroughArray {
    public static class queueA {
         int f=-1;
        int r = -1;
        int size = 0;
        int[] arr= new int [90];



        Boolean isEmpty() {
            return size== 0;
        }

        Boolean isFull() {
            return size == arr.length;
        }

        void add(int val) {             // to insert the element
            if (r == arr.length - 1) {
                System.out.print("full queue");
                return;
            }
            if(f==-1) {
                f=r=0;
                arr[0]=val;
            }else {
                arr[++r] = val;
            }
            size++;
        }

        int remove() {   //to remove of element
            if (size==0) {
                System.out.print("empty queue");
                return -1;
            }
           f++;
           size--;
           return arr[f-1];
        }

        int peek(){
             if (size==0) {
                System.out.print("empty queue");
                return -1;
            }
            return arr[f];
        }
        void display() {
            if (size == 0) {
                System.out.print("empty queue");
            } else {
                for (int i = f; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }


    public static void main(String[] args) {
     queueA q=new queueA();
     q.add(34);
     q.add(45);
     q.add(56);
         q.display();
        q.remove();
        q.display();

    }


}
