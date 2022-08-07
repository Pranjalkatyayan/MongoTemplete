package Programming_Practise_3;

public class MazeTurn {
    public static void main(String[] args) {

        int a[][] = {{0, 0, 1},
                {0, 0, 0},
                {1, 0, 1}};

        int x = 0;
        int y = 0;
        int row = 3;
        int column = 3;
        boolean isClock=true;
        boolean isHorizontal = true;

        while (x>=0 && x < row && y>=0 && y < column) {

            if (isHorizontal) {
                if (a[x][y] == 0) {

                    if(isClock){
                        y++;
                    }
                    else{
                        y--;
                    }
                } else {
                    isHorizontal = false;
                    if(isClock){
                        x++;
                    }
                    else{
                        x--;
                    }
                }
            } else {
                if (a[x][y] == 0) {

                    if(!isClock){
                       x--;
                    }
                    else{
                        x++;
                    }
                } else {
                    isHorizontal = true;
                    if(isHorizontal ){
                        y--;
                        isClock=false;
                    }
                    else{
                        y++;
                    }
                }

            }
        }
        System.out.println("X is " + x);
        System.out.println("Y is " + y);

    }
}
