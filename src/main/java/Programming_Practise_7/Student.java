package Programming_Practise_7;

import com.amazonaws.services.dynamodbv2.xspec.S;

import java.util.HashMap;
import java.util.Map;

public class Student {

    public static void main(String[] args){

        String str="aabddh";
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){

                int value=map.get(str.charAt(i));
                map.put(str.charAt(i),++value);
            }
            else{
                map.put(str.charAt(i),1);
            }
        }
        System.out.println();


    }

}
