package LINKEDLIST.Implementation.Array;

public class LL {
    public static class linkedlist{
        Node head =null;
        Node tail= null;
        void insertAtfirst(int data ){
            Node temp = new Node(data);
            if(head==null){
                head=temp;
                tail=temp;
            }else{
                temp.next=head;
                head=temp;
            }

        }
        void deleteAtindex(int index){
            if (index < 0 || index > size()) {
                System.out.println("chal be ghodu");
                return;
            }else{
                Node temp=head;
                for (int i =1; i <=index-1 ; i++) {
                    temp=temp.next;
                }
                temp.next=temp.next.next;
            }
        }
        int getElement(int index) {
            Node temp = head;
            for (int i = 1; i <= index-1; i++) {
                    temp = temp.next;
                }
                return temp.data;
        }
        void insertAtend(int data){
            Node temp =new Node(data);
            if(head==null){
                head=temp;
                tail=temp;
            }else{
                tail.next=temp;
                tail=temp;
            }
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp= temp.next;
            }
        }
        Node rev(int val){
            Node curr=head;
            Node prev=null;
            Node agla=null;
            while(curr!=null){
                agla=curr.next;
                curr.next=prev;
                prev=curr;
                curr=agla;
            }
            return prev;

        }
          void elementAtindex(int index,int data){
            Node t= new Node(data);
            Node temp=head;
            if(index==size()){
                insertAtend(data);
                return;
            }
            if(index==0){
                insertAtfirst(data);
                return;
            } else if (index<0||index>size()) {
                System.out.println("chal be chodu");
            }
              for(int i=1;i<=index-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;

          }
        int size(){
            Node temp=head;
            int count =0;
            while(temp!=null){
                count=count +1;
                temp=temp.next;
            }
            return count;
        }

    }

    public static class Node{
        int data ;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtfirst(89);
        ll.insertAtfirst(90);
        ll.insertAtfirst(67);
        ll.insertAtfirst(45);
        ll.insertAtend(79);
        ll.elementAtindex(3,66);
        ll.elementAtindex(0,99);
        ll.elementAtindex(7,44);
        ll.display();
        System.out.println();
       // ll.rev(99);
      //  System.out.println(ll.getElement(7));
       // ll.elementAtindex(-3,99);         if someone made a mistake of wrong index this case return u gave wrong input
//        System.out.println(ll.tail.data);
//        System.out.println(ll.head.data);
        ll.display();
//        System.out.println();
//        System.out.print("linkedlist has size "+ll.size());


    }
}
