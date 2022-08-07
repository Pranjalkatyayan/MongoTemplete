package Programming_Practise_6;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWords {
    public static void main(String[] args){
        String sen="One two two";
        String[] array=sen.split(" ");


        System.out.println("I am inside");
        for(int i=0;i<array.length;i++){

            System.out.print(array[i]+" ");
            System.out.println();
        }
        System.out.println("I am outside");

        Set<String> set=new HashSet<>();
        for(int i=0;i<array.length;i++){
            set.add(array[i]);
        }
        for(String entry:set){
            System.out.print(entry+" ");
        }

    }
}
