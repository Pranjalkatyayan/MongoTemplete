package Programming_Practise;

public class SwapZeros {

    public static  void main(String[] args){

        int nums[]={1,2,0,3};
        int size=nums.length;

        int firstPointer=0;
        int lastPointer=size-1;

        while(firstPointer<size){

            if(nums[firstPointer]==0 && nums[lastPointer]!=0){

                int temp=nums[lastPointer];
                nums[firstPointer]=temp;
                nums[lastPointer]=0;
                lastPointer--;
            }
            firstPointer++;

        }
        for(int i=0;i<size;i++){
            System.out.println(nums[i]);
        }

    }
}
