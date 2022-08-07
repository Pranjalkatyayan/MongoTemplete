package Programming_Practise_3;

import org.springframework.data.mongodb.core.aggregation.ArrayOperators;

import java.util.Map;
import java.util.TreeMap;

public class SingleNumber {
    public  static void main(String[] args){
        int a[]={1,2};
        int size=a.length;
        Map<Integer,Integer> map=new TreeMap<>();

        int count=1;
        for(Integer each:a){
            if(map.containsKey(each)){
                int value=map.get(each);
                map.put(each,++value);
            }
            else{
                map.put(each,count);
            }
        }
        System.out.println(map);

        for (Map.Entry mapElement : map.entrySet()) {
            int key = (int) mapElement.getKey();
            int value = ((int) mapElement.getValue() );
            if(value==1){
                System.out.println(key);
            }
        }

    }
}
