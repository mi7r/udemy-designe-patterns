package patterns.units;

public class RedFactory extends Factory {
    public InfantryUnit createInfantryUnit(UnitType unitType) {
        switch (unitType) {
            case RIFLEMAN:
                return new Rifleman(90, 0, 11);
            default:
                throw new UnsupportedOperationException("unknown unit type");
        }
    }

    public MechanizedUnits createMechanizedUnit(UnitType unitType) {
        switch (unitType) {
            case TANK:
                return new Tank(1100, 0, 49);
            default:
                throw new UnsupportedOperationException("unknown unit type");
        }
    }

    public AirUnit createAirUnit(UnitType unitType) {
        switch (unitType) {
            case F16:
                return new F16(550, 0, 63);
            default:
                throw new UnsupportedOperationException("unknown unit");
        }
    }
}
