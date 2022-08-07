package Programming_Practise_3;

public class Recursion {
    public static void main(String[] args){

        int no=5;
        int factorial=factorial(no);
        System.out.println(factorial);
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
