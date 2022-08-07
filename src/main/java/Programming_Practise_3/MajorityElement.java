package Programming_Practise_3;

import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {

        int a[]={1,2};
        int majorityElement= (int) Math.ceil((double) a.length/3);
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<a.length;i++){
            int count =0;
            for(int j=0;j<a.length;j++){

                if(a[i]==a[j]){
                    count++;
                }

            }

            if(count>=majorityElement){
                list.add(a[i]);

            }
        }
        System.out.println(list);
    }
}
/*
        int a[]={2,2,1,1,1,2,2};
        int size=a.length/2;
        int frequency=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<size;i++){

            if(map.containsKey(a[i])){
                map.put(a[i],(map.get(a[i])+1));

            }
            else{

                map.put(a[i],frequency++);
            }
        }
        System.out.println(map);
    }
}


 */