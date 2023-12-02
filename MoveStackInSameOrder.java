package STACKS;

import java.util.Scanner;
import java.util.Stack;

public class MoveStackInSameOrder {
    public static void main(String[] args) {
        Stack <Integer> st=new Stack<>();
        st.push(23);
        st.push(34);
        st.push(98);
        st.push(25);
        st.push(65);
        st.push(95);
        Stack <Integer> rt=new Stack<>();
        Stack <Integer> kt=new Stack<>();

        System.out.println(st);

        while(st.size()>0){
            rt.push(st.pop());
        }
        //System.out.println(st);    this will give empty cz noe this stack is empty
        System.out.println(rt);

        while(rt.size()>0){
            kt.push(rt.pop());
        }
        System.out.println(kt);

    }
}


// to inert the element by the user

//        Scanner sc=new Scanner(System.in);
//        int n;
//        System.out.println("enter the number of element want to insert in stack");
//        n=sc.nextInt();
//        System.out.println("enter the element");
//        for(int i=1;i<=n;i++){
//            int x= sc.nextInt();
//            st.push(x);
//        }
//        System.out.println(st);
