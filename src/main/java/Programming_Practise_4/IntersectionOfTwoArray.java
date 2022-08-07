package Programming_Practise_4;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoArray {
    public static void main(String[] args){
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        List<Integer> list=new ArrayList<>();
        int maxlenth=nums1.length>nums2.length?nums1.length:nums2.length;
        int minlength=nums1.length<nums2.length?nums1.length:nums2.length;

        System.out.println(maxlenth);
        System.out.println(minlength);

        for(int i=0;i<minlength;i++){
            for (int j=0;j<maxlenth;j++){
                if(nums2[i]==nums1[j]){
                list.add(nums1[i]);
                }
            }
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
