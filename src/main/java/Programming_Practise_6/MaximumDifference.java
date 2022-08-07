package Programming_Practise_6;

public class MaximumDifference {
    public static void main(String[] args){
        int nums[] = {9,8,7,6};
        int size=nums.length;
        int maximum=-1;
        int diff=-1;

        for(int i=0;i<size-1;i++){
            for(int j=i+1;(j<size && nums[j]>nums[i]) ;j++){

                diff=nums[j]-nums[i];
                if(maximum<diff){
                    maximum=diff;
                }
            }
        }
        System.out.println(maximum);

    }
}
