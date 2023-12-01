package TREE;

import java.util.Scanner;

public class Tree {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Node root=createtree();
        Inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        Postorder(root);
        System.out.println();

    }


    public static Node createtree(){
        Node root =null;
        System.out.print("enter the data:");
        int data =sc.nextInt();
        if(data == -1){
            return null;
        }
        root =new Node(data);
        System.out.println("enter the left of :"+ data);
        root.left=createtree();
        System.out.println("enter the right of :"+ data);
        root.right=createtree();
        return root;

    }
    static void Inorder(Node root){
        if(root==null){
            return ;
        }
        Inorder(root.left);
        System.out.print(root.data);
        Inorder(root.right);
    }
    static void preorder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    static void Postorder(Node root){
        if(root==null){
            return ;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data);
    }



    static class Node{
        Node left;
        Node right;
        int data ;
        public Node(int data){
            this.data=data;
        }

    }

}
