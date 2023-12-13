package STACKS.Implementation;

public class ThroughLinkedlist {
    public static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public static class LLstacks {
        Node head = null;
        int size = 0;

        void push(int val) {
            Node temp = new Node(val);
            temp.next = head;
            head =temp;
            size++;

        }

        int size() {
            return size;

        }
        int pop(){
            if(size==0){
                System.out.print("empty");
                return -1;
            }
            int x=head.val;
            head=head.next;
            return x;
        }
        int peek(){
            if(size==0){
                System.out.print("empty");
                return -1;
            }
            return head.val;
        }

        void displayRES() {
            if(size==0){
                System.out.print("empty");
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();

        }
        void  displayrev(Node h){
            if(h==null)return;
            displayrev(h.next);
            System.out.print(h.val+" ");
        }



        void display(){
            displayrev(head);
            System.out.println();

        }


    }


    public static void main(String[] args) {
        LLstacks st=new LLstacks();
        st.push(10);
        st.push(80);
        st.push(78);
        st.push(67);
        st.pop();
        System.out.println(st.peek());

        st.display();
        System.out.println(st.size);

    }
}
