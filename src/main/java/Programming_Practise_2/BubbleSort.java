package Programming_Practise_2;

public class BubbleSort {
    public static void main(String[] args){

        int a[]={4,5,7,8};
        int size=a.length;
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-1-i;j++){

                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");

        }

    }
}
