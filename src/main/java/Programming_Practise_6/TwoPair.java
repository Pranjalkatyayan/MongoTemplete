package Programming_Practise_6;

import org.springframework.data.mongodb.core.aggregation.ArrayOperators;

import java.util.HashSet;
import java.util.Set;

public class TwoPair {
    public static void main(String[] args){

        int a[]={1,2,3,4,5};
        int target=6;
        int noOfPairs=0;

        Set<Integer> set=new HashSet<>();
        for(int i=0;i<5;i++){
            if(set.contains(target-a[i])){
                System.out.println("Sum is Present");
                noOfPairs++;
            }
            set.add(a[i]);
        }
        System.out.println(noOfPairs);
    }
}
