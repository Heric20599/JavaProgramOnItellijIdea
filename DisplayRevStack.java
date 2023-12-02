package STACKS;

import java.util.Arrays;
import java.util.Stack;

public class DisplayRevStack {
    public static void pustAtbootom(Stack<Integer>st,int x){
        if(st.size()==0){
            st.push(x);
        }else{
            int top =st.peek();
            st.pop();
            pustAtbootom(st,x);
            st.push(top);
        }
    }
    public static void emst(Stack<Integer>st){
        if(st.size()==0)return ;
        int top=st.pop();
        emst(st);

    }
    public static void revstack(Stack<Integer>st){
        if(st.size()==1) return;;
          int top =st.peek();
           st.pop();
           revstack(st);
            pustAtbootom(st,top);
    }
    public static void removefrombottom(Stack<Integer>st){
        if(st.size()==1){
            st.pop();
            return ;
        }
        int top =st.pop();
        removefrombottom(st);
        st.push(top);
    }
    public static void removefromanyindex(Stack<Integer>st,int idx){
        if(st.size()==idx+1){
            st.pop();
            return ;
        }
        int top=st.pop();
        removefromanyindex(st,2);
        st.push(top);
    }

    public  static void disrevst(Stack<Integer>st){
        if(st.size()==0) return ;
        int x=st.pop();
        System.out.print(x+" ");
        disrevst(st);
        st.push(x);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> rt = new Stack<>();
        st.push(23);
        st.push(34);
        st.push(98);
        st.push(25);
        st.push(65);
        st.push(95);
        System.out.println(st);
        //disrevst(st);
       revstack(st);
      //  emst(st);
       //pustAtbootom(st,39);
        //removefrombottom(st);
        //removefromanyindex(st,2);
        System.out.println(st);


    }
}
