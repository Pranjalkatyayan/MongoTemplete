package Programming_Practise_2;

public class SubArrayOfArray {

    public static void main(String[] args) {

        int a[] = {10, 20, 30};
        int size = a.length;

        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(a[k]+"\t");
                }
                System.out.println();
            }
        }
    }
}

