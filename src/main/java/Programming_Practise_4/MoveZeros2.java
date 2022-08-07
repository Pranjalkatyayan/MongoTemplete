package Programming_Practise_4;

public class MoveZeros2 {

    public static void main(String[] args){
        int nums[]={0,0,1};
        int x=0;
        int y=0;
        while(nums[x]!=0 && x<nums.length-1) {
            x++;
        }
        y=x+1;
        while(x<nums.length-1 && y<nums.length)
        {
            if(nums[y]!=0)
            {
                nums[x]=nums[y];
                nums[y]=0;
                x++;

            }
            y++;
        }

        for(int i=0;i< nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
}
