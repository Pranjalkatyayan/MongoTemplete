package Programming_Practise_2;

import java.util.ArrayList;
import java.util.List;

public class TwoPointer {
    public static void main(String[] args) {


    }
}
     /*
        int a[]={0,0,1,1,2,2,3,3,4};
        int readPointer;
        int writePointer=1;
        int uniqueElements=1;

        for(readPointer=1;readPointer<a.length;readPointer++){

            if(a[readPointer]!=a[readPointer-1]){
                a[writePointer]=a[readPointer];
                writePointer++;
                uniqueElements++;
            }
        }
        for(int i=0;i<uniqueElements;i++){
            System.out.println(a[i]);
        }

    }
}

       */
    /*
//Move zeros to rigth most but distubed the order

    int a[]={0,0,1,0,2,0,1,0,0};
    int firstPointer=0;
    int lastPointer= a.length-1;

    for(int i=0;i<a.length;i++){

        if(a[firstPointer]==0 && a[lastPointer]!=0 && firstPointer<=lastPointer){
            a[firstPointer]=a[lastPointer];
            a[lastPointer]=0;
            firstPointer++;
            lastPointer--;
        }
        if(a[firstPointer]==0 && a[lastPointer]==0 && firstPointer<=lastPointer){
            lastPointer--;
        }
        if(a[firstPointer]!=0 && a[lastPointer]==0&& firstPointer<=lastPointer){
            firstPointer++;
            lastPointer--;
        }

        if(a[firstPointer]!=0 && a[lastPointer]!=0&& firstPointer<=lastPointer) {
            firstPointer++;
        }
    }


    for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
    }

    }

}

         */
    /*
        int a[]={1,1,2};

        List<Integer> list=new ArrayList<>();
        int uniqueNo=0;
        for(int i=0;i<a.length-1;i++){

            if( a[i]!=a[i+1] ){
                uniqueNo++;
                list.add(a[i]);
            }
        }
        list.add(a[a.length-1]);

       for(int i=0;i< list.size();i++){
           a[i]=list.get(i);
           System.out.println(a[i]);
       }
    }
}


         */
