package Programming_Practise_3;

public class Palandrome {
    public static void main(String[] args){
        String sen = "race a car";
        String output="";
        sen=sen.toLowerCase();
        for(int i=0;i<sen.length();i++){

            if(sen.charAt(i)>=97 && sen.charAt(i)<122){
                output+=(sen.charAt(i));
            }
        }
        boolean ans=checkPalindrome(output);
        System.out.println(ans);

    }

    private static boolean checkPalindrome(String output) {


       String reverse="";
       for (int i=output.length()-1;i>=0;i--){
           reverse+=output.charAt(i);
       }
       if(reverse==output)
           return true;
        return false;
    }
}



