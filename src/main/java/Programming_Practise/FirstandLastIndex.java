package Programming_Practise;

public class FirstandLastIndex {

    public static void main(String[] args) throws Exception {

        int array[] = {1,2,4,8,9};
        int noToBeSearched = 97;
        int l=0;
        int r=array.length;

        //Binary Search
       int index= binarySearch(array,l,r,noToBeSearched);
       System.out.println(index);



    }

    private static int binarySearch(int[] array, int l, int r,int noToBeSearched) {

        int mid = (l + (r - l)) / 2;
        System.out.println(mid);
        int index = -1;
        if(r>=l) {



            if (array[mid] == noToBeSearched) {
                index = mid;
            }
            if (noToBeSearched > array[mid]) {
                l = mid + 1;
                binarySearch(array, l, r, noToBeSearched);
            }
            if (noToBeSearched < array[mid]) {
                r = mid - 1;
                binarySearch(array, 0, r, noToBeSearched);
            }
        }
        return index;

    }
}

/*
            //Linear Seach

            int firstIndex=0;
            int lastIndex=0;
            int count=0;
            for(int i=0;i<size;i++){

                if(array[i]==noToBeSearched && count==0){
                    firstIndex=i;
                    lastIndex=i;
                    count++;
                }
                if((array[i]==noToBeSearched) && (count>0)){
                    lastIndex=i;
                }

            }

            System.out.println(firstIndex);
            System.out.println(lastIndex);

        }



 */

