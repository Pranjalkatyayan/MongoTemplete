package Programming_Practise_6;

public class Stocks {

    public static void main(String[] args){

        int a[]={7,1,5,3,6,4};
        int size=a.length;
        int maxProfit=0;
        int profit=0;
        for(int i=0;i<size-1;i++){
            for(int j=i+1;(j<size && a[i]<a[j]) ;j++){
                profit=a[j]-a[i];
                if(maxProfit<profit){
                    maxProfit=profit;
                }
            }
        }
        System.out.println(maxProfit);

    }
}
