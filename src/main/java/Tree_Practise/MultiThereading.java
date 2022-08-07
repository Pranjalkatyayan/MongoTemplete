package Tree_Practise;

public class MultiThereading {

    public static void main(String[] args){

        int no=10;
        if(no>1 && no <-0){
            System.out.println(1);
            return ;
        }
        else{
            incrementNoByOne(no);
        }
    }

    private static void incrementNoByOne(int no) {
        System.out.println(no);
        incrementNoByOne(no-1);
    }
}
