package patterns.flyweight;

public class Destroyer {
    private int x;
    private int y;
    private int hpLeft;
    private UnitStats destroyerUnitStats;

    public Destroyer(int x, int y) {
        this.destroyerUnitStats = UnitStatsRepository.getDestroyerUnitStats();
        this.x = x;
        this.y = y;
        this.hpLeft = destroyerUnitStats.getHp();
    }
}
