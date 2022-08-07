package Programming_Practise_7;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int a[]={2,0,9,2,9,0,8};
        int size=a.length;
        int firstPointer=0;
        int secoendPointer=1;
        for(int i=0;i<size-1;i++){

            firstPointer=i;
            secoendPointer=i+1;
            if(a[firstPointer]==0 && a[secoendPointer]!=0){
                a[firstPointer]=a[secoendPointer];
                a[secoendPointer]=0;
            }

        }
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
    }
}
