package Tree_Practise;

import java.util.HashMap;
import java.util.Map;

public class PrintNo {

    public static void main(String[] args){

     Map<Integer,String> map=new HashMap<>();
     map.put(1,"one");
     map.put(2,"two");

     for(Map.Entry<Integer,String> entry:map.entrySet()){
         System.out.println("The key is "+entry.getKey());
         System.out.println("The value is "+entry.getValue());
     }
    }
}
