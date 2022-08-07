package Programming_Practise_4;

import java.util.Set;
import java.util.TreeSet;

public class MissingElement {
    public static void main(String[] args){
        int nums[]={3,0,1};
        Set<Integer> set=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        Integer[] sortedArray = (Integer[]) set.toArray();
        for(int i=0;i< sortedArray.length-1;i++){
            if((sortedArray[i+1]-sortedArray[i])>1){
              System.out.println(sortedArray[i]+1);
            }
        }


    }
}
