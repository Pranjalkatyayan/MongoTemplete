package Programming_Practise_7;

import java.util.Map;
import java.util.TreeMap;

public class Anagram {

    public static void main(String[] args) {

        String s="anagram";
        String t="nagaram";

        Map<Character,Object> map1=new TreeMap<>();
        for(int i=0;i<s.length();i++){
            if(map1.containsKey(s.charAt(i))){
                int index= (int) map1.get(s.charAt(i));
                map1.put(s.charAt(i),++index);
            }
            else{
                map1.put(s.charAt(i),1);
            }
        }
        System.out.println(map1);

        Map<Character,Object> map2=new TreeMap<>();
        for(int i=0;i<t.length();i++){
            if(map2.containsKey(t.charAt(i))){
                int index= (int) map2.get(t.charAt(i));
                map2.put(t.charAt(i),++index);
            }
            else{
                map2.put(t.charAt(i),1);
            }
        }
        System.out.println(map2);
        if(map1.equals(map2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not a Anagram");
        }





    }
}
