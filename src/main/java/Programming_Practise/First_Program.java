package Programming_Practise;

import java.util.Scanner;

public class First_Program {

    public static void main(String[] agrs) {

        String A="Ram";
        String B="Rama";

        int sizeOfA=A.length();
        int sizeOfB=B.length();

        if(sizeOfA>sizeOfB){
            int counter=0;
            int lasttime=1;
            for(int i=0;i<sizeOfB;i++){

                if(A.charAt(i)<B.charAt(i)){
                    counter++;
                    break;
                }
                if(A.charAt(i)==B.charAt(i)){
                    lasttime=1;
                    continue;
                }



            }

            if(counter==1 && lasttime==1){
                System.out.println(A + " will come first in dictornary than "+ B);
            }
            else{
                System.out.println(B + " will come first in dictornary than "+ A);
            }
        }

        else{
            int counter=0;
            int lasttime=0;
            for(int i=0;i<sizeOfA;i++){

                if(A.charAt(i)<B.charAt(i)){
                    counter++;
                    break;
                }
                if(A.charAt(i)==B.charAt(i)){
                    lasttime=1;
                    counter=0;
                }

            }

            if(counter==1 && lasttime==0){
                System.out.println(A + " will come first in dictornary than "+ B);
            }
            else{
                System.out.println(B + " will come first in dictornary than "+ A);
            }
        }
    }
}


        /*
        System.out.println("Give the max no");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int counter=0;

        for(int i=1;i<=no;i++){
            System.out.print(i);

            counter++;
            if(counter==i){
                System.out.println();
            }

        1st
        Scanner sc=new Scanner(System.in);
        int no,sum=0;
        for(int i=0;i<5;i++){

            no=sc.nextInt();
            sum=sum+no;

        }
        System.out.println("The average is"+sum/5);


        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int counter = 0;
        for (int i = 2; i < no; i++) {

            int reminder = no % i;

            if (reminder == 0) {
                System.out.println("Not Prime no is " + no);
                counter++;
                break;
            }
        }

        if (counter == 0) {

            System.out.println("Its a prime no " + no);
        }

         */
        /*    int rows=9;
        int lastcounter=rows-1;
        for(int i=0;i<rows;i++){

            for(int j=0;j<rows;j++){

                if (j==lastcounter){

                    System.out.print("* ");
                    lastcounter--;
                }

                else if (i==j){
                    System.out.print("* ");

                }
                else {

                    System.out.print("  ");
                }
            }
            System.out.println();
        }



    }
}
        /*

      //Pattern -8 -Nados.io
        int rows=8;
        int counter=rows-1;
        for(int i=0;i<rows;i++){

            for(int j=0;j<rows;j++){

                if (j==counter){

                    System.out.print("* ");
                    counter--;
                }
                else {

                    System.out.print("  ");
                }
            }
            System.out.println();
        }


    }
}

 */
        /*
        //Pattern -7
           Scanner scn = new Scanner(System.in);

        int rows=scn.nextInt();

        for(int i=0;i<rows;i++){

            for(int j=0;j<rows;j++){

                if(i==j){

                    System.out.print("* ");
                }
                else{

                    System.out.print("  ");
                }
            }
            System.out.println();
        }

         */
        /*
        //Pattern 6-Nados

        int rows = 7;
        int space = rows - 1;
        int star = 1;

        for (int i = 0; i < (rows / 2); i++) {

            int j = 0;
            int k = 0;

            while (j < space / 2) {

                System.out.print("* ");
                j++;

            }
            while (k < star) {
                System.out.print("  ");
                k++;
            }
            j = 0;
            while (j < space / 2) {

                System.out.print("* ");
                j++;

            }
            System.out.println();


            space = space - 2;
            star = star + 2;
        }
        space = 2;
        star = rows - 2;
        for (int i = (rows / 2 + 1); i < rows; i++) {


            int j = 0;
            int k = 0;

            while (j < space / 2) {

                System.out.print("* ");
                j++;

            }
            while (k < star) {
                System.out.print("  ");
                k++;
            }
            j = 0;
            while (j < space / 2) {

                System.out.print("* ");
                j++;

            }
            System.out.println();


            space=space+2;
            star=star-2;

        }

    }
}

         */
        /*
        //Pattern 5-Nados
        int rows = 99;
        int space = rows - 1;
        int star = 1;

        for (int i = 0; i <= (rows / 2); i++) {

            int j = 0;
            int k = 0;

            while (j < space / 2) {

                System.out.print("  ");
                j++;

            }
            while (k < star) {
                System.out.print("* ");
                k++;
            }
            j = 0;
            while (j < space / 2) {

                System.out.print("  ");
                j++;

            }
            System.out.println();


            space = space - 2;
            star = star + 2;
        }

        space = 2;
        star = rows - 2;

        for (int i = (rows / 2 + 1); i < rows; i++) {


            int j = 0;
            int k = 0;

            while (j < space / 2) {

                System.out.print("  ");
                j++;

            }
            while (k < star) {
                System.out.print("* ");
                k++;
            }
            j = 0;
            while (j < space / 2) {

                System.out.print("  ");
                j++;

            }
            System.out.println();


            space=space+2;
            star=star-2;

        }


    }
}

 */
        /*
        Scanner scn = new Scanner(System.in);

        int rows = 5;
        int noOfSpace = 0;
        int noOfStars = rows;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < noOfSpace; j++) {

                System.out.print("    ");
            }


            for (int j = 0; j < noOfStars; j++) {

                System.out.print("*   ");

            }

            System.out.println();
            noOfSpace++;
            noOfStars--;

        }

    }
}

         */
        /*
        int n = 9809876;
        int newNumber=0;

        while(n>0){

            int rem=n%10;
            if(rem==0){
                rem=5;
            }
            newNumber=newNumber*10 + rem;
            n=n/10;
        }
        System.out.println(newNumber);


        int reversedNo=0;
        while(newNumber>0){


            int rem=newNumber%10;
            reversedNo=reversedNo*10+rem;
            newNumber=newNumber/10;
        }

        System.out.println(reversedNo);

    }
}


         */
        /* int n1=1192;
        int n2=9983;
        int reminder;

        reminder=n2%n1;

        if(reminder==0){
            System.out.println("HCF is "+n1);
        }
        else{

            while (reminder!=0){

                n2=n1;
                n1=reminder;

                reminder=n2%n1;

            }
            System.out.println("Hcf is "+ n1 );

        }

        */
        /*
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size");
        int no= sc.nextInt();

        for(int i=0;i<=no;i++){
            System.out.print("* ");
        }
        int j=1,k=0;
        while(k<(no-j)){
            System.out.println(" ");
            if(k==j){
                System.out.println();
            }
            j++;
        }

        for (int i=0;i<=no;i++){
            System.out.print("* ");
 */
        /*
        for(int i=0;i<row;i++){

            for(int j=0;j<=i;j++){
                    System.out.print("* ");

            }
            System.out.println();
        }

        while(row<number){

            int column=0;
            while (column<=row){
               System.out.print("* ");
               column++;
            }
            System.out.println();
            row++;
        }

        */
        /*
        int row=5;
        int column=0;

        for(int i=0;i<row;i++){

            for(int j=5;j>=i;j--){

                System.out.print("* ");
            }
            System.out.println();
        }
        int row=3;
        for(int i=0;i<=3;i++){

            for(int j=3;j>i;j--){

                System.out.print("* ");
            }
            if(i!=row){
                System.out.println();
            }

        }
        for(int i=1;i<row;i++){

            for(int j=0;j<=i;j++){
                System.out.print("* ");

            }
            System.out.println();
        }


        int row=5;
        int maxcolumn=5;
        for(int i=0;i<row;i++){

            for(int j=0;j<maxcolumn;j++){

                System.out.print("_");
            }
            System.out.println();
        }


         */
        /*
        int n=3;
        int row=1;
        while(row<=n){

            int counter=1;
            while(counter<n-row){
                System.out.print("   ");
                counter++;
            }
            counter=1;
            int value=1;
            while (counter<=(2*row)-1)
            {

                System.out.print(value);
                counter++;
                value++;
            }
            System.out.println();
            row++;

        }
         */
        /*
        //Print Z;
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt() ;
        int count=0;
        for(int i=0;i<n;i++){
            System.out.print("* ");  //* * * * *
        }
        System.out.println();       //

        for(int i=1;i<(n-1);i++){

            for(int j=0;j<n;j++){

                count++;
                if(count%(n-1)==0){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

        for(int i=0;i<n;i++){
            System.out.print("* ");
        }


         */
        /*
        //Prime no till n
        Scanner scn = new Scanner(System.in);

        int smallerNo, largerNo;

        smallerNo = scn.nextInt();
        largerNo = scn.nextInt();

        for (int i = smallerNo; i <= largerNo; i++) {


            String output = isPrime(i);
            if (output == "prime") {

                System.out.println(i);
            }


        }

    }

    private static String isPrime(int number) {
        String output = "prime";

        for (int i = 2; i < number; i++) {

            if ((number % i) == 0) {

                output = "not prime";
                return output;
            }
        }
        return output;
    }

}
        */
        /*
        //rotate a number
        int number=2345891;
        int noToAdd;

        int size=sizeOfNumber(number);
        int rotate=3;

        for(int i=0;i<rotate;i++){

            int reminder=number%10;
            number=number/10;
            noToAdd=multiply(size,reminder);
            number=noToAdd +number;

        }
        System.out.println(number);


    }
    public static int sizeOfNumber(int number){

        int count=0;
        while(number>0){

            count++;
            number=number/10;
        }

        return count;
    }
    public static  int multiply(int size,int reminder){

        int counter=1;
        while(size>1){

            counter=counter*10;
            size--;

        }
        return reminder*counter;

         */

