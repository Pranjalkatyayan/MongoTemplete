package Programming_Practise_4;

import java.util.Map;
import java.util.TreeMap;

public class NonRepeting2 {
    public static void main(String[] args){
        String s="leetcode";
        Map<Character,Integer> map=new TreeMap<>();

        for(int i=0;i<s.length();i++){
            char key=s.charAt(i);
            if(map.containsKey(key)){
                int value=map.get(key);
                map.put(key,++value);
            }
            else{
                map.put(key,1);
            }
        }
       // System.out.println(map);
       //Travers a map-->For-each loop
        map.forEach((k, v)
                -> System.out.println(k + " : "
                + (v)));

        //

    }
}
