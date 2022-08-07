package Programming_Practise;
public class BarChart {

    public static void main(String[] args){

        int a[]={7,0,0,0,9};
        int column=a.length;
        int rows=findMaxNoInArray(a);
        System.out.println(rows);
        char matrix[][]=new char[rows][column];
        int k=0;

        for(int i=0;i<column;i++){

           int val=a[k];
           for(int j=0;j<val;j++){
            matrix[rows-1-j][i]='*';

           }
          k++;
        }
       for(int i=0;i<rows;i++){
           for(int j=0;j<column;j++){
               if(matrix[i][j]!='*'){
                   System.out.print(" " +" ");
               }
               else{
                   System.out.print(matrix[i][j]+" ");
               }

           }
           System.out.println();
       }
    }

    private static int findMaxNoInArray(int[] a) {

        int max=a[0];
        for(int i=0;i<a.length;i++){

            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
}
