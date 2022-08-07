package Programming_Practise_4;

public class NonRepeting {
    public static void main(String[] args){
        String str="aabb";
        int count=0;
        char a,b = 0;
       for(int i=0;i<str.length()-1;i++){
            a=str.charAt(i);
           for(int j=i+1;j<str.length();j++) {
               count=0;
               b=str.charAt(j);
               if (a==b) {
                   count = 1;
                   break;
               }

           }
           if(count==0){
             int index=i;
               System.out.println("Non Repeting Character is "+str.charAt(i)+ " index is "+ i);
               break;
           }
       }

    }
}
