package patterns;

import patterns.car.*;

public class Main {
    public static void main(String[] args) {
        Factory ukFactory = new ContinentalFactory();
        Factory europFacotry = new CommonwealthFactory();

        BMW bmw = europFacotry.createBMW(BMWModel.E36);
        Ford fordUk = ukFactory.createFord(FordModel.TRANSIT);

        BMW bmwUK = ukFactory.createBMW(BMWModel.X5);
        Ford ford = europFacotry.createFord(FordModel.CMAX);

        System.out.println(bmw);
        System.out.println(bmwUK);
        System.out.println(ford);
        System.out.println(fordUk);

    }
}
