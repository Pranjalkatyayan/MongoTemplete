package Programming_Practise;
public class MainClass {

    public static void main(String[] args) {
        int arr[] = {3,7,6,4,3,0,1,0};
        boolean output = validMountainArray(arr);
        if (output == true) {
            System.out.println("Its a mountain");
        } else {
            System.out.println("Its not a mountain");

        }
    }

    private static boolean validMountainArray(int[] arr) {

        boolean output = false;
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] < arr[i + 1]) {
                continue;
            } else if (arr[i] == arr[i + 1]) {
                return false;
            } else if (arr[i] > arr[i + 1]) {
                if (i == 0) {
                    return false;
                } else {
                    output = checkStrictlyDecreasing(arr, i);

                }
            }
        }

        return output;
    }

    private static boolean checkStrictlyDecreasing(int[] arr,int index) {

        for(int i=index;i<arr.length-1;i++){

            if(arr[i]>arr[i+1]){
                continue;
            }
            else if(i==arr.length){
                return  true;
            }
            else {
                return false;
            }
        };
        return true;
    }


}
/*
    public static boolean validMountainArray(int[] arr) {

        int size=arr.length;
        for(int i=0;i<size-1;i++) {

            if (arr[i] < arr[i + 1]) {
                continue;
            }
            if (arr[i] == arr[i + 1]) {
                return false;
            }
            if (arr[i] > arr[i + 1]) {

                int firstPeak=arr[i];
                int index=i;
               return checkStrictlyDecreasing(arr,firstPeak,index);

            }
        }
        return false;

    }

    private static boolean checkStrictlyDecreasing(int[] arr,int firstPeak,int index) {

        for(int i=index;i<arr.length-1;i++){

            if(arr[i]>arr[i+1]){
                continue;
            }
            else if(i==arr.length){
                return  true;
            }
            else {
                return false;
            }
        };
        return true;
    }

}


 */
/*

        for(int i=0;i<a.length-1;i++){
            int firsttime=a[i];
            for (int j=i+1;j<a.length;j++){

                int secoendtime=a[j];
                if((firsttime*2==secoendtime) || (secoendtime*2==firsttime)){
                    System.out.println("Yes we got"+firsttime+secoendtime);
                }
            }
        }

    }
}

         */
/*
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();

        for(int val: a){
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void rotate(int[] a, int k){


        int noOfRotation=k;
        noOfRotation=noOfRotation%a.length;

        if(noOfRotation>0){ //right rotation
            int count=0;
            while(count<noOfRotation){

                int temp=a[a.length-1];
                for(int i=a.length-2;i>=0;i--){
                    a[i+1]=a[i];
                }
                a[0]=temp;
                count++;
            }

        }
        else{ //left rotation

            int count=0;
            while(count<(noOfRotation * -1)){

                int temp=a[0];
                for(int i=0;i<a.length-1;i++){
                    a[i]=a[i+1];
                }
                a[a.length-1]=temp;
                count++;
            }

        }

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        rotate(a, k);
        display(a);
    }

}

 */