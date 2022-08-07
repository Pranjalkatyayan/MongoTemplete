package Programming_Practise;

import java.util.ArrayList;
import java.util.List;

public class Duplicate {

    public static void main(String[] args) {

        int a[]={1,2,2,3,3,3};
        int b[]={1,2,2,3,4};
        int count=0;

        List<Integer> output=new ArrayList<>();

        if(b.length>a.length){

            for(int i=0;i<a.length;i++){

                for(int j=0;j<b.length;j++){
                    if(a[i]==b[j] && count<a.length){
                        b[j]=-1;
                        output.add(a[i]);
                        count++;
                        break;

                    }
                }
            }
            for(int i=0;i<output.size();i++){
                System.out.println(output.get(i));
            }

        }
        else {
             for(int i=0;i< b.length;i++){

                for(int j=0;j<a.length;j++){
                    if(b[i]==a[j] && count< b.length){
                        a[j]=-1;
                        output.add(b[i]);
                        count++;
                        break;


                    }
                }
            }
            for(int i=0;i<output.size();i++){
                System.out.println(output.get(i));
            }

        }
    }
}
