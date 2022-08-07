package Programming_Practise;

public class SubtractionOfArray {

    public static void main(String[] args){

        int a[]={9,9,9,0,0};
        int b[]={9,0,1};
        //a-b
        int n1=a.length;
        int n2=b.length;
        int sub[]=new int[n1];
        int borrow=0;
        int j=n2-1;
        for(int i=n1-1;i>=0;i--){

            if(j>=0){
                if(a[i]>=b[j]){
                    sub[i]=a[i]-b[j];

                }
                else{
                    a[i-1]--;
                    a[i]=a[i]+10;
                    sub[i]=a[i]-b[j];
                }
                j--;
            }
            else{
                sub[i]=a[i];
            }

        }
        for(int i=0;i<n1;i++){
            System.out.println(sub[i]);
        }
    }
}
