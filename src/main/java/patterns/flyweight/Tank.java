package patterns.flyweight;

public class Tank {
    private int x;
    private int y;
    private int hpLeft;
    private UnitStats tankUnitStats;

    public Tank(int x, int y) {
        this.tankUnitStats = UnitStatsRepository.getTankUnitStats();
        this.x = x;
        this.y = y;
        this.hpLeft = tankUnitStats.getHp();
    }
}
