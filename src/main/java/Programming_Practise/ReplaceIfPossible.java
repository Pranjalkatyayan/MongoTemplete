package Programming_Practise;

import java.util.ArrayList;
import java.util.List;

public class ReplaceIfPossible {

    public static void main(String[] agrs){

        int a[]={1,2,2,3};  //Input Given
        int b[]={1,2,3,4};  //1 to N
        List<Integer> list=new ArrayList<>();
        int size=a.length;
        for(int i=0;i<size;i++){

            for(int j=0;j<size;j++){
                if(b[i]==a[j]){
                    b[i]=0;
                    break;
                }
            }
        }
        for(int i=0;i<size;i++){
            if(b[i]!=0){
                list.add(b[i]);
            }
        }

        for(int key: list){
            System.out.println(key);
        }
    }
}
