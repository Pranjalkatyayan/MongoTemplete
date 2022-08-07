package Programming_Practise_3;

public class PhoneNoRearrangement {
    public static void main(String[] args){
        String number="12";
        int size=number.length();
        String phoneNoAfterRemovingAll="";

        for(int i=0;i<size;i++){
            if(number.charAt(i)>='0' && number.charAt(i)<='9'){
                phoneNoAfterRemovingAll+=number.charAt(i);
            }
        }
        System.out.println(phoneNoAfterRemovingAll);

        System.out.println(refactorPhoneNo(phoneNoAfterRemovingAll));

    }

    private static String refactorPhoneNo(String phoneNoAfterRemovingAll) {

        int size=phoneNoAfterRemovingAll.length();
        String output="";
        if(size%3==0){
            int i=0;
            while(i<size){
                output+=phoneNoAfterRemovingAll.substring(i,i+3)+"-";
                 i+=3;
            }
            output=output.substring(0,output.length()-1);
            System.out.println(output);
        }
        if(size%3==1){
            int i=0;
            while (i<size-4){
                output+=phoneNoAfterRemovingAll.substring(i,i+3)+"-";
                i+=3;
            }
            System.out.println(output);
            int j=i;
            while (j<size){
                output+=phoneNoAfterRemovingAll.substring(j,j+2)+"-";
                j+=2;
            }
            output=output.substring(0,output.length()-1);
            System.out.println(output);
        }
        if(size%3==2){
            int i=0;
            while(i<size-2){
                output+=phoneNoAfterRemovingAll.substring(i,i+3)+"-";
                i+=3;
            }
            int j=i;
            while (j<size){
                output+=phoneNoAfterRemovingAll.substring(j,j+2)+"-";
                j+=2;
            }
            output=output.substring(0,output.length()-1);
            System.out.println(output);
        }
        return output;
    }
}

