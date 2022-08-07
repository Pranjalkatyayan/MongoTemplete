package Programming_Practise_3;

public class Spaces {
    public static void main(String[] args){
         String s ="    avc ";
         String reverse="";
         for (int i=s.length()-1;i>=0;i--){
             reverse+=s.charAt(i);
         }
         System.out.println(s);
         System.out.println(reverse);
         int i=0;
        int firstindex = 0;
        int lastindex=0;
        while(i<reverse.length() ) {

            if (reverse.charAt(i) != ' ') {
                firstindex = i;
                break;
            }
            i++;
        }
        i=0;
        while(i<reverse.length() ) {
            if (reverse.charAt(i) == ' ' && i >=firstindex){
                lastindex=i;
                break;
            }
        if(firstindex==lastindex  && lastindex!=0){
                lastindex++;
                break;
            }
            if(i==(reverse.length()-1)){
                lastindex=reverse.length();
                break;
            }
            i++;
        }
        int length=(reverse.substring(firstindex,lastindex)).length();
        System.out.println(reverse.substring(firstindex,lastindex));
        System.out.println(length);

    }
}
