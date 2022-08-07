package Programming_Practise_6;

public class LinkedList {

    int size=0;
    Node head;
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void AddAtFirst(int val){
        if(head==null){
            Node node=new Node(val);
            head=node;
        }
        else{
            Node node=new Node(val);
            node.next=head;
            head=node;
        }
        size++;
    }
    public void AddAtLast(int val){
        if(head==null){
            Node node=new Node(val);
            head=node;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            Node newNode=new Node(val);
            temp.next=newNode;
        }
        size++;
    }
    public void removeFirst(){
      if(head==null){
          return;
      }
      else if(size==1){
          head=null;
      }
      else{
          Node temp=head;
          temp=temp.next;
          head=temp;
      }
      size--;
    }
    public void removeLast(){
        if(head==null){
            return;
        }
        else if(size==1){
            head=null;
        }
        else {
            Node temp=head;

            while (((temp.next).next!=null)){
               temp=temp.next;
            }
            temp.next=null;
        }
        size--;
    }
    public void findMiddleElement(){
        int middleIndex=size/2;
        int i=0;
        Node temp=head;
        while(i<middleIndex){
            temp=temp.next;
            i++;
        }
        int data=temp.data;
        System.out.println(data);
    }
    public void AddAfterNode(int val,int index){

        Node temp=head;
        int i=0;
        while(i<index){
            temp=temp.next;
            i++;
        }
        Node newTemp=new Node(val);
        newTemp.next=temp;
        temp.next=newTemp;
        temp=null;
    }
    public void BeforeANode(int val,int valueBefore){
        Node temp=head;
        while((temp.next).data!=valueBefore){
            temp=temp.next;
        }
        Node newTemp=new Node(val);
        newTemp.next=temp;
        temp.next=newTemp;
    }
    public void removeANode(int val){
        Node temp=head;
        while((temp.next).data!=val){
            temp=temp.next;
        }
        temp.next=(temp.next).next;
    }
    public void displayList(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args){

        LinkedList list=new LinkedList();
        list.AddAtFirst(40);
        list.AddAtFirst(30);
        list.AddAtFirst(20);
        list.AddAtFirst(10);
        list.AddAtLast(50);
        list.removeANode(50);
        list.displayList();

        //list.AddAfterNode(35,2);
       // list.BeforeANode(25,30);

        //list.removeFirst();
       //list.removeLast();
        //list.findMiddleElement();
        System.out.println(list);

    }
}
