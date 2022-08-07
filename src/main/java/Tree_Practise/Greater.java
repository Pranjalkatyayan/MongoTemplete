package Tree_Practise;

public class Greater {

    public static void main(String[] args){
        int arr[] = {2,3,2,2,3,4};

        //1st Approroach
        //1st -i
        //2nd loop=i+1


        //2nd Approach-2 Pointer

        //firstPointer-i
        //2ndPonter-i+1 -If(A[i+1]>a[i])--> get its index and move the first Pointer

        //Stack--Push the value inside the stack if greater Than a[i];

        //{2,3,2,2,3,4}
        //Stack-->  2 now 3 is greater than so pop 2 and print 3
        //Stack -->  3,2,2,3--> Now you got 4 pop out 3 and print 4
        //Stack --> 2,2,3--> still 4 is greater than 2 ->Pop Out -->print 4
        //Stack -->2,3  -->Still 4 is greater than2-->print 4
        //Stack-->3-->still 3 is greater -->print 4

        //Output is -->3,4,4,4

    }
}
