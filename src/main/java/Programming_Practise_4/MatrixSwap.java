package Programming_Practise_4;

public class MatrixSwap {
    public static void main(String[] args){
        int matrix[][]={{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        int output[][]=new int[3][3];

        int newcol=2;
        for(int row=0;row<3;row++){
            int newrow=0;
            for(int col=0;col<3;col++){
                output[newrow][newcol]=matrix[row][col];
                newrow++;
            }
            newcol--;
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(output[i][j]);
            }
            System.out.println();
        }


    }
}
