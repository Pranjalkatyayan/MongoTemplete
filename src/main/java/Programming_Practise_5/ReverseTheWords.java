package Programming_Practise_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ReverseTheWords {
    public static void main(String[] args){

        String sen="I Love Programming";
        Stack<String> stack=new Stack<>();
        String word="";
        //Push into Stack
        for (int i=0;i<sen.length();i++){

            if(sen.charAt(i)==' '){
                stack.push(word);
                word="";
            }
            else{
                word=word+sen.charAt(i);
            }

            if( i==sen.length()-1){
                stack.push(word);
            }
        }
        //Pop from Stack
        String output="";
        int size= stack.size();
        for(int i=0;i<size;i++){
            if(i==size-1){
                output+=stack.pop();
            }
            else{
                output+=stack.pop()+" ";
            }

        }

        System.out.println(output);

        Map<String,String> map=new HashMap<>();
        map.put("1","One");

        map.forEach(
                (key, value)
                        -> System.out.println(key + " = " + value));

        map.forEach(
                (key, value)->System.out.println(key + "=" + value ));

        for(Map.Entry<String,String> set: map.entrySet()){
            System.out.println(set.getKey() + " - "+ set.getValue());
        }


    }
}
