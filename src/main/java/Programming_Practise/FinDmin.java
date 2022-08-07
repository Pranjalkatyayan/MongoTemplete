package Programming_Practise;

public class FinDmin {

    public static void main(String[] args){

        int a[]={2,1,4,0,-1};
        int min=a[0];
        for(int i=0;i<a.length-1;i++){

            if(a[i+1]<min){
                min=a[i+1];
            }
        }
        System.out.println(min);
    }
}
