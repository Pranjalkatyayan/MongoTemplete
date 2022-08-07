package Programming_Practise_2;

public class GreatestElementOnRight {
    public static void main(String[] args){

        int a[]={56903,18666,60499,57517,26961};
        int size=a.length;
        int output[]=new int[size];
        output[size-1]=-1;


        for(int i=0;i<size;i++){

         output[i]= getMaximumFromRemainingArray(a,i+1,size);
        }

    }

    private static int getMaximumFromRemainingArray(int[] a, int statingIndex, int size) {

        int max=a[statingIndex];
        for (int i=statingIndex;i<size;i++){

            if(max<a[i]){
                max=a[i];
            }
        }
        return max;
    }
}
