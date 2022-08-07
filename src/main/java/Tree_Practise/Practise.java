package Tree_Practise;

import java.util.Scanner;

public class Practise {

    public static void main(String[] args){

        int length,breadth,lengthOfTraingle;
        double areaOfRec,areaOfTraingle;
        Scanner sc=new Scanner(System.in);
        length= sc.nextInt();
        breadth=sc.nextInt();
        lengthOfTraingle=sc.nextInt();

        areaOfRec=length*breadth;
        areaOfTraingle=(1.732*lengthOfTraingle*lengthOfTraingle)/4;

        int noOfTrainglePossible= (int) (areaOfRec/areaOfTraingle);
        System.out.println("The no of traingles "+noOfTrainglePossible);


        //Area of Rectangle;
        //Area of Traingle
        //diveide rec/traingle=2.3;


        //2nd Approach
        //lengthOfRec=4;
        //breadth of rect=2;
        //lenth of traingle=3;
        





    }
}
