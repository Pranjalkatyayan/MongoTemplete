package Programming_Practise_6;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class Car extends Thread{
    public static void main(String[] args){

        Car car=new Car();
        try{
           long id= car.getId();
           car.setPriority(2);
           System.out.println("The id " +id+" Priority is "+car.getPriority());
           System.out.println("Car is running "+Thread.currentThread());
        }
        catch (Exception exception){
            System.out.println("Car has stopped");
        }
        CompletableFuture.runAsync(() -> {
            Car car2=new Car();
            long id= car2.getId();
            System.out.println("The id " +id+" Priority is "+car2.getPriority());
            System.out.println("Car is running "+car2.currentThread());


        });
        Car car3=new Car();
        long id= car3.getId();
        System.out.println("The id " +id+" Priority is "+car3.getPriority());
        System.out.println("Car is running "+car3.currentThread());

     


    }
}
