package Programming_Practise_3;

public class SubString {
    public static  void  main(String[] args){
        String str="gcjhchchfcjhfcjfjyvkjhffjggghdjgfjyguhxkjgjuhsgejhfgkhjgasdjkhgkjhsagcghavsjdhvjshvhjfgsjhvrjhvjrhfvsjhvjhgvsjbfndvhgvbhgsvdbfvsmbvdjbhvsmhjfgjhbvjhsgjhgfsdhbgsjbdvgshdjhgjdfbgmvdfghvsjhdfjhvgjdrsjhgbjhsgfjhbsgjdnvdjfghvdjhsgvmbhdgvjhsvdgjhsdgvsjhfgvjsdfvgjhsdfhjgvsdjfhvgdfhjsgvjhdsfgvfdgjh";
        StringBuilder sb=new StringBuilder(str);
        int size=str.length();
        for(int i=0;i<size;i++){
            for(int j=1;j<=sb.length();j++){
               String tocheck=sb.substring(0,j);
               boolean isPalendrome=checkPalandrome(tocheck);
               if(isPalendrome==true){
                   System.out.println(tocheck);
               }
            }
            sb.deleteCharAt(0);

        }

    }

    private static boolean checkPalandrome(String Str) {
        String rev="";
        for(int i=Str.length()-1;i>=0;i--){
            rev=rev+Str.charAt(i);
        }
        if(Str.equalsIgnoreCase(rev)){
            return true;
        }
        return false;
    }
}
