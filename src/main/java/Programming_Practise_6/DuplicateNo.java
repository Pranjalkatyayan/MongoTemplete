package Programming_Practise_6;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNo {
    public static void main(String[] args){
        int a[]={1,2,3,4,5,1};
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        int output[]=new int[set.size()];
        int i=0;
        for(Integer entry:set){
          output[i]=entry;
          i++;
       }
        for( i=0;i<output.length;i++){
            System.out.print(output[i]+" ");
        }

    }
}
