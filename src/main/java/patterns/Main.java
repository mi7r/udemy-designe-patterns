package patterns;

import patterns.units.Factory;
import patterns.units.Unit;
import patterns.units.UnitFactory;
import patterns.units.UnitType;

public class Main {
    public static void main(String[] args) {

        Factory factory = new UnitFactory();

        Unit tiger = factory.createUnit(UnitType.TANK);
        Unit warrior = factory.createUnit(UnitType.RIFLEMAN);


        System.out.println(tiger);
        System.out.println(warrior);
    }
}
