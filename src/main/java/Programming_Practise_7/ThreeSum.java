package Programming_Practise_7;

import com.amazonaws.services.dynamodbv2.xspec.L;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    public static void main(String[] args) {
        int a[]={-1,0,1,2,-1,-4};
        int target=0;
        List<List<Integer>> output=new ArrayList<>();
        for(int i=1;i<a.length-2;i++){
            int twoSumTarget=target-a[i-1];
            List<Integer> triplets=checkThreeSum(twoSumTarget,a,i);
            output.add(triplets);
        }
    }

    private static List checkThreeSum(int twoSumTarget, int[] a, int startIndex) {

        int target = twoSumTarget;
        Set<Integer> set = new HashSet<>();
        for (int i = startIndex; i < a.length; i++) {
            if (set.contains(target - a[i])) {
                List<Integer> triplets=new ArrayList<>();
                triplets.add(a[startIndex - 1]);
                triplets.add(a[i]);
                triplets.add(target - a[i]);
                return triplets;
            }
            set.add(a[i]);
        }
        return null;
    }
}
