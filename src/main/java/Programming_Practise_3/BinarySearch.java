package Programming_Practise_3;

public class BinarySearch {
    public static void main(String[] args){

        int a[]={4,5,7,8,11};
        int l=0;
        int r=a.length-1;
        int find=8;

        int index=binarySearch(a,l,r,find);
        System.out.println("The Index of Find is" + find + index);
    }

    private static int binarySearch(int[] a,int l,int r,int find) {
        int index = -1;
/*
   if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
 */

        if(r>=l){

            int mid=l+(r-l)/2;
            if(a[mid]==find){
             index=mid;
            }
            else if(a[mid]>find){
                l=mid+1;
                return binarySearch(a,l,r,find);
            }
            else{
                r=mid+1;
                return binarySearch(a,l,r,find);
            }

        }
        return index;
    }
}
