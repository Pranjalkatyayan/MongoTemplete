package Programming_Practise_5;

public class Palindrome {
    public static void main(String[] args){

        String str="";

        int size=str.length();
        int counter=0;
        for(int i=0;i<(size/2);i++){

            if(!(str.charAt(i)==str.charAt(size-i-1))){
                System.out.println("Not a palindromne");
                counter=1;
                return;
            }

        }
        if(counter==0){
            System.out.println("We have got a Palindrome");
        }



    }
}
