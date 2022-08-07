package Programming_Practise_6;

public class Stock2 {
    public static void main(String[] args){

        int a[]={7,1,5,3,6,4};
        int size=a.length;
        int profit;
        int totalProfit;
        int maxProfit=0;
        for(int i=0;i<size-1;i++){
            if(a[i+1]>a[i]){
               totalProfit= getTotalProfit(a,i+1,size);
               System.out.println(totalProfit);
               if(totalProfit>maxProfit){
                   maxProfit=totalProfit;
               }
            }
       }
    }

    private static int getTotalProfit(int[] a, int start, int size) {

        int i=start;
        int profit;
        int totalProfit=0;
        int first =i;
        int secound=i+1;
        while(secound<size){
            if(a[secound]>a[first]){
                profit=a[secound]-a[first];
                totalProfit=totalProfit+profit;
            }
            first=secound;
            secound=secound++;
        }
          return totalProfit;
    }
}
