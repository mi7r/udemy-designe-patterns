package patterns.units;

abstract public class Factory {
    abstract public InfantryUnit createInfantryUnit(UnitType unitType);

    abstract public MechanizedUnits createMechanizedUnit(UnitType unitType);

    abstract public AirUnit createAirUnit(UnitType unitType);
}
