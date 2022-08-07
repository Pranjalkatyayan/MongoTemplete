package Programming_Practise_7;

import java.util.ArrayList;
import java.util.List;

public class RearrangeTheNo {
    public static void main(String[] args) {
        int no[]={-9, 4, -2, 6, -8};
        List<Integer> postiveNo=new ArrayList<>();
        List<Integer> negativeNo=new ArrayList<>();
        int size=no.length;
        for(int i=0;i<size;i++){
            if(no[i]>=0){
                postiveNo.add(no[i]);
            }
            else{
                negativeNo.add(no[i]);
            }
        }
        int output[]=new int[size];
        for(int i=0;i<size;i=i+2){
            if(postiveNo.size()>0){
                output[i]=postiveNo.get(0);
                postiveNo.remove(0);
            }
            if(postiveNo.size()==0){
                output[i]=negativeNo.get(0);
            }
            else if(negativeNo.size()>0){
                output[i+1]=negativeNo.get(0);
                negativeNo.remove(0);
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(output[i]+ " ");
        }
    }
}
