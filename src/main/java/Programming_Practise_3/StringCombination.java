package Programming_Practise_3;

public class StringCombination {
    public static void main(String[] args){

        String str="abc";
        int n=str.length();
        int total=factorial(n);
        for(int i=0;i<total;i++){
            StringBuilder sb=new StringBuilder(str);
            int temp=i;
            for(int div=n;div>=1;div--){
                int q=temp/div;
                int r=temp%div;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp=q;
            }
            System.out.println();
        }

    }

    private static int factorial(int no) {
        int factor;
        if(no==1){
            return 1;
        }
        else{
            factor=no*factorial(no-1);
        }
        return factor;
    }
}
