package Programming_Practise_4;

import org.springframework.core.annotation.SynthesizedAnnotation;

public class LinkedList2 {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        public void addFirst(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = head;
            head = temp;

            if (size == 0) {
                tail = temp;
            }

            size++;
        }

        public void display() {
            for (Node temp = head; temp != null; temp = temp.next) {
                System.out.print(temp.data + " ");
            }
            System.out.println();
        }

        public void removeAt(int idx) {

            if (size == 0) {
                System.out.println("List is empty");
            } else if (idx >= size || idx < 0) {
                System.out.println("Invalid arguments");
            } else {
                Node dest=goToIndex(idx);
                Node source=goToIndex(idx-1);
                source.next=dest.next;
            }
        }

        private Node goToIndex(int index) {
            int i=0;
            Node temp=head;
            while(i<index){
                temp=temp.next;
                i++;
            }
            return temp;
        }
    }
        public static void main(String[] args){

        LinkedList list=new LinkedList();
        list.addFirst(40);
        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);
        list.display();
        list.removeAt(2);
        list.display();
    }
}
