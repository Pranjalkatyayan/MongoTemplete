package Tree_Practise;

public class reversethewords {

    public static void main(String[] args) {

        String s="I Love Programming";

        String[] words =s.split(" ");
        for(int i=0;i<words.length;i++){
            String originalword=words[i];
            String revesedWord=reverseIt(originalword);
            System.out.print(revesedWord+" ");
        }
    }

    private static String reverseIt(String originalword) {

        String reversedWord="";
        for(int i=originalword.length()-1;i>=0;i--){
            reversedWord+=originalword.charAt(i);
        }
        return reversedWord;
    }
}
