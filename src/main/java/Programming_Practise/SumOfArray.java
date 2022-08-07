package Programming_Practise;

public class SumOfArray {
    public static void main(String[] args) {

        int a[] = {7, 2, 3};
        int b[] = { 9, 9, 9, 9};
        int n1=a.length;
        int n2=b.length;
        int carry=0;

        int sum[]=new int[n1>n2 ? n1 : n2];
        int i=n1-1;
        int j=n2-1;
        int k=sum.length-1;


        while(i>=0 || j>=0){

            int digit=carry;
            if(i>=0){
                digit=digit+ a[i];
            }
            if(j>=0){
                digit=digit+b[j];
            }


            carry=digit/10;
            digit=digit%10;
            sum[k]=digit;
            i--;
            k--;
            j--;

        }


        if(carry!=0){
            System.out.println(carry);
        }
        for( i=0;i<sum.length;i++){
            System.out.println(sum[i]);
        }



    }
}
/*
        int sizeOfA=a.length;
        int sizeOfB=b.length;
        int carry=0;

        if(sizeOfA>sizeOfB){

            int counter=b.length-1;
            for(int i=sizeOfA-1;i>=0;i--){

                if(counter>=0){
                    a[i]=a[i]+b[counter];
                }
                a[i]=a[i]+carry;

                if(a[i]>9){
                    carry=a[i]/10;
                    a[i]=a[i]%10;
                }
                counter--;
            }
            for (int i=0;i<sizeOfA;i++){
                System.out.println(a[i]);
            }

        }
        else{
            int counter=a.length-1;
            for(int i=sizeOfB-1;i>=0;i--){

                if(counter>=0){
                    b[i]=b[i]+a[counter];
                }
                b[i]=b[i]+carry;

                if(b[i]>9){
                    carry=b[i]/10;
                    b[i]=b[i]%10;
                }
                counter--;
            }
            for (int i=0;i<sizeOfB;i++){
                System.out.println(b[i]);
            }



        }


    }
}

 */
