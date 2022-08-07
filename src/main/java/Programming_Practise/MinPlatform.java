package Programming_Practise;

public class MinPlatform {

    public static void main(String[] args) {
        double[] ArrivalTime = {9.15, 9.20, 9.25,9.35,9.40,9.42,9.43,9.47,10.43};
        double[] DepartureTime = {9.30, 9.30, 9.30,9.45,9.50,9.50,9.50,10.45,10.45};
        int minPlatform = 1;

        for (int i = 0; i <ArrivalTime.length-1; i++) {

            minPlatform = minPlatform + incrementPlatform(ArrivalTime[i+1], DepartureTime[i]);
            minPlatform = minPlatform - decrementPlatform(DepartureTime[i], DepartureTime[i+1]);
        }
        System.out.println(minPlatform);
    }

        private static int decrementPlatform(double predeparture,double postdeparture) {

        int size=0;
        if(postdeparture>predeparture){
            size++;

        }

        return size;
    }

        private static int incrementPlatform(double arrivalTime, double departureTime) {

            int size=0;
            if(departureTime>arrivalTime){
                size++;

            }

            return size;
    }

    }


