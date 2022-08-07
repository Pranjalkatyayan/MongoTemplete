package Programming_Practise_5;

public class LinkedList{

    public static class Node {
        int number;
        Node next;
    }
        int size;
        Node head;

        public void  addANodeAtLast(int val){

            Node node=new Node();
            node.number=val;
            node.next=null;
            if(head==null){
                head=node;
            }
            else{
                Node curr=head;
                while(curr.next!=null){
                    curr=curr.next;
                }
                curr.next=node;
                node.next=null;
            }
            size++;
        }
        public void reverseList(){

            Node prev=null;
            Node curr = head;

            while(curr!=null){

                Node next=curr;
                curr.next=prev;
                curr=prev;
                curr=next;

            }
           Node head=curr;

        }
        public static void main(String[] args){

            LinkedList list=new LinkedList();
            list.addANodeAtLast(10);
            list.addANodeAtLast(20);
            list.addANodeAtLast(30);
            list.addANodeAtLast(40);
            list.addANodeAtLast(50);
            System.out.println(list);
            list.reverseList();
            System.out.println(list);

        }



}
