package Programming_Practise_7;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s="cbacdcbc";
        String output="";
        int size=s.length();
        Set<Character> set=new LinkedHashSet<>();
        for(int i=0;i<size;i++){
            set.add(s.charAt(i));
        }

        for(Character entry:set){
            output+=entry;
        }
        System.out.println(output);
    }
}
