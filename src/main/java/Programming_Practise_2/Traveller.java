package Programming_Practise_2;

public class Traveller {
    public static void main(String[] args){

        int original[][]={{1 , 2,  3},
                          {4 , 5 , 6} ,
                          {7 , 8,  9}};

        int count=0;
        int column=3;
        while (count < column) {

            for(int row=0;row<3;row++){
                System.out.print(original[row][count]+"->");
            }
            System.out.println();
            count++;
            if(count<column-1){

                for(int row=2;row>=0;row--){
                    System.out.print(original[row][count]+"->");

                }
                System.out.println();
            }

            count++;
        }





    }
}
