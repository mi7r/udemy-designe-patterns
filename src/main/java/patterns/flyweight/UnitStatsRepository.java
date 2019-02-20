package patterns.flyweight;

public class UnitStatsRepository {

    private static UnitStats destroyerUnitStats = new UnitStats("destroyer", 700, 500, 70, 25, 900);
    private static UnitStats tankUnitStats = new UnitStats("tank", 500, 250, 100, 35, 1200);
    private static UnitStats riflemanUnitStats = new UnitStats("rifleman", 25, 15, 15, 12, 170);

    public static UnitStats getDestroyerUnitStats() {
        return destroyerUnitStats;
    }

    public static UnitStats getRiflemanUnitStats() {
        return riflemanUnitStats;
    }

    public static UnitStats getTankUnitStats() {
        return tankUnitStats;
    }
}
