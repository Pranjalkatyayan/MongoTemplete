package Programming_Practise_2;

public class SubsetOfArray {
    public static void main(String[] args){

        int a[]={1,2,3};
        int size=a.length;
        int noOfSubset= (int) Math.pow(2,size);
        System.out.println(noOfSubset);

        for(int i=0;i<noOfSubset;i++){
            String binary=binaryOfNo(i,a);
            System.out.println(binary);
        }
    }

    private static String binaryOfNo(int no,int[] a) {
        String binary="";
        for(int i=a.length-1;i>=0;i--){

            int rem=no%2;
            no=no/2;
            if(rem==0){
                binary= "-\t"+binary;
            }
            else{
                binary=a[i]+"\t"+binary;
            }
        }
        return binary;
    }
}
