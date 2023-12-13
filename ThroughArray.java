package STACKS.Implementation;

public class ThroughArray {
    public static class Stack {
        private int[] arr = new int[5];
        private int idx = 0;
        int size=0;

        void push(int x) {
            if (idx == arr.length) {
                System.out.println("stack is overflow");
            } else
                arr[idx] = x;
            idx++;
            size++;
        }

        int pop() {
            if (idx == 0) {
                System.out.println("stack is empty we cant delete element from stack");
                return -1;
            }
            int top = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;
            size--;
            return top;
        }

        int peek() {
            if (idx == 0) {
                System.out.print("stack is empty");
                return -1;
            }
            return arr[idx - 1];
        }

        void display() {
            for (int i = 0; i <= idx - 1; i++) {
                System.out.print(arr[i] + "-> ");
            }
            System.out.println();
        }
    }


        public static void main(String[] args) {
            Stack st = new Stack();
            st.push(3);
            st.push(4);
            st.push(5);
            System.out.println(st.size);
          // st.display();
          //  st.pop();
            //st.display();
           // st.size();


        }
    }

