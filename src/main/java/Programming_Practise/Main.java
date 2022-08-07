package Programming_Practise;
import java.io.*;

import java.util.*;

import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception {


        Scanner sc=new Scanner(System.in);

        int sizeOfFirstArray=sc.nextInt();
        int array1[]=new int[sizeOfFirstArray];

        for(int i=0;i<sizeOfFirstArray;i++){

            array1[i]=sc.nextInt();
        }
        int sizeOfSecoendArray=sc.nextInt();
        int array2[]=new int[sizeOfSecoendArray];

        for(int i=0;i<sizeOfSecoendArray;i++){

            array2[i]=sc.nextInt();

        }
        call(array1,array2);


    }

    public static void call(int[] a,int[] b){


        int n1 = a.length;
        int n2 = b.length;


        int sum[] = new int[n2];
        int i = n1 - 1;
        int j = n2 - 1;
        int k = sum.length - 1;


        while (j >= 0 && i>=0) {

            if(b[j]>=a[i]){
                sum[k]=b[j]-a[i];
            }
            else{
                b[j]=b[j]+10;
                sum[k]=b[j]-a[i];
                b[i-1]=b[i-1]-1;

            }

            i--;
            k--;
            j--;

        }



        for (i = 0; i < sum.length; i++) {
            System.out.println(sum[i]);
        }

    }

}
/*
public class Main
{
    public static void display (int[]a)
    {
        StringBuilder sb = new StringBuilder ();
        for (int val : a)
        {
            sb.append (val + " ");
        }
        System.out.println (sb);
    } public static void reverse (int[]a, int i, int j) //helper function reverse
//takes two parameters to denote the parts, from where to where the array is to be reversed at a time
{
    while (i < j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        ++i;
        --j;
    }
}

    public static void main (String[]args) throws Exception
    {
        int a[]={1,2,3,4,5};
        int k = 2;
        rotate (a, k);
        display (a);
    }
    public static void rotate (int[]a, int k)
    {

        k = k % a.length;

        if (k < 0){
            k += a.length;
        }

        System.out.println("Original Array");
        display(a);
        //reverse part 1
        reverse (a, 0, a.length - k - 1);
        System.out.println("1st Change");
        display (a);


        //reverse part 2
        reverse (a, a.length - k, a.length - 1);
        System.out.println("2nd Change");
        display (a);

        //reverse the whole array
        reverse (a, 0, a.length - 1);
        System.out.println("Final Change");
        display (a);

    }

}

/*
public class Main {

    public static void main(String[] args) throws Exception {

        int a[]={1,2,3,4,5,7,8};

        int noOfRotation = 2;
        noOfRotation = noOfRotation % (a.length);

        if(noOfRotation>0){ //right rotation
            int count=0;
            while(count<noOfRotation){

                int temp=a[a.length-1];
                for(int i=a.length-2;i>=0;i--){
                    a[i+1]=a[i];
                }
                a[0]=temp;
                count++;
            }

        }
        else{ //left rotation

            int count=0;
            while(count<(noOfRotation * -1)){

                int temp=a[0];
                for(int i=0;i<a.length-1;i++){
                    a[i]=a[i+1];
                }
                a[a.length-1]=temp;
                count++;
            }
            

        }

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}

 */
/*
                Scanner sc=new Scanner(System.in);

                int sizeOfFirstArray=sc.nextInt();
                int array1[]=new int[sizeOfFirstArray];

                for(int i=0;i<sizeOfFirstArray;i++){

                    array1[i]=sc.nextInt();
                }
                int sizeOfSecoendArray=sc.nextInt();
                int array2[]=new int[sizeOfSecoendArray];

                for(int i=0;i<sizeOfSecoendArray;i++){

                    array2[i]=sc.nextInt();

                }
                call(array1,array2);


            }

            public  static void call(int[] array1,int[] array2){



                int maxArray[];
                int minArray[];

                if(array1.length>array2.length){
                    maxArray=array1;
                    minArray=array2;

                }
                else{
                    maxArray=array2;
                    minArray=array1;
                }

                int count=minArray.length-1;
                for(int i=maxArray.length-1;i>=0;i--) {

                    if (count >= 0) {
                        maxArray[i] = maxArray[i] + minArray[count];
                        count--;
                    }
                }


                for (int i=0;i<maxArray.length;i++){
                    System.out.println(maxArray[i]);
                }


            }



}

 */
/*
   int array1[]={2,2,2};
   int array2[]={2,2};


   int maxArray[];
   int minArray[];

   if(array1.length>array2.length){
       maxArray=array1;
       minArray=array2;

   }
   else{
       maxArray=array2;
       minArray=array1;
   }

       int count=minArray.length-1;
       for(int i=maxArray.length-1;i>=0;i--) {

           if (count >= 0) {
               maxArray[i] = maxArray[i] + minArray[count];
               count--;
           }
       }


   for (int i=0;i<maxArray.length;i++){
       System.out.println(maxArray[i]);
   }

    }

}

 */
/*
public class Main{

    public static void main(String[] args) throws Exception {

        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int array[]=new int[size];

        for(int i=0;i<size;i++){

            array[i]=sc.nextInt();
        }
        int max=array[0];
        for (int i=0;i<size-1;i++){
            if(array[i+1]>max){
                max=array[i+1];
            }
        }



        int rows=max;
        int column=max;

        char matrix[][]=new char[rows][column];

        int col=0;
        int rowsToTraverse;
        int i=0;

        while(col>size){
            i=0;
            rowsToTraverse=max-array[i];
            rows=rows-1;
            while(array[i]>0 && rows>=rowsToTraverse){

                matrix[rows][col]='*';
                rows--;
                array[i]--;


            }
            col++;
            i++;
        }

        for( i=0;i<size;i++){

            for(int j=0;j<size;j++){

                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }


    }

}

 */
/*
public class Panindrome {

    public static void main(String[] args) {


        String s= "He is a very very good boy, isn't he?";

        for(int i=0;i<s.length()-1;i++){

            if((s.charAt(i)>=65 && s.charAt(i)<=90) || s.charAt(i)>=97 && s.charAt(i)<=122){

            }
            else{

            }
        }


    }

    }

 */
/*
        int no=8;
        int base=3;
        int rem;
        List<Integer> list=new ArrayList<>();
        while (no>0){

            rem=no%base;
            list.add(rem);
            no=no/base;


        }
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i));
        }
    }
}

 */
/*
        Scanner scn = new Scanner(System.in);
        int n = 201202012;
        int b = 3;

        int rem;
        int no=0;
        int power=0;

        while(n>0){

            rem=n%10;

            if(rem>0){

                no= no +rem*(int) Math.pow(b,power);
            }
            power++;
            n=n/10;


        }
        System.out.println(no);
    }
}

 */
/*
        List<Integer> list=new ArrayList<>();

        int rem;
        while(n>0){

            rem=n%b;
            list.add(rem);
            n=n/b;
        }

        int no=0;
        for(int i=(list.size()-1);i>=0;i--){
            no= no*10 +list.get(i);
        }
        System.out.print(no);
    }


}


 */
/*
    public static void main(String agrs[]) {

        //Lexographic
        String firstWord="apple";
        String SecWord="applea";
        int counter=0;
        int i;
        int sizeOf1st=firstWord.length();
        int sizeOf2nd=SecWord.length();
        int smallersize;

        if(sizeOf1st>sizeOf2nd){
            smallersize=sizeOf2nd;
        }
        else {
            smallersize=sizeOf1st;
        }
        for ( i=0;i<smallersize;i++){

            char fromFirstWord=firstWord.charAt(i);
            char fromSecoendWord=SecWord.charAt(i);

            if(fromFirstWord>fromSecoendWord){

                counter=1; //Reverse kar do
                break;
            }
            if(firstWord.charAt(i)==SecWord.charAt(i)){

                if(i==(smallersize-1) && (firstWord.charAt(smallersize-1)==SecWord.charAt(smallersize-1))){
                    counter=0;
                    break;

                }
                continue;
            }

        }
        if(counter==1 ){

            System.out.println(firstWord+" "+SecWord+  " \nReverse the order\n" +"The word in dictoniary will appear as\n" +SecWord+ " "+ firstWord);
        }
        if(counter==0){
            System.out.println(firstWord+" "+SecWord+"The word in dictoniary will appear as " +firstWord+ " "+ SecWord);

        }
    }
}

 */
/*package Programming_Practise;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        int sizeOfA=A.length();
        int sizeOfB=B.length();

        System.out.println(sizeOfA+sizeOfB);

        String output=decidelexoGrapic(A,B);
        System.out.println(output);

        char firstA=(char)(A.charAt(0)-32);
        char secoendB=(char)(B.charAt(0)-32);

        String newA = firstA+(A.substring (1));
        String newB = secoendB+(B.substring (1));
        System.out.println(newA+ " "+ newB);


    }

    public static String decidelexoGrapic(String A,String B){

        String firstWord=A;
        String SecWord=B;
        int counter=0;
        int i;
        int sizeOf1st=firstWord.length();
        int sizeOf2nd=SecWord.length();
        int smallersize;
        String output="";

        if(sizeOf1st>sizeOf2nd){
            smallersize=sizeOf2nd;
        }
        else {
            smallersize=sizeOf1st;
        }

        for ( i=0;i<smallersize;i++){

            char fromFirstWord=firstWord.charAt(i);
            char fromSecoendWord=SecWord.charAt(i);

            if(fromFirstWord>fromSecoendWord){

                counter=1; //Reverse kar do
                break;
            }
           else if(firstWord.charAt(i)==SecWord.charAt(i)){

                if(i == (smallersize-1) ){
                    counter=0;
                    break;

                }
                continue;
            }
           else {
                counter=0; // decision ho gaya dictionary jaise hi hai
                break;

            }

        }

        if(counter==1 ){

            output="Yes";

        }
        if(counter==0){

            output="No";


        }
        return output;
    }
}


 */