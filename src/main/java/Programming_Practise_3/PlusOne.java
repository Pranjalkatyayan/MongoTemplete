package Programming_Practise_3;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args){
        int[] digits={1,9,9};
        int carry=0;
        int i=digits.length-1;
        while(i>=0){
            if(i==digits.length-1){
                digits[i]=digits[i]+carry+1;
                if(digits[i]>9){
                    carry=digits[i]/10;
                    digits[i]=digits[i]%10;
                }
            }
            else {
                digits[i]=digits[i]+carry;
                if(digits[i]>9){
                    carry=digits[i]/10;
                    digits[i]=digits[i]%10;
                }
                else{
                    carry=0;
                }
            }

            i--;
        }
        if(carry!=0){
            int output[]=new int[digits.length+1];
            output[0]=carry;
            System.out.print(output[0]);
            for( i=1;i<output.length;i++){
                output[i]=digits[i-1];
                System.out.print(output[i]);
            }

        }
        else {
            for( i=0;i<digits.length;i++){
                System.out.print(digits[i]);
            }
        }

    }
}
