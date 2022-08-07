package Tree_Practise;

import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.web.bind.annotation.PostMapping;

public class CreateABinaryTree {

    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static int index=-1;
    public static Node createABinaryTree(int data[]){
        index++;
        if(data[index]==-1){
            return null;
        }
        Node newNode=new Node(data[index]);
        newNode.left=createABinaryTree(data);
        newNode.right=createABinaryTree(data);
        return newNode;
    }
    
    public static void PreOrder(Node root){
        if(root==null){
            System.out.print("-1 ");
            return;
        }
        System.out.print(root.data+ " ");
        PreOrder(root.left);
        PreOrder(root.right);
    }

    public static void InOrder(Node root){
        if(root==null){
            System.out.print("-1 ");
            return;
        }
        InOrder(root.left);
        System.out.print(root.data+" ");
        InOrder(root.right);
    }

    public static void PostOrder(Node root){
        if(root==null){
            System.out.print("-1 ");
            return;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args){
        int data[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        CreateABinaryTree tree=new CreateABinaryTree();
        Node root=createABinaryTree(data);
        System.out.println();
        PreOrder(root);
        System.out.println();
        InOrder(root);
        System.out.println();
        PostOrder(root);

    }

}
