package patterns.units;

public class UnitFactory extends Factory {

    public Unit createUnit(UnitType unitType) {

        switch (unitType){
            case TANK:
                return new Tank(2000, 0, 50);
            case RIFLEMAN:
                return new Rifleman(200, 1,15);
            default:
                throw new UnsupportedOperationException("no such unit type");
        }
    }
}
