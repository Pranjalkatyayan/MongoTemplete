package Tree_Practise;

public class JavaCode {
    public static void main(String args[]){

        String S="java2code3";
        String output="";
        int size=S.length();
        for(int i=0;i<size;i++){

            if(S.charAt(i)>=50 && S.charAt(i)<58){
                int no=(int)S.charAt(i);
                no=no-48-1;
                String localoutput=output;
                for(int j=0;j<no;j++){
                    output=output.concat(localoutput);
                }

            }
            else {
                output+=S.charAt(i);
            }
        }
    }
}
