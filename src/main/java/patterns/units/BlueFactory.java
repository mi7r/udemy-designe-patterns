package patterns.units;

public class BlueFactory extends Factory {
    public InfantryUnit createInfantryUnit(UnitType unitType) {
        switch (unitType) {
            case RIFLEMAN:
                return new Rifleman(100, 0, 10);
            default:
                throw new UnsupportedOperationException("unknown unit type");
        }
    }

    public MechanizedUnits createMechanizedUnit(UnitType unitType) {
        switch (unitType) {
            case TANK:
                return new Tank(1200, 0, 45);
            default:
                throw new UnsupportedOperationException("unknown unit type");
        }
    }

    public AirUnit createAirUnit(UnitType unitType) {
        switch (unitType) {
            case F16:
                return new F16(600, 0, 55);
            default:
                throw new UnsupportedOperationException("unknown unit");
        }
    }
}
