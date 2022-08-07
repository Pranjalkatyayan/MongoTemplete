package Programming_Practise_7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int target=6;
//Index Bhi dena ho
        HashMap<Integer,Integer> map=new HashMap<>();
        int noOfIndex=0;
        for(int i=0;i<a.length;i++){
            if(map.get(target-a[i])!=null){
                System.out.println("1st index is "+i);
                System.out.println("2nd index is "+map.get(target-i));
                noOfIndex++;
            }
            map.put(a[i],i);
        }

        //Pata karna ho tho
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<a.length;i++){
            int currentvalue=target-a[i];
            if(set.contains(target-a[i])){
                System.out.println(i);

            }
            set.add(a[i]);
        }


    }
}
