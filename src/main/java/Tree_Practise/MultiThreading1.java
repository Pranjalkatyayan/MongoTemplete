package Tree_Practise;

public class MultiThreading1 extends  Thread{


    public static void main(String[] args) {

        for(int i=0;i<5;i++){
            Thread t1=new Thread();
            System.out.println("The Thread Count "+i+" "+t1.getId());


        }
    }
}
