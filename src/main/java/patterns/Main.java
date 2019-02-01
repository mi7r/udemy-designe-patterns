package patterns;

import patterns.units.*;

public class Main {
    public static void main(String[] args) {
        Factory blueFacotry = new BlueFactory();
        Factory redFactory = new RedFactory();

        MechanizedUnits redTank = redFactory.createMechanizedUnit(UnitType.TANK);
        InfantryUnit redInfantry = redFactory.createInfantryUnit(UnitType.RIFLEMAN);
        AirUnit redF16 = redFactory.createAirUnit(UnitType.F16);

        MechanizedUnits blueTank = blueFacotry.createMechanizedUnit(UnitType.TANK);
        InfantryUnit blueInfantry = blueFacotry.createInfantryUnit(UnitType.RIFLEMAN);
        AirUnit blueF16 = blueFacotry.createAirUnit(UnitType.F16);

    }
}
