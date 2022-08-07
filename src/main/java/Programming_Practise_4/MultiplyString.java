package Programming_Practise_4;

public class MultiplyString {
    public static void main(String[] args){
        String num1="498828660196";
        String num2="987654321";
        long c=convertIntoNo(num1);
        long d=convertIntoNo(num2);
        long mul= c*d;
        System.out.println(mul);

    }

    private static long convertIntoNo(String a) {
        long c=0;
        long no=0;
        for(int i=0;i<a.length();i++){
            c=(int)a.charAt(i)-48;
            no=no*10+(c);

        }
        System.out.println(no);
        return no;

    }
}
