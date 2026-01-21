package gr.aueb.cf.cf9.ch17.lifo_parking;

public class Main {
    public static void main(String[] args) {

        LifoParking parking = new LifoParking();
        parking.addCar("IAE 3456");
        parking.addCar("OFR 9987");
        parking.addCar("FIE3945");


        String car = parking.removeCar();
        System.out.println(car);

        car = parking.removeCar();
        System.out.println(car);

    }
}
