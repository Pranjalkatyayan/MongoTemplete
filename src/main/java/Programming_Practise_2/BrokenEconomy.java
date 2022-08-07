package Programming_Practise_2;

import org.springframework.data.mongodb.core.aggregation.ArrayOperators;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BrokenEconomy {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int row1=sc.nextInt();
        int column1=sc.nextInt();
        int matrix1[][]=new int[row1][column1];

        for(int i=0;i<row1;i++){
            for(int j=0;j<column1;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }

        int row2=sc.nextInt();
        int column2=sc.nextInt();
        int matrix2[][]=new int[row2][column2];

        for(int i=0;i<row2;i++){
            for(int j=0;j<column2;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }

        int output[][]=new int[row1][column2];
        for(int i=0;i<row1;i++){

            for (int j=0;j<column2;j++){

                output[i][j]=matrix1[i][j]*matrix2[j][i];
            }

        }







    }
}
  /*
        Scanner sc=new Scanner(System.in);
        int noOfRows=sc.nextInt();
        int noOfColumn=sc.nextInt();
        List<Integer> list=new ArrayList<>();
        int matrix[][]=new int[noOfRows][noOfColumn];


        for(int i=0;i<noOfColumn*noOfRows;i++){

            int input=sc.nextInt();
            list.add(input);
        }
        int count=0;
        for(int row=0;row<noOfRows;row++){
            for (int column=0;column<noOfColumn;column++){
                matrix[row][column]=list.get(count);
                count++;
            }
        }

    }
}

 */
  /*
        List<Integer> list=new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        list.add(3);
        list.add(12);
        list.add(13);
        list.add(15);

      for(Integer element:list){
          if(noIsPrime(element)){
              output.add(element);
          }
      }
      list.clear();
      list.addAll(output);
        for(Integer element1:list){
            System.out.println(element1);
        }


    }



    private static boolean noIsPrime(Integer number) {

        for(int i=2;i<number;i++){
            int reminder=number%i;
            if(reminder==0){
                return false;
            }
        }
        return true;
    }
}

 */
  /*
        String a="pepCODinG";
        //p-11e11p-45C12O-11D37i5n-39G
        for(int i=0;i<a.length()-1;i++){

            System.out.print(a.charAt(i) +""+((int)(a.charAt(i+1)-a.charAt(i))));
        }
        System.out.println(a.charAt(a.length()-1));

    }

}

         */
  /*
        String a="ABCDEBVBVBVBVBVBVBVBNCNCNCNCKSKSKSKDJDJDJFHFHFHFGAGAGAGAGAQYQYQYQYQYQYQYIWIWIWIW";
        String toggle="";

        for(int i=0;i<a.length();i++){

            if(a.charAt(i)>=65 && a.charAt(i)<=90){
                toggle=toggle+(char)(a.charAt(i)+32);
            }
            if(a.charAt(i)>=97 && a.charAt(i)<=122){
                toggle=toggle+(char)(a.charAt(i)-32);
            }
        }
        System.out.println(toggle);

    }
}

 */
  /*

        String a= "aaaaaaabbbbbbccccccddddwwqqrec";
        int count=1;
        String output="";
        output=a.charAt(0)+output;

        for(int i=1;i<a.length();i++){

            if(a.charAt(i)!=a.charAt(i-1)){
                if(count>1)
                    output= output+count+a.charAt(i);
                else
                    output= output+a.charAt(i);
                count=1;
            }
            else{
                count++;
            }
        }
        if(count!=1){
            output=output+count;
        }

        System.out.println(output);

    }
}

         */
  /*

        String output="";
        output=a.charAt(0)+output;
        for(int i=1;i<a.length();i++){

            if(a.charAt(i)!=a.charAt(i-1)){
                output=output+a.charAt(i);
            }
        }
        System.out.println(output);


 */
  /*      int a[]={5, 10, 15, 22, 33, 40, 42, 55};
        int denomination=10;

        for (int i=0;i<a.length;i++){

            if (denomination == a[0]) {
                System.out.println(a[0]);
            }
            if(denomination<a[i] && i!=0){

                System.out.println(a[i]);
                System.out.println(a[i-1]);
                break;
            }
            if(denomination<a[i] && i==0){

                System.out.println(a[i]);
                break;
            }
        }


   */
