package Programming_Practise;

public class RotateAnArray {

    public static void main(String[] args){

        int a[]={1,2,3,4,5};
        int k=2;
        int size=a.length;
        //1st half rotation

        rotate(a,0,size-1-k);
        display(a);

        //2nd half rotation
        rotate(a,size-k,size-1);
        display(a);

        //final rotation
        rotate(a,0,size-1);
        display(a);
    }

    private static void rotate(int[] a, int i, int j) {

        while (j>i){

            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }

    }
    public static void display(int[] a){
        for(int k=0;k<a.length;k++){
            System.out.print(a[k]+" ");
        }
        System.out.println();
    }


}
