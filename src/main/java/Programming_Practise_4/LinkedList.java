package Programming_Practise_4;

public class LinkedList {

     Node head;

    public class Node{
        String data;
        Node next;

        public  Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    public void addFirst(String data){

        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

            newNode.next=head;
            head=newNode;
    }
    public void addLast(String data){

        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        else{

            Node currentNode=head;
            while(currentNode.next!=null){

               currentNode= currentNode.next;
            }
            currentNode.next=newNode;
        }
    }
    public void printAll(){

     Node currentNode=head;
     if(head==null){
         System.out.println("List is Empty");
         return;
     }

     while(currentNode !=null){
         System.out.print(currentNode.data + " ");
         currentNode=currentNode.next;
     }
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("No List exists");
            return;
        }
        head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("No list exists");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }

        Node curr=head;
        Node previous=null;
        while(curr.next!=null){
            previous=curr;
            curr=curr.next;
        }
        previous.next=null;
    }
    public void deleteAString(String data){

        Node curr=head;
        Node prev=null;
        if(head==null){
            System.out.println("No List Exists");
            return;
        }
        if(head.data.equalsIgnoreCase(data)){
            System.out.println("Head was itself the data");
            head=null;
        }
        while (curr!=null && !curr.data.equals(data)){
            prev=curr;
            curr=curr.next;
        }
        prev.next=curr.next;

    }

    public static void main(String[] args){
        LinkedList list=new LinkedList();
        // list.deleteFirst();
        // list.deleteLast();
        // list.addFirst("Ram");
        list.addFirst("I am");
        list.addLast("hot");
        list.addLast("boy");
        list.printAll();
        list.deleteAString("hot");
        list.printAll();


    }
}

