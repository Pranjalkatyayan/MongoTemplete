package Programming_Practise_2;

public class Program {

    public static void main(String[] args){
        int a[]={1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int count=0;
        int maxCount=0;
        for(int i=0;i<a.length;i++){

        if(a[i]==1){
            count++;

        }
        else{
            maxCount=count;
            count=0;
        }
        }
        if(count>maxCount){
            System.out.println(count);
        }
        else{
            System.out.println(maxCount);
        }
    }

}
