package Programming_Practise_4;

public class MoveZeros {
    public static void main(String[] agrs){
        int[] nums = {0,0,1};
        int size=nums.length;

        for(int i=0;i<size;i++){
            if(nums[i]==0){
                shiftArray(nums,i);
            }
        }

        for(int i=0;i<size;i++){
            System.out.print(nums[i]+" ");
        }
    }

    private static void shiftArray(int[] nums,int index) {

        for(int i=index+1;i<nums.length;i++){
            nums[i-1]=nums[i];
        }
        nums[nums.length-1]=0;
    }
}
