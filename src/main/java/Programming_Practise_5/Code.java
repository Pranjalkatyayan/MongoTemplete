package Programming_Practise_5;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Code {

    public static void main(String[] agrs){
        String sen1="listennn";
        String sen2="sileent";
        int size=sen1.length();
        int size2=sen2.length();

        Map<Character,Integer> map1=new TreeMap<>();
        for(int i=0;i<size;i++){
            char ch=sen1.charAt(i);
            if(map1.containsKey(ch)){
                int value=map1.get(ch);
                map1.put(ch,++value);
            }
            else{
                map1.put(ch,1);
            }
        }
        System.out.println(map1);

        Map<Character,Integer> map2=new TreeMap<>();
        for(int i=0;i<size2;i++){
            char ch2=sen2.charAt(i);
           if( map2.containsKey(ch2)){
                int value=map2.get(ch2);
                map2.put(ch2,++value);
            }
           else{
               map2.put(ch2,1);
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
