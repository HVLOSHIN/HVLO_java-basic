package static2.ex;

public class Car {
    private String name;
    private static int carCount;


    public Car(String name) {
        this.name = name;
        carCount++;

    }

    public static void showTotalCars(){
        System.out.println(carCount);
    }
}
